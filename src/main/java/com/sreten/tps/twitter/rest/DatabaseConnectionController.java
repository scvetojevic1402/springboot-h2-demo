package com.sreten.tps.twitter.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sreten.tps.twitter.jpa.DatabaseConnectionService;
import com.sreten.tps.twitter.jpa.PlaceService;
import com.sreten.tps.twitter.model.DatabaseConnection;
import com.sreten.tps.twitter.model.Place;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.geotools.geojson.geom.GeometryJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.System.out;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DatabaseConnectionController {
	
	
	@Autowired
	private DatabaseConnectionService databaseconnectionservice;
	
	@RequestMapping("/databaseconnection")
	public List<DatabaseConnection> getAllDatabaseConnections() {
		return databaseconnectionservice.getAllDatabaseConnections();
	}
	
	@RequestMapping("/databaseconnection/{foo}")
	public Optional<DatabaseConnection> getDatabaseConnection(@PathVariable("foo") String id) {
		return databaseconnectionservice.getDatabaseConnection(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/databaseconnection")
	public String addDatabaseConnection(@RequestBody DatabaseConnection databaseconnection) throws SQLException, JsonProcessingException, IOException, InterruptedException {
		try{
                    databaseconnectionservice.addDatabaseConnection(databaseconnection);
                }catch(Exception e){
                    System.out.print("Database connection already added!");
                }
                
//		https://stackoverflow.com/questions/3324717/sending-http-post-request-in-java
                 try {
                        String url = "jdbc:"+databaseconnection.getDatabasetype()+"://"+
                                             databaseconnection.getHostname()+":"+
                                             databaseconnection.getPort()+"/"+
                                             databaseconnection.getDatabase();
                        System.out.println(url);
                        Connection conn = DriverManager.getConnection(url, databaseconnection.getUsername(), databaseconnection.getPassword());
                        Statement stmt = conn.createStatement();
                        ResultSet rs;

                        rs = stmt.executeQuery(databaseconnection.getQuery());
                        while ( rs.next() ) {
                            String tweet = rs.getString("tweet");
//                            System.out.println(tweet);

                            URL tweetsPostUrl = new URL("http://localhost:8080/tweets");
                            URLConnection con = tweetsPostUrl.openConnection();
                            HttpURLConnection http = (HttpURLConnection)con;
                            http.setRequestMethod("POST"); // PUT is another valid option
                            http.setDoOutput(true);
        
                            byte[] out = tweet.getBytes(StandardCharsets.UTF_8);
                            int length = out.length;

                            http.setFixedLengthStreamingMode(length);
                            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                            http.connect();
                            try(OutputStream os = http.getOutputStream()) {
                                System.out.print(out);
                                os.write(out);
                            }
        
                        }
                        conn.close();
                    } catch (Exception e) {
                        System.err.println("Got an exception! ");
                        System.err.println(e.getMessage());
                    }
                 
		return "redirect:/";
	}
}

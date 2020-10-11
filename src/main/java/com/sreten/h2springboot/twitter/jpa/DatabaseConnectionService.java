package com.sreten.h2springboot.twitter.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreten.h2springboot.twitter.crud.UserRepository;
import com.sreten.h2springboot.twitter.model.DatabaseConnection;
import com.sreten.h2springboot.twitter.model.User;
import com.sreten.h2springboot.twitter.crud.DatabaseConnectionRepository;

@Service
public class DatabaseConnectionService {
	
	
	@Autowired
	private DatabaseConnectionRepository databaseconnectionRepository;
	
	public List<DatabaseConnection> getAllDatabaseConnections(){
		List<DatabaseConnection> databaseconnections = new ArrayList();
		databaseconnectionRepository.findAll()
		.forEach(databaseconnections::add);
		
		return databaseconnections;
	}
	
	public Optional<DatabaseConnection> getDatabaseConnection(String id) {
		return databaseconnectionRepository.findById(id);
	}

	public void addDatabaseConnection(DatabaseConnection databaseconnection) {
		databaseconnectionRepository.save(databaseconnection);
		
	}

	public void updateUser(String id, DatabaseConnection databaseconnection) {
		databaseconnectionRepository.save(databaseconnection);
	}

	public void deleteDatabaseConnection(String id) {
		databaseconnectionRepository.deleteById(id);
		
	}
}

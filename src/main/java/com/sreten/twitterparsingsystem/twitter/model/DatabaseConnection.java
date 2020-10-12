package com.sreten.twitterparsingsystem.twitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity(name = "DatabaseConnection")

//https://stackoverflow.com/questions/42821854/unique-key-constraint-in-spring-data-jpa
@Table(name = "databaseconnection", uniqueConstraints={
          @UniqueConstraint( name = "idx_hostname_port_username_databasetype_query",  
                              columnNames ={"hostname","port","username","databasetype","query"})
       })
public class DatabaseConnection {

		@Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column
        private String hostname;
        @Column
        private String port;
        @Column
        private String username;
        @Column
        private String password;
        @Column
        private String database;
        @Column
        private String databasetype;
        @Column
        private String query;

        public DatabaseConnection() {
        }

        public DatabaseConnection(String hostname, String port, String username, String password, String database, String databasetype, String query) {

            this.hostname = hostname;
            this.port = port;
            this.username = username;
            this.password = password;
            this.database = database;
            this.databasetype = databasetype;
            this.query = query;
	}

        public String getHostname() {
                return hostname;
        }

        public void setHostname(String hostname) {
                this.hostname = hostname;
        }

        public String getPort() {
                return port;
        }

        public void setPort(String port) {
                this.port = port;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getDatabase() {
                return database;
        }

        public void setDatabase(String database) {
                this.database = database;
        }

        public String getDatabasetype() {
                return databasetype;
        }

        public void setDatabasetype(String databasetype) {
                this.databasetype = databasetype;
        }

        public String getQuery() {
                return query;
        }

        public void setQuery(String query) {
                this.query = query;
        }

}

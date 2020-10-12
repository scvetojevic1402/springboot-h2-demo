package com.sreten.twitterparsingsystem.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.twitterparsingsystem.twitter.model.DatabaseConnection;

public interface DatabaseConnectionRepository extends CrudRepository<DatabaseConnection, String>{

}

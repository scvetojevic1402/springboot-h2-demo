package com.sreten.h2springboot.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.h2springboot.twitter.model.DatabaseConnection;

public interface DatabaseConnectionRepository extends CrudRepository<DatabaseConnection, String>{

}

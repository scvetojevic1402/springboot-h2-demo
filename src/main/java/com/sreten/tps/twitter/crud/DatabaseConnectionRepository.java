package com.sreten.tps.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.tps.twitter.model.DatabaseConnection;

public interface DatabaseConnectionRepository extends CrudRepository<DatabaseConnection, String>{

}

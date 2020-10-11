package com.sreten.tps.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.tps.twitter.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

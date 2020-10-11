package com.sreten.h2springboot.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.h2springboot.twitter.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

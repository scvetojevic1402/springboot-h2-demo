package com.sreten.twitterparsingsystem.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.twitterparsingsystem.twitter.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

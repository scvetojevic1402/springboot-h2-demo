package com.sreten.h2springboot.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.h2springboot.twitter.model.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, String>{

}

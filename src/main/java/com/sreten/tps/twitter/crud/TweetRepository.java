package com.sreten.tps.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.tps.twitter.model.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, String>{

}

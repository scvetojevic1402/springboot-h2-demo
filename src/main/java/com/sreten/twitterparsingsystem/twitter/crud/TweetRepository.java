package com.sreten.twitterparsingsystem.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.twitterparsingsystem.twitter.model.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, String>{

}

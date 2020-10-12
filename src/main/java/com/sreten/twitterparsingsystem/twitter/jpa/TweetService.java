package com.sreten.twitterparsingsystem.twitter.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreten.twitterparsingsystem.twitter.crud.PlaceRepository;
import com.sreten.twitterparsingsystem.twitter.crud.TweetRepository;
import com.sreten.twitterparsingsystem.twitter.crud.UserRepository;
import com.sreten.twitterparsingsystem.twitter.model.Place;
import com.sreten.twitterparsingsystem.twitter.model.Tweet;
import com.sreten.twitterparsingsystem.twitter.model.User;

@Service
public class TweetService {
	
	
	@Autowired
	private TweetRepository tweetRepository;
	
	@Autowired
	private PlaceRepository placeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Tweet> getAllTweets(){
		List<Tweet> tweets = new ArrayList();
		tweetRepository.findAll()
		.forEach(tweets::add);
		
		return tweets;
	}
	
	public Optional<Tweet> getTweet(String id) {
		//return tweets.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return tweetRepository.findById(id);
	}

//	public void addTweet(Tweet tweet, Place place, User user) {
	public void addTweet(Tweet tweet) {
		tweetRepository.save(tweet);
//		placeRepository.save(place);
//		userRepository.save(user);		
	}

	public void updateTweet(String id, Tweet tweet) {
		tweetRepository.save(tweet);
	}

	public void deleteTweet(String id) {
//		tweets.removeIf(t -> t.getId().equals(id));
		tweetRepository.deleteById(id);
		
	}
}

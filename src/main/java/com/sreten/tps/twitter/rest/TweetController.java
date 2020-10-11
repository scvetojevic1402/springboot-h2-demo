package com.sreten.tps.twitter.rest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sreten.tps.twitter.jpa.PlaceService;
import com.sreten.tps.twitter.jpa.TweetService;
import com.sreten.tps.twitter.jpa.UserService;
import com.sreten.tps.twitter.model.Place;
import com.sreten.tps.twitter.model.Tweet;
import com.sreten.tps.twitter.model.User;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TweetController {
	
	
	@Autowired
	private TweetService tweetService;
	@Autowired
	private UserService userService;
	@Autowired
	private PlaceService placeService;
	
	@RequestMapping("/tweets")
	public List<Tweet> getAllTweets() {
		return tweetService.getAllTweets();
	}
	
	@PostMapping(value = "/tweets", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void doSomething(@RequestBody Map<String, Object> payload) {
		
		ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
		User user = mapper.convertValue(payload.get("user"), User.class);
		Place place = mapper.convertValue(payload.get("place"), Place.class);
		Tweet tweet = mapper.convertValue(payload, Tweet.class);
		
		userService.addUser(user);
		placeService.addPlace(place);
		
		userService.getUser(user.getId()).map(userFound -> {
			tweet.setUser(userFound);
			return "Ok";
		});
		
		placeService.getPlace(place.getId()).map(placeFound -> {
			tweet.setPlace(placeFound);
			return "Ok";
		});
		
		tweetService.addTweet(tweet);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tweets/{id}")
	public void updateTweet(@RequestBody Tweet tweet, @PathVariable String id) {
		tweetService.updateTweet(id, tweet);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tweets/{id}")
	public void deleteTweet(@PathVariable String id) {
		tweetService.deleteTweet(id);
	}
}

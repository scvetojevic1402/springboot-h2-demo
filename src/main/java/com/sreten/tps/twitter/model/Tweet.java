package com.sreten.tps.twitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name="Tweet")
@Table(name = "tweet")
public class Tweet {

//	this needs to be done in h2 db:
//	alter table user alter column id type bigint

//	HANDLING INCOMING JSON IN GETTER/SETTER AND STORING IT AS A VARCHAR:
	
//	public JSONObject getCoordinates() throws ParseException {
//	    JSONParser parser = new JSONParser(); 
//	    JSONObject json = (JSONObject) parser.parse(coordinates);
//		return json;
//  }
//
//  public void setCoordinates(JSONObject coordinates) {
//		this.coordinates = coordinates.toString();
//  }
	@Id
	private Long id;
	@Column private String lang;
	@Column private String text;
	@Column private String id_str;
	@Column private String source;
	@Column (length=5000) private String entities;
	@Column private String favorited;
	@Column private String retweeted;
	@Column private String truncated;
	@Column private String created_at;
	@Column private String coordinates;
	@Column private String quote_count;
	@Column private String reply_count;
	@Column private String contributors;
	@Column private String filter_level;
	@Column private String timestamp_ms;
	@Column private String retweet_count;
	@Column (length=5000) private String extended_tweet;
	@Column private String favorite_count;
	@Column private String is_quote_status;
	@Column private String possibly_sensitive;
	@Column private String in_reply_to_user_id;
	@Column private String in_reply_to_status_id;
	@Column private String in_reply_to_screen_name;
	@Column private String in_reply_to_user_id_str;
	@Column private String in_reply_to_status_id_str;

	

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "place_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Place place;
	
//  an empty constructor - all we need
	public Tweet() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public JSONObject getEntities() throws ParseException {
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(entities);
		
		return json;
	}
	
	public void setEntities(JSONObject entities) {
		this.entities = entities.toString();
	}

	public String getFavorited() {
		return favorited;
	}

	public void setFavorited(String favorited) {
		this.favorited = favorited;
	}

	public String getRetweeted() {
		return retweeted;
	}

	public void setRetweeted(String retweeted) {
		this.retweeted = retweeted;
	}

	public String getTruncated() {
		return truncated;
	}

	public void setTruncated(String truncated) {
		this.truncated = truncated;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public JSONObject getCoordinates() throws ParseException {
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(coordinates);
		
		return json;
	}
	
	public void setCoordinates(JSONObject coordinates) {
		this.coordinates = coordinates.toString();
	}

	public String getQuote_count() {
		return quote_count;
	}

	public void setQuote_count(String quote_count) {
		this.quote_count = quote_count;
	}

	public String getReply_count() {
		return reply_count;
	}

	public void setReply_count(String reply_count) {
		this.reply_count = reply_count;
	}

	public String getContributors() {
		return contributors;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}

	public String getFilter_level() {
		return filter_level;
	}

	public void setFilter_level(String filter_level) {
		this.filter_level = filter_level;
	}

	public String getTimestamp_ms() {
		return timestamp_ms;
	}

	public void setTimestamp_ms(String timestamp_ms) {
		this.timestamp_ms = timestamp_ms;
	}

	public String getRetweet_count() {
		return retweet_count;
	}

	public void setRetweet_count(String retweet_count) {
		this.retweet_count = retweet_count;
	}

	public JSONObject getExtended_tweet() throws ParseException {
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(extended_tweet);
		
		return json;
	}
	
	public void setExtended_tweet(JSONObject extended_tweet) {
		this.extended_tweet = extended_tweet.toString();
	}

	public String getFavorite_count() {
		return favorite_count;
	}

	public void setFavorite_count(String favorite_count) {
		this.favorite_count = favorite_count;
	}

	public String getIs_quote_status() {
		return is_quote_status;
	}

	public void setIs_quote_status(String is_quote_status) {
		this.is_quote_status = is_quote_status;
	}

	public String getPossibly_sensitive() {
		return possibly_sensitive;
	}

	public void setPossibly_sensitive(String possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}

	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}

	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}

	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}

	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}

	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}

	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}

	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}

	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}

	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}

	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

}
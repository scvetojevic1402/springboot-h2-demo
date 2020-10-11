package com.sreten.h2springboot.twitter.model;

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


@Entity(name="Tweets")
@Table(name = "tweets")
public class Tweet {

//	this needs to be done in h2 db:
//	alter table user alter column id type bigint
	@Id
	private Long id;
	@Column
	private String lang;
	@Column
	private String text;
	@Column
	private String source; 
	@Column
	private String created_at;
	@Column
	private String coordinates;
	

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
	
	public Tweet() {
	}

	public Tweet(Long id, String lang, String text, String source, String created_at, String coordinates,
			com.sreten.h2springboot.twitter.model.User user, Place place) {
		super();
		this.id = id;
		this.lang = lang;
		this.text = text;
		this.source = source;
		this.created_at = created_at;
		this.coordinates = coordinates;
		this.user = user;
		this.place = place;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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


//	public JSONObject getCoordinates() throws ParseException {
//		JSONParser parser = new JSONParser(); 
//		JSONObject json = (JSONObject) parser.parse(coordinates);
//		
//		return json;
//	}
//
//	public void setCoordinates(JSONObject coordinates) {
//		this.coordinates = coordinates.toString();
//	}


}
package com.sreten.twitterparsingsystem.twitter.model;

import javax.persistence.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@Entity(name = "Place")
@Table(name = "place")
public class Place {

	@Id private String id;
	@Column private String url;
	@Column	private String name; 
	@Column private String country;
	@Column	private String full_name;
	@Column private String attributes;
	@Column	private String place_type;
	@Column private String bounding_box;
	@Column	private String country_code;
	
//  an empty constructor - all we need
	public Place() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public JSONObject getAttributes() throws ParseException {
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(attributes);
		
		return json;
	}
	
	public void setAttributes(JSONObject attributes) {
		this.attributes = attributes.toString();
	}

	public String getPlace_type() {
		return place_type;
	}

	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}

	public JSONObject getBounding_box() throws ParseException {
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(bounding_box);
		
		return json;
	}
	
	public void setBounding_box(JSONObject bounding_box) {
		this.bounding_box = bounding_box.toString();
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

}

//USER:
//{
//		"id": 898228175225933825,
//		"url": "https://soundcloud.com/user-88968907-488189205",
//		"lang": "null",
//		"name": "IOH",
//		"location": "Upsilon",
//		"created_at": "Thu Aug 17 17:01:00 +0000 2017",
//		"description": "Bedroom Producer ~ i tweet and retweet nonsense..",
//		"screen_name": "Meek_drills"
//	}
//PLACE:
//{
//	"id": "15",
//	"url": "https://api.twitter.com/1.1/geo/id/00e55e2b4c491c5f.json",
//	"name": "Abuja",
//	"country": "Nigeria",
//	"full_name": "Abuja, Nigeria",
//	"attributes": {},
//	"place_type": "city",
//	"bounding_box": {
//		"type": "Polygon",
//		"coordinates": [
//			[
//				[7.304554, 8.961887],
//				[7.304554, 9.185441],
//				[7.543634, 9.185441],
//				[7.543634, 8.961887]
//			]
//		]
//	},
//	"country_code": "NG"
//}
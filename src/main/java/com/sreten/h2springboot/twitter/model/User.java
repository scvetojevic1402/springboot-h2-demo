package com.sreten.h2springboot.twitter.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="User")
@Table(name = "user")
public class User {

//	this needs to be done in h2 db:
//	alter table user alter column id type bigint
	@Id
	private Long id;
	@Column
	private String id_str;
	@Column
	private String url;
	@Column
	private String lang;
	@Column
	private String name; 
	@Column
	private Boolean verified;
	@Column
	private String location;
	@Column
	private String created_at;
	@Column
	private String description;
	@Column
	private String screen_name;
        
//        @OneToMany(mappedBy="user")
//        private Set<Tweet> tweets;
	
	public User() {
	}

	public User(Long id, String id_str, String url, String lang, String name, Boolean verified, String location,
			String created_at, String description, String screen_name) {
		super();
		this.id = id;
		this.id_str = id_str;
		this.url = url;
		this.lang = lang;
		this.name = name;
		this.verified = verified;
		this.location = location;
		this.created_at = created_at;
		this.description = description;
		this.screen_name = screen_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

}

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

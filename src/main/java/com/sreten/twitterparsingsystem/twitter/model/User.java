package com.sreten.twitterparsingsystem.twitter.model;

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
	@Id private Long id;
	@Column private String url;
	@Column private String lang;
	@Column private String name;
	@Column private String id_str;
	@Column private String location;
	@Column private String verified;
	@Column private String following;
	@Column private String time_zone;
	@Column private String created_at;
	@Column private String utc_offset;
	@Column private String description;
	@Column private String geo_enabled;
	@Column private String screen_name;
	@Column private String listed_count;
	@Column private String friends_count;
	@Column private String is_translator;
	@Column private String notifications;
	@Column private String statuses_count;
	@Column private String default_profile;
	@Column private String followers_count;
	@Column private String translator_type;
	@Column private String favourites_count;
	@Column private String profile_image_url;
	@Column private String profile_banner_url;
	@Column private String profile_link_color;
	@Column private String profile_text_color;
	@Column private String follow_request_sent;
	@Column private String contributors_enabled;
	@Column private String default_profile_image;
	@Column private String profile_background_tile;
	@Column private String profile_image_url_https;
	@Column private String profile_background_color;
	@Column private String profile_sidebar_fill_color;
	@Column private String profile_background_image_url;
	@Column private String profile_sidebar_border_color;
	@Column private String profile_use_background_image;
	@Column private String profile_background_image_url_https;

//  an empty constructor - all we need	
	public User() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getId_str() {
		return id_str;
	}


	public void setId_str(String id_str) {
		this.id_str = id_str;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getVerified() {
		return verified;
	}


	public void setVerified(String verified) {
		this.verified = verified;
	}


	public String getFollowing() {
		return following;
	}


	public void setFollowing(String following) {
		this.following = following;
	}


	public String getTime_zone() {
		return time_zone;
	}


	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getUtc_offset() {
		return utc_offset;
	}


	public void setUtc_offset(String utc_offset) {
		this.utc_offset = utc_offset;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getGeo_enabled() {
		return geo_enabled;
	}


	public void setGeo_enabled(String geo_enabled) {
		this.geo_enabled = geo_enabled;
	}


	public String getScreen_name() {
		return screen_name;
	}


	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}


	public String getListed_count() {
		return listed_count;
	}


	public void setListed_count(String listed_count) {
		this.listed_count = listed_count;
	}


	public String getFriends_count() {
		return friends_count;
	}


	public void setFriends_count(String friends_count) {
		this.friends_count = friends_count;
	}


	public String getIs_translator() {
		return is_translator;
	}


	public void setIs_translator(String is_translator) {
		this.is_translator = is_translator;
	}


	public String getNotifications() {
		return notifications;
	}


	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}


	public String getStatuses_count() {
		return statuses_count;
	}


	public void setStatuses_count(String statuses_count) {
		this.statuses_count = statuses_count;
	}


	public String getDefault_profile() {
		return default_profile;
	}


	public void setDefault_profile(String default_profile) {
		this.default_profile = default_profile;
	}


	public String getFollowers_count() {
		return followers_count;
	}


	public void setFollowers_count(String followers_count) {
		this.followers_count = followers_count;
	}


	public String getTranslator_type() {
		return translator_type;
	}


	public void setTranslator_type(String translator_type) {
		this.translator_type = translator_type;
	}


	public String getFavourites_count() {
		return favourites_count;
	}


	public void setFavourites_count(String favourites_count) {
		this.favourites_count = favourites_count;
	}


	public String getProfile_image_url() {
		return profile_image_url;
	}


	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}


	public String getProfile_banner_url() {
		return profile_banner_url;
	}


	public void setProfile_banner_url(String profile_banner_url) {
		this.profile_banner_url = profile_banner_url;
	}


	public String getProfile_link_color() {
		return profile_link_color;
	}


	public void setProfile_link_color(String profile_link_color) {
		this.profile_link_color = profile_link_color;
	}


	public String getProfile_text_color() {
		return profile_text_color;
	}


	public void setProfile_text_color(String profile_text_color) {
		this.profile_text_color = profile_text_color;
	}


	public String getFollow_request_sent() {
		return follow_request_sent;
	}


	public void setFollow_request_sent(String follow_request_sent) {
		this.follow_request_sent = follow_request_sent;
	}


	public String getContributors_enabled() {
		return contributors_enabled;
	}


	public void setContributors_enabled(String contributors_enabled) {
		this.contributors_enabled = contributors_enabled;
	}


	public String getDefault_profile_image() {
		return default_profile_image;
	}


	public void setDefault_profile_image(String default_profile_image) {
		this.default_profile_image = default_profile_image;
	}


	public String getProfile_background_tile() {
		return profile_background_tile;
	}


	public void setProfile_background_tile(String profile_background_tile) {
		this.profile_background_tile = profile_background_tile;
	}


	public String getProfile_image_url_https() {
		return profile_image_url_https;
	}


	public void setProfile_image_url_https(String profile_image_url_https) {
		this.profile_image_url_https = profile_image_url_https;
	}


	public String getProfile_background_color() {
		return profile_background_color;
	}


	public void setProfile_background_color(String profile_background_color) {
		this.profile_background_color = profile_background_color;
	}


	public String getProfile_sidebar_fill_color() {
		return profile_sidebar_fill_color;
	}


	public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
		this.profile_sidebar_fill_color = profile_sidebar_fill_color;
	}


	public String getProfile_background_image_url() {
		return profile_background_image_url;
	}


	public void setProfile_background_image_url(String profile_background_image_url) {
		this.profile_background_image_url = profile_background_image_url;
	}


	public String getProfile_sidebar_border_color() {
		return profile_sidebar_border_color;
	}


	public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
		this.profile_sidebar_border_color = profile_sidebar_border_color;
	}


	public String getProfile_use_background_image() {
		return profile_use_background_image;
	}


	public void setProfile_use_background_image(String profile_use_background_image) {
		this.profile_use_background_image = profile_use_background_image;
	}


	public String getProfile_background_image_url_https() {
		return profile_background_image_url_https;
	}


	public void setProfile_background_image_url_https(String profile_background_image_url_https) {
		this.profile_background_image_url_https = profile_background_image_url_https;
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

package com.sreten.h2springboot.feedback;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String type;
	@Column
	private String description; 
	@Column
	private Double phoneLat;
	@Column
	private Double phoneLon;
	@Column
	private String insertTime;
	@Column
	private String imagePath;
	@Column
	private String phoneIP;
	@Column
	private String phoneManufacturer;
	@Column
	private String phoneOS;
	@Column
	private String phoneOSVersion;
	@Column
	private String tags;
	@Column
	private String dataJson;
	
	
	public Feedback() {
	}
	
	public Feedback(String type, String description, Double phoneLat, Double phoneLon, String insertTime,
			String imagePath, String phoneIP, String phoneManufacturer, String phoneOS, String phoneOSVersion,
			String tags, String dataJson) {
		super();
		this.type = type;
		this.description = description;
		this.phoneLat = phoneLat;
		this.phoneLon = phoneLon;
		this.insertTime = insertTime;
		this.imagePath = imagePath;
		this.phoneIP = phoneIP;
		this.phoneManufacturer = phoneManufacturer;
		this.phoneOS = phoneOS;
		this.phoneOSVersion = phoneOSVersion;
		this.tags = tags;
		this.dataJson = dataJson;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPhoneLat() {
		return phoneLat;
	}
	public void setPhoneLat(Double phoneLat) {
		this.phoneLat = phoneLat;
	}
	public Double getPhoneLon() {
		return phoneLon;
	}
	public void setPhoneLon(Double phoneLon) {
		this.phoneLon = phoneLon;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getPhoneIP() {
		return phoneIP;
	}
	public void setPhoneIP(String phoneIP) {
		this.phoneIP = phoneIP;
	}
	public String getPhoneManufacturer() {
		return phoneManufacturer;
	}
	public void setPhoneManufacturer(String phoneManufacturer) {
		this.phoneManufacturer = phoneManufacturer;
	}
	public String getPhoneOS() {
		return phoneOS;
	}
	public void setPhoneOS(String phoneOS) {
		this.phoneOS = phoneOS;
	}
	public String getPhoneOSVersion() {
		return phoneOSVersion;
	}
	public void setPhoneOSVersion(String phoneOSVersion) {
		this.phoneOSVersion = phoneOSVersion;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getDataJson() {
		return dataJson;
	}
	public void setDataJson(String dataJson) {
		this.dataJson = dataJson;
	}

}

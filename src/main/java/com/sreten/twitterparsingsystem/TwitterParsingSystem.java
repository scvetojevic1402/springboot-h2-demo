package com.sreten.twitterparsingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//compile and build: mvn clean install
//double click on jar file in target folder to run
//jps to find the process id
//TASKKILL /PID %PID% /F

//@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
@SpringBootApplication
public class TwitterParsingSystem {

	public static void main(String[] args) {
		SpringApplication.run(TwitterParsingSystem.class, args);
	}

}

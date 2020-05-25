package com.sreten.h2springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

//compile and build: mvn clean install
//double click on jar file in target folder to run
//jps to find the process id
//TASKKILL /PID %PID% /F

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class SpringBootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2Application.class, args);
	}

}

package com.sreten.tps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

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

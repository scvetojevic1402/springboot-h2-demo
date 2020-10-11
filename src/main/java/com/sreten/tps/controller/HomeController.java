package com.sreten.tps.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sreten.tps.feedback.Feedback;
import com.sreten.tps.feedback.FeedbackService;

import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableWebMvc
//@ComponentScan ({"controllers", "config"})
//@EnableAutoConfiguration
//@EnableWebMvc
//@Configuration
//@EnableTransactionManagement
@Controller
public class HomeController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping("/")
        public String index(){
//	public String index(Model model) {
//		System.out.println("Starting..");
//		model.addAttribute("data", feedbackService.getAllFeedbacks());
//		System.out.print("DATA: "+ feedbackService.getAllFeedbacks().get(0).getDataJson());
        return "index";
    }
	
//	@GetMapping("/listFeedbacks")
//	public String showPage(Model model) {
////		List<Feedback> resultSet = new List();
////		resultSet = feedbackService.getAllFeedbacks();
//		model.addAttribute("data", feedbackService.getAllFeedbacks());
//		model.addAttribute("description", feedbackService.getAllFeedbacks());
//		return "index";
//	}
	@GetMapping("/index1")
	public String index1() {
		return "index1";
	}
	
	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
}
//<dependency>
//<groupId>javax.servlet.jsp.jstl</groupId>
//<artifactId>javax.servlet.jsp.jstl-api</artifactId>
//<version>1.2.2</version>
//</dependency>

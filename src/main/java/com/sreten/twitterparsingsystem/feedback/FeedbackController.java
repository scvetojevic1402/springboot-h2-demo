package com.sreten.twitterparsingsystem.feedback;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {
	
	
	@Autowired
	private FeedbackService feedbackService;
	
	@RequestMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		return feedbackService.getAllFeedbacks();
	}
	
	@RequestMapping("/feedbacks/{foo}")
	public Optional<Feedback> getFeedback(@PathVariable("foo") String id) {
		return feedbackService.getFeedback(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/feedbacks")
	public void addFeedback(@RequestBody Feedback feedback) {
		feedbackService.addFeedback(feedback);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/feedbacks/{id}")
	public void updateFeedback(@RequestBody Feedback feedback, @PathVariable String id) {
		feedbackService.updateFeedback(id, feedback);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/feedbacks/{id}")
	public void deleteFeedback(@PathVariable String id) {
		feedbackService.deleteFeedback(id);
	}
}

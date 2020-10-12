package com.sreten.twitterparsingsystem.feedback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
	
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public List<Feedback> getAllFeedbacks(){
		List<Feedback> feedbacks = new ArrayList();
		feedbackRepository.findAll()
		.forEach(feedbacks::add);
		
		return feedbacks;
	}
	
	public Optional<Feedback> getFeedback(String id) {
		//return feedbacks.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return feedbackRepository.findById(id);
	}

	public void addFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
		
	}

	public void updateFeedback(String id, Feedback feedback) {
		feedbackRepository.save(feedback);
	}

	public void deleteFeedback(String id) {
//		feedbacks.removeIf(t -> t.getId().equals(id));
		feedbackRepository.deleteById(id);
		
	}
}

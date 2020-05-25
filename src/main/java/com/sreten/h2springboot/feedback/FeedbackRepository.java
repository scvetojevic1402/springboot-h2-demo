package com.sreten.h2springboot.feedback;

import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, String>{

}

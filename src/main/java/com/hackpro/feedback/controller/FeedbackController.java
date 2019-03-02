package com.hackpro.feedback.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackpro.feedback.entity.Feedback;
import com.hackpro.feedback.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/saveFeedback")
	public void saveFeedbackInfo(@Valid @RequestBody Feedback feedback)
	{
		feedbackService.saveFeedBackInfo(feedback);
	}

}

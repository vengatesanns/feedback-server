package com.hackpro.feedback.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackpro.feedback.entity.Feedback;
import com.hackpro.feedback.repo.FeedbackRepository;

@Service
public class FeedbackService {
	
	
	private final static Logger logger = Logger.getLogger(FeedbackService.class);
	
	@Autowired
	private FeedbackRepository feedBackRepo;
	
	
	
	public void saveFeedBackInfo(Feedback feedInfo)
	{
		try {
			feedBackRepo.save(feedInfo);
		} catch (Exception e) {
			logger.error("##### Error in saving the Feedback Info");
		}
	}

}

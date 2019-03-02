package com.hackpro.feedback.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackpro.feedback.entity.Feedback;


@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long>{

}

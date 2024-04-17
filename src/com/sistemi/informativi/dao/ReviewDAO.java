package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.ReviewDTO;

public interface ReviewDAO {
	
	public void addReview(ReviewDTO reviewDTO);
	
	public void findAllReviewsByCourse(int courseId);
	

}

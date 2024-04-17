package com.sistemi.informativi.main;

import com.sistemi.informativi.dao.CourseDAO;
import com.sistemi.informativi.dao.CourseDAOImpl;
import com.sistemi.informativi.dao.ReviewDAO;
import com.sistemi.informativi.dao.ReviewDAOImpl;
import com.sistemi.informativi.dto.CourseDTO;
import com.sistemi.informativi.dto.ReviewDTO;


public class MainApplication {

	public static void main(String[] args) {
		
		CourseDAO courseDAO = new CourseDAOImpl();
		
		CourseDTO courseDTO = new CourseDTO("Spring","BE Course");
		
		// inserimento di un record nella tabella course
		courseDAO.addCourse(courseDTO);
		
		ReviewDAO reviewDAO = new ReviewDAOImpl();
		
		// inserimento di due record nella tabella review con FK = PK course
		reviewDAO.addReview(new ReviewDTO("Milan",courseDAO.findMaxCourseId()));
		reviewDAO.addReview(new ReviewDTO("Rome",courseDAO.findMaxCourseId()));
		
		
		//ricerca adi tutte le review relative al corso Angular
		reviewDAO.findAllReviewsByCourse(3);
		
		// eliminazione del corso con id = 2 e di tutte le review con course_id=2
		courseDAO.removeCourse(4);

	}

}

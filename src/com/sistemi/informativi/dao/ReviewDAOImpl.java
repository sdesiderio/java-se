package com.sistemi.informativi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.ReviewDTO;
import com.sistemi.informativi.vo.ReviewVO;

public class ReviewDAOImpl implements ReviewDAO{
	
	private String sqlInsert = "insert into review(location,course_id)values(?,?)";
	
	private String sqlReviews = "select location from course,review where course.id=review.course_id and review.course_id=?";

	@Override
	public void addReview(ReviewDTO reviewDTO) {
		

		ConnectionManager connectionManager = new ConnectionManager();
		
		try {
			
			PreparedStatement ps = connectionManager.getPreparedStatement(sqlInsert);
			ps.setString(1, reviewDTO.getLocation());
			ps.setInt(2, reviewDTO.getCourseId());
			ps.executeUpdate();
			
		}
		
		catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
	}

	@Override
	public void findAllReviewsByCourse(int courseId) {
		
		ConnectionManager connectionManager = new ConnectionManager();
		
		try {
			
			PreparedStatement ps = connectionManager.getPreparedStatement(sqlReviews);
			//"select location from course,review where course.id=review.course_id and review.course_id=select location from course,review where course.id=review.course_id and review.course_id=?"
			ps.setInt(1, courseId);
			//"select location from course,review where course.id=review.course_id and review.course_id=select location from course,review where course.id=review.course_id and review.course_id=5"
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				
				ReviewVO reviewVO = new ReviewVO(rs.getString("location"));
				
				System.out.println(reviewVO.getLocation());
			}
			
			
		}
		
		catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		
	}

	

}

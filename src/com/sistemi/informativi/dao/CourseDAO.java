package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CourseDTO;

public interface CourseDAO {
	
	
	public void addCourse(CourseDTO courseDTO);
	
	public int findMaxCourseId();
	
	public void removeCourse(int id);
	

}

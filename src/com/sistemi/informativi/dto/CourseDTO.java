package com.sistemi.informativi.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable{

	private static final long serialVersionUID = -1532805681777170311L;
	
	private String title;
	
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CourseDTO(String title, String description) {
		
		this.title = title;
		this.description = description;
		
	}
	
	

}

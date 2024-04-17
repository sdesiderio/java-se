package com.sistemi.informativi.bean;

import java.util.Objects;

public class Course {

	private String title;
	private String code;
	private String description;
	private String location;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Course(String title, String code, String description, String location) {

		this.title = title;
		this.code = code;
		this.description = description;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", code=" + code + ", description=" + description + ", location=" + location
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, description, location, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(code, other.code) && Objects.equals(description, other.description)
				&& Objects.equals(location, other.location) && Objects.equals(title, other.title);
	}
	
	

}

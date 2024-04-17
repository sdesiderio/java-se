package com.sistemi.informativi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO {

	String sqlInsert = "insert into course(title,description)values(?,?)";

	String sqlReadMaxId = "select max(id) from course";
	
	String sqlDelete = "delete from course where id=?";
	

	@Override
	public void addCourse(CourseDTO courseDTO) {

		ConnectionManager connectionManager = new ConnectionManager();

		try {

			PreparedStatement ps = connectionManager.getPreparedStatement(sqlInsert);
			ps.setString(1, courseDTO.getTitle());
			ps.setString(2, courseDTO.getDescription());
			ps.executeUpdate();

		}

		catch (SQLException ex) {

			ex.printStackTrace();

		}

	}

	@Override
	public int findMaxCourseId() {

		ConnectionManager connectionManager = new ConnectionManager();

		int maxId = 0;

		ResultSet rs = connectionManager.getResultSet(sqlReadMaxId);

		try {

			if (rs.next()) {

				maxId = rs.getInt(1);
			}

		}

		catch (SQLException ex) {

			ex.printStackTrace();
		}

		return maxId;

	}

	@Override
	public void removeCourse(int id) {
		
		ConnectionManager connectionManager = new ConnectionManager();

		try {

			PreparedStatement ps = connectionManager.getPreparedStatement(sqlDelete);
			//delete from course where id=id (input al metodo)
			ps.setInt(1, id);
			ps.executeUpdate();

		}

		catch (SQLException ex) {

			ex.printStackTrace();

		}
		
		
		
	}


}

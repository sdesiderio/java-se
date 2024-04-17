package com.sistemi.informativi.main;


import com.sistemi.informativi.business.CrudControl;
import com.sistemi.informativi.dao.StudentDAO;
import com.sistemi.informativi.dao.StudentDAOImpl;
import com.sistemi.informativi.dto.StudentDTO;

public class MainApplication {

	public static void main(String[] args) {
		
		
		// LOOSE COUPLING
		StudentDAO studentDAO = new StudentDAOImpl();
		
		StudentDTO studentDTO1 = new StudentDTO("Gianni","Versace",25);
		StudentDTO studentDTO2 = new StudentDTO("Milo","Sperli",29);
		StudentDTO studentDTO3 = new StudentDTO("Gioanna","Sesti",31);
		
		CrudControl.executionControl(studentDAO.addStudent(studentDTO1));
		CrudControl.executionControl(studentDAO.addStudent(studentDTO2));
		CrudControl.executionControl(studentDAO.addStudent(studentDTO3));
		
		
		StudentDTO studentDTO = new StudentDTO("Ciro","Esposito",34);
		
		CrudControl.executionControl(studentDAO.updateStudent(studentDTO, 5));
		
		CrudControl.executionControl(studentDAO.removeStudent(7));
		
		CrudControl.readControl(studentDAO.findAllStudents());
		
		
	}

}

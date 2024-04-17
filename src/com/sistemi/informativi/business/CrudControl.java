package com.sistemi.informativi.business;

import java.util.List;

import com.sistemi.informativi.vo.StudentVO;

public class CrudControl {
	
	
	public static void executionControl(int result) {
		
		if(result>0) {
			
			System.out.println("Operazione Corretta");
		}
		
		else {
			
			System.out.println("Ooopsss!!! Qualcosa è andato storto");
		}
		
	}
	
	
	public static void readControl(List<StudentVO> students) {
		
		
		if (!students.isEmpty()) {
			
			System.out.println("Lettura avvenuta correttamente");
			
			students.forEach(student->System.out.println("Risultato Lettura " + student));
			
		}
		
		else {
			
			System.out.println("Ooopsss!!! Qualcosa è andato storto");
			
		}
		
	}

}

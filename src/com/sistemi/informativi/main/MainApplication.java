package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.sistemi.informativi.bean.Course;
import com.sistemi.informativi.business.Docente;
import com.sistemi.informativi.business.DocenteJava;
import com.sistemi.informativi.business.DocenteTypescript;

public class MainApplication extends Object{

	public static void main(String[] args) {

		// ARRAY DI TIPO PRIMITIVO
		int arrInt[] = new int[3];
		arrInt[0] = 23;
		arrInt[1] = 25;
		arrInt[2] = 89;
		

		for (int i = 0; i < arrInt.length; i++) {

			System.out.println("Contenuto arrInt " + arrInt[i]);
		}

		int arrIntNew[] = { 21, 76, 45 };

		for (int i = 0; i < arrInt.length; i++) {

			System.out.println("Contenuto arrIntNew " + arrIntNew[i]);
		}
		// END ARRAY DI TIPO PRIMITIVO

		// ARRAY DI REFERENCE AD OBJECTS
		Course courses[] = new Course[2];
		courses[0] = new Course("Java SE", "1028", "Basic Course", "Rome");
		courses[1] = new Course("Java EE", "1029", "Advanced Course", "Milan");

		for (Course course : courses) {

			System.out.println("Contenuto courses " + course.toString());

		}

		Docente docenti[] = new Docente[2];
		docenti[0] = new DocenteJava();
		docenti[1] = new DocenteTypescript();
		docenti[0].spiegaLinguaggio();
		docenti[1].spiegaLinguaggio();
		// END ARRAY DI REFERENCE AD OBJECTS

		// ARRAYLIST
		ArrayList<Course> coursesList = new ArrayList<>();

		coursesList.add(new Course("Angular", "1030", "FE Framework", "Milan"));
		coursesList.add(new Course("React", "1031", "Javascript API", "Rome"));
		coursesList.add(new Course("Spring", "1032", "BE Framework", "Rome"));
		coursesList.remove(1);

		for (Course course : coursesList) {

			System.out.println("Contenuto coursesList " + course.toString());

		}

		ArrayList<String> daysList = new ArrayList<>();
		daysList.add("Salvatore");
		daysList.add("Martedi");
		daysList.add("Mercoledi");
		daysList.add("Giovedi");
		daysList.add("Venerdi");
		daysList.add("Sabato");
		daysList.add("Domenica");
		daysList.add("Lunedi");

		daysList.forEach((day) -> System.out.println(day));

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		for (Integer number : numbers) {

			System.out.println("Contenuto ArrayList numbers " + number.toString());

		}
		// END ARRAYLIST
		
		
		// HASHSET
		HashSet<Course> coursesSet = new HashSet<>();
		coursesSet.add(new Course("SQL","1067","Database Course","Neaples"));
		coursesSet.add(new Course("SQL","1067","Database Course","Neaples"));
		
		for(Course course : coursesSet) {
			
			System.out.println("Contenuto coursesSet " + course.toString());
			
		}
		
		HashSet<String> daysSet = new HashSet<>();
		daysSet.add("Lunedi");
		daysSet.add("Martedi");
		daysSet.add("Mercoledi");
		daysSet.add("Giovedi");
		daysSet.add("Venerdi");
		daysSet.add("Sabato");
		daysSet.add("Domenica");
		daysSet.add("Lunedi");
		
		for(String day: daysSet) {
			
			System.out.println("Contenuto daysSet " + day);
			
		}
		
		
		HashMap<String,Course> coursesMap = new HashMap<>();
		coursesMap.put("1098", new Course("SQL","1098","Database Course","Neaples"));
		coursesMap.put("1099", new Course("MongoDB","1099","No Relational Database ","Milan"));
		
		
		coursesMap.forEach((key,value)->
		System.out.println("Contenuto coursesMap " + key + " " + value));
		

	}

}

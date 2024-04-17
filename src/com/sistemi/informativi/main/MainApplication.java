package com.sistemi.informativi.main;

import com.sistemi.informativi.Persona;
import com.sistemi.informativi.Studente;
import com.sistemi.informativi.StudenteScolastico;
import com.sistemi.informativi.StudenteUniversitario;

public class MainApplication {

	public static void main(String[] args) {
	
		
		Persona persona = new Persona();
		
		Studente studente = new Studente();
		
		StudenteScolastico studenteScolastico = new StudenteScolastico();
		
		StudenteUniversitario studenteUniversitario = new StudenteUniversitario();
		
		
		persona.cammina();
		persona.dorme();
		persona.mangia();
		
		
		studente.cammina();
		studente.dorme();
		studente.mangia();
		studente.studia();
		
		
		studenteScolastico.cammina();
		studenteScolastico.dorme();
		studenteScolastico.mangia();
		studenteScolastico.studia();
		
		
		studenteUniversitario.cammina();
		studenteUniversitario.dorme();
		studenteUniversitario.mangia();
		studenteUniversitario.studia();
		
		
		
		

	}

}

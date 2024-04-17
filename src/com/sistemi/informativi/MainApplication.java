package com.sistemi.informativi;

import com.sistemi.informativi.bean.Person;

public class MainApplication {

	public static void main(String[] args) {
		
		/*
		 * Viene allocato un Oggetto
		 * nell'HEAP con le variabili
		 * di istanza tutte già valorizzate
		 * con gli argomenti passati in input
		 */
		Person p1 = new Person("Mario","Rossi",24);
	
		System.out.println(p1.toString());
		
		
	}

}

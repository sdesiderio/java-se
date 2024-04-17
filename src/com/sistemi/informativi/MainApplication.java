package com.sistemi.informativi;

import com.sistemi.informativi.bean.Person;

public class MainApplication {
	
	
	public static void main(String args[]) {
		
		/*
		 * Nascita di un Oggetto di
		 * tipo Person nell'HEAP
		 * 
		 * (i valori delle variabili
		 * di istanza sono quelle di
		 * default)
		 */
		Person p1 = new Person();
		
		/*
		 * Nodifica dello stato
		 * dell'Oggetto
		 */
		p1.setFirstName("Mario");
		p1.setLastName("Rossi");
		p1.setAge(23);
		
		
		System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge());
		
		
		
		
	}

}

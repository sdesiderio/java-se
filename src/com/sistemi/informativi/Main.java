package com.sistemi.informativi;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		Person p2 = new Person();
		
		// variabile locale al metodo
		p1.firstName="Mario";
		p1.lastName="Rossi";
		p1.age=34;
		
		p2.firstName="Mario";
		p2.lastName="Rossi";
		p2.age=34;
		
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.age);
		
		System.out.println(p2.firstName + " " + p2.lastName + " " + p2.age);
		
		/*
		 * La reference p1 viene assegnata 
		 * alla reference p2, ovvero la 
		 * reference p2 referenzia la stessa
		 * area di memoria referenziata da p2 
		 */
		System.out.println(p1==p2);
		
		/*
		 * Si può chiedere al Garbage Collector (Processo interno all'HEAP)
		 * di eliminare un Oggetto, assegnando a null la reference che controlla
		 * l'Oggetto stesso
		 */
		//p1=null

	}

}

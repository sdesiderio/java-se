package com.sistemi.informativi.bean;

public class Persona {

	private String firstName;
	private String lastName;
	private int age;
	// Relazione HAS-A
	private Indirizzo indirizzo;

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public Indirizzo getIndirizzo() {

		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {

		this.indirizzo = indirizzo;
	}

	public Persona(String firstName, String lastName, int age, Indirizzo indirizzo) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", indirizzo="
				+ indirizzo + "]";
	}
	

}

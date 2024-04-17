package com.sistemi.informativi.business;

public class Contatore {

	// variabile di classe
	private static int x;

	public void conta() {

		x = x + 1;
		System.out.println("Valore x " + x);

	}

	public static void contaNew() {

		x = x + 1;
		System.out.println("Valore x " + x);

	}

}

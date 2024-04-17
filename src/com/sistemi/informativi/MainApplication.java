package com.sistemi.informativi;

import com.sistemi.informativi.business.Operazione;

public class MainApplication {

	public static void main(String[] args) {
	
		Operazione operazione = new Operazione();
		
		System.out.println(operazione.somma(8, 9));
		System.out.println(operazione.somma(9, 8, 17));
		System.out.println(operazione.somma(7.8, 9.6));
		

	}

}

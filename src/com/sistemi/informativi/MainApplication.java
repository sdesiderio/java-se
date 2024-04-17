package com.sistemi.informativi;

import com.sistemi.informativi.bean.Indirizzo;
import com.sistemi.informativi.bean.Persona;

public class MainApplication {

	public static void main(String[] args) {
		
		// variabile locale
		//Indirizzo indirizzo = new Indirizzo("via dei Mille","21/A","00100","Roma","Italia");
		
		Persona persona = new Persona("Giacomo","Verdi",24,new Indirizzo("via dei Mille","21/A","00100","Roma","Italia"));
		
		System.out.println(persona.toString());

	}

}

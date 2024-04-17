package com.sistemi.informativi.main;

import com.sistemi.informativi.DocenteJava;
import com.sistemi.informativi.DocenteTypescript;
import com.sistemi.informativi.Docente;

public class MainApplication {

	public static void main(String[] args) {
		
		/*
		DocenteJava docenteJava = new DocenteJava();
		
		docenteJava.spiegaLinguaggio();
		docenteJava.spiegaFramework();
		docenteJava.spiegaArchitettura();
		
		DocenteTypescript docenteTypescript = new DocenteTypescript();
		
		docenteTypescript.spiegaLinguaggio();
		docenteTypescript.spiegaFramework();
		docenteTypescript.spiegaArchitettura();
		*/
		
	
		
		Docente docenteJava = new DocenteJava();
		docenteJava.spiegaLinguaggio();
		docenteJava.spiegaFramework();
		docenteJava.spiegaArchitettura();
	
		
		Docente docenteTypescript = new DocenteTypescript();
		docenteTypescript.spiegaLinguaggio();
		docenteTypescript.spiegaFramework();
		docenteTypescript.spiegaArchitettura();
		
		
		

	}

}

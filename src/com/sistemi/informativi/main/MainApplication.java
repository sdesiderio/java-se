package com.sistemi.informativi.main;

import com.sistemi.informativi.business.Operazione;
import com.sistemi.informativi.business.PatenteExceptionHandler;
import com.sistemi.informativi.exception.PatenteException;

public class MainApplication {

	public static void main(String[] args) throws PatenteException {
		
		/*
		Operazione operazione = new Operazione();
		
		try {
		
		operazione.divisione(8,0);
		
		}
		catch(ArithmeticException ex) {
			
			ex.printStackTrace();
		}
		*/
		
		PatenteExceptionHandler patenteHandler = new PatenteExceptionHandler();
		patenteHandler.verificaEta(17);
		
		
		
		

	}

}

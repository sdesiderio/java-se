package com.sistemi.informativi.business;

import com.sistemi.informativi.exception.PatenteException;

public class PatenteExceptionHandler {
	
	
	public void verificaEta(int eta) throws PatenteException {
		
		
		if (eta<18) {
			
			throw new PatenteException("Eta Exception");
			
		}
		
		else {
			
			System.out.println("Eta corretta");
		}
		
		
	}

}

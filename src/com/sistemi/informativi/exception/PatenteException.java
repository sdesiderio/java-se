package com.sistemi.informativi.exception;

public class PatenteException extends Exception{
	
	public PatenteException(String message) {
		
		/*
		 * invocazione del costruttore
		 * della Classe Padre Exception
		 * che consente di specificare 
		 * un messaggio dettagliato (custom)
		 * per la nostra Eccezione (Custom)
		 * 
		 * Istanziando la Classe PatenteException
		 * utilizzando il nostro costruttore
		 * potremo specificare in fase di invocazione
		 * del Costruttore stesso il messaggio specifico
		 * dell'Eccezione Custom
		 */
		super(message);
	}

}

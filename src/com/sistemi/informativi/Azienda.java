package com.sistemi.informativi;

public abstract class Azienda {
	
	public abstract void produce();
	
	public abstract void assume();
	
	public void fattura() {
		
		System.out.println("fattura con iva al 22%");
	}

}

package com.sistemi.informativi;

public class AziendaInformatica extends Azienda{
	
	@Override
	public void produce() {
		
		System.out.println("produce hardware/software");
	}
	
	@Override
	public void assume() {
		
		System.out.println("assume esperti informatici");
	}
	
	

}

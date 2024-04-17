package com.sistemi.informativi.main;

import com.sistemi.informativi.business.Contatore;

public class MainApplication {

	public static void main(String[] args) {

		Contatore contatore1 = new Contatore();
		contatore1.conta();

		Contatore contatore2 = new Contatore();
		contatore2.conta();

		Contatore.contaNew();
		Contatore.contaNew();

	}

}

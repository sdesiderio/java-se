package com.sistemi.informativi.bean;

public class Indirizzo {

	private String via;
	private String numeroCivico;
	private String cap;
	private String citta;
	private String nazione;

	public String getVia() {

		return via;
	}

	public void setVia(String via) {

		this.via = via;
	}

	public String getNumeroCivico() {

		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {

		this.numeroCivico = numeroCivico;
	}

	public String getCap() {

		return cap;
	}

	public void setCap(String cap) {

		this.cap = cap;
	}

	public String getCitta() {

		return citta;
	}

	public void setCitta(String citta) {

		this.citta = citta;
	}

	public String getNazione() {

		return nazione;
	}

	public void setNazione(String nazione) {

		this.nazione = nazione;
	}

	public Indirizzo(String via, String numeroCivico, String cap, String citta, String nazione) {

		this.via = via;
		this.numeroCivico = numeroCivico;
		this.cap = cap;
		this.citta = citta;
		this.nazione = nazione;
	}

	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", numeroCivico=" + numeroCivico + ", cap=" + cap + ", citta=" + citta
				+ ", nazione=" + nazione + "]";
	}
	
	

}

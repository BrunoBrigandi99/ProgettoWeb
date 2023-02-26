package it.unical.mat.webapp22.Immobili.persistenza.model;

import java.util.List;

public class Acquirente{
	Long idAcquirente;
	String nome;
	String cognome;
	List<Venditore> venditori;
	
	public Long getIdAcquirente() {
		return idAcquirente;
	}
	public void setIdAcquirente(Long idAcquirente) {
		this.idAcquirente = idAcquirente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public List<Venditore> getVenditori() {
		return venditori;
	}
	public void setVenditori(List<Venditore> venditori) {
		this.venditori = venditori;
	}
	
}
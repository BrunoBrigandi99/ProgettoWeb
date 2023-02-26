package it.unical.mat.webapp22.Immobili.persistenza.model;

import java.util.List;

public class Venditore {
	Long idVenditore;
	String nome;
	String cognome;
	List<Acquirente> acquirenti;
	
	public Long getIdVenditore() {
		return idVenditore;
	}
	public void setIdVenditore(Long idVenditore) {
		this.idVenditore = idVenditore;
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
	public List<Acquirente> getAcquirenti() {
		return acquirenti;
	}
	public void setAcquirenti(List<Acquirente> acquirenti) {
		this.acquirenti = acquirenti;
	}
	
	
}

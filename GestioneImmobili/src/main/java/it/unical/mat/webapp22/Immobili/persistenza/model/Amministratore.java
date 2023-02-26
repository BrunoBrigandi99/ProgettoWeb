package it.unical.mat.webapp22.Immobili.persistenza.model;

import java.util.List;

public class Amministratore {
	Long idAmministratore;
	String nome;
	String cognome;
	List<Venditore> venditori;
	List<Acquirente> acquirenti;
	
	
	public Long getIdAmministratore() {
		return idAmministratore;
	}
	public void setIdAmministratore(Long idAmministratore) {
		this.idAmministratore = idAmministratore;
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
	public List<Acquirente> getAcquirenti() {
		return acquirenti;
	}
	public void setAcquirenti(List<Acquirente> acquirenti) {
		this.acquirenti = acquirenti;
	}
	
	
}

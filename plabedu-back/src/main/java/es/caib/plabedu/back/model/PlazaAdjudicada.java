package es.caib.plabedu.back.model;

public class PlazaAdjudicada {
	
	private String nom;
	private String llinatges;
	private Integer telefon;
	private String email;
	//private List<Plaza>listaPlazas=new ArrayList<>();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLlinatges() {
		return llinatges;
	}
	public void setLlinatges(String llinatges) {
		this.llinatges = llinatges;
	}
	public Integer getTelefon() {
		return telefon;
	}
	public void setTelefon(Integer telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public List<Plaza> getListaPlazas() {
		return listaPlazas;
	}
	public void setListaPlazas(List<Plaza> listaPlazas) {
		this.listaPlazas = listaPlazas;
	}*/

}

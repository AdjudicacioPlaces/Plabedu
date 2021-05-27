package es.caib.plabedu.back.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import es.caib.plabedu.back.model.Formulari;
import es.caib.plabedu.back.model.Plaza;

@Named
@RequestScoped
public class FormulariBeanPrime {
	
	private Formulari formulari = new Formulari();
	private static List<Formulari> lista = new ArrayList<>();
	private static List<Plaza> listaPlazas = new ArrayList<>();
	private static Integer[] numPlaza;
	private Integer numeroPlaza;
	private Integer numero;

	public Formulari getFormulari() {
		return formulari;
	}

	public void setFormulari(Formulari formulari) {
		this.formulari = formulari;
	}

	public List<Formulari> getLista() {
		return lista;
	}

	public void setLista(List<Formulari> lista) {
		FormulariBeanPrime.lista = lista;
	}

	public List<Plaza> getListaPlazas() {
		return listaPlazas;
	}

	public void setListaPlazas(List<Plaza> listaPlazas) {
		FormulariBeanPrime.listaPlazas = listaPlazas;
	}

	public Integer[] getNumPlaza() {
		return numPlaza;
	}

	public void setNumPlaza(Integer[] numPlaza) {
		FormulariBeanPrime.numPlaza = numPlaza;
	}

	public Integer getNumeroPlaza() {
		return numeroPlaza;
	}

	public void setNumeroPlaza(Integer numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * Afegeix un objecte Formulari al dataTable.
	 */
	public void registrar() {
		FormulariBeanPrime.lista.add(this.formulari);

	}

	/**
	 * Omple la listaPlazas amb objectes Plaza per visualitzar-los al dataTable.
	 * Inicilitza l'array numPlaza i l'omple amb el nombre de places que s'han
	 * afegit.
	 */
	public void afegirPlaza() {
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES JUNIPER SERRA (Palma)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES MOSSEN ALCOVER (Manacor)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES SON FERRER (Calvià)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES SANTA MARGALIDA (Santa Margalida)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES CAPDEPERA (Capdepera)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES CALVIA (Calvia)", 0));
		FormulariBeanPrime.listaPlazas.add(new Plaza("IES SANTA MARGALIDA (Santa Margalida)", 0));
		FormulariBeanPrime.numPlaza = new Integer[FormulariBeanPrime.listaPlazas.size() + 1];
		for (int i = 0; i < FormulariBeanPrime.listaPlazas.size() + 1; i++) {
			FormulariBeanPrime.numPlaza[i] = i;
		}
	}

	/**
	 * Valida el inputText "email". Si el String compleix la condició amollarà un
	 * error de validació.
	 * 
	 * @param context    Podem tenir accés a totes les variables.
	 * @param toValidate El component que invoca aquest mètode.
	 * @param value      El valor que dutrae consigo el componente
	 */
	public void validar(FacesContext context, UIComponent toValidate, Object value) {
		context = FacesContext.getCurrentInstance();
		String email = (String) value;
		if (!email.contains("@")) {
			((UIInput) toValidate).setValid(false);
			context.addMessage(toValidate.getClientId(context), new FacesMessage("Email no válido"));
		}
	}

	/**
	 * Modifica l'ordre de preferència d'una plaça concreta.
	 */
	public void modificaOrdre(AjaxBehaviorEvent event) {
		Integer numero = (Integer) event.getComponent().getAttributes().get("numero");
		Plaza plaza = (Plaza) event.getComponent().getAttributes().get("plaza");
		plaza.setOrdrePreferencia(numero);
	}
	
	/**
	 * Modifica el valor de numero en funció del valor que agafi la variale numeroPlaza. Aquest mètode s'executa quan
	 * canvia el valor del component selectOneMenu amb id dropdown.
	 */
	public void handleOnChange() {
		if(this.numeroPlaza!=null && this.numeroPlaza!=0) {
			this.numero=this.numeroPlaza;
		}
	}
}

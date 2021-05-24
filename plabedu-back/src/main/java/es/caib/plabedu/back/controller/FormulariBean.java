package es.caib.plabedu.back.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import es.caib.plabedu.back.model.Formulari;

@ManagedBean
@RequestScoped
public class FormulariBean {

	private Formulari formulari = new Formulari();
	private static List<Formulari> lista = new ArrayList<>();

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
		FormulariBean.lista = lista;
	}

	public void registrar() {
		FormulariBean.lista.add(this.formulari);
	}

	public String obtenerDatos() {
		return FormulariBean.lista.get(0).toString();
	}

	/**
	 * 
	 * @param context    Podemos tener acceso a todas las variables.
	 * @param toValidate El componente que invoca este método
	 * @param value      El valor que trae consigo el componente
	 */
	public void validar(FacesContext context, UIComponent toValidate, Object value) {
		context = FacesContext.getCurrentInstance();
		// capturamos el valor del objeto
		String email = (String) value;
		String[] array = email.split("@");
		if (array == null) {
			((UIInput) toValidate).setValid(false);
			context.addMessage(toValidate.getClientId(context), new FacesMessage("Email no válido"));
		}
	}
}

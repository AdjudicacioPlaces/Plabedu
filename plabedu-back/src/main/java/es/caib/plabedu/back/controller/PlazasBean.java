package es.caib.plabedu.back.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import es.caib.plabedu.back.model.Plaza;
import es.caib.plabedu.back.model.PlazaAdjudicada;

@ManagedBean
@RequestScoped
public class PlazasBean {

	private Plaza plaza;
	private PlazaAdjudicada plazaAdjudicada;
	private static List<Plaza> listaPlazas = new ArrayList<>();
	private static List<PlazaAdjudicada> listaPlazasAdjudicadas = new ArrayList<>();

	public Plaza getPlaza() {
		return plaza;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	public List<Plaza> getListaPlazas() {
		return listaPlazas;
	}

	public void setListaPlazas(List<Plaza> listaPlazas) {
		PlazasBean.listaPlazas = listaPlazas;
	}

	public List<PlazaAdjudicada> getListaPlazasAdjudicadas() {
		return listaPlazasAdjudicadas;
	}

	public static void setListaPlazasAdjudicadas(List<PlazaAdjudicada> listaPlazasAdjudicadas) {
		PlazasBean.listaPlazasAdjudicadas = listaPlazasAdjudicadas;
	}

	public PlazaAdjudicada getPlazaAdjudicada() {
		return plazaAdjudicada;
	}

	public void setPlazaAdjudicada(PlazaAdjudicada plazaAdjudicada) {
		this.plazaAdjudicada = plazaAdjudicada;
	}

	public void cargarPlazas() {
		FacesContext context = FacesContext.getCurrentInstance();
		PlazasBean pb = context.getApplication().evaluateExpressionGet(context, "#{plazasBean}", PlazasBean.class);
		PlazasBean.listaPlazas.add(new Plaza("IES JUNIPER SERRA (Palma)", 0));
		PlazasBean.listaPlazas.add(new Plaza("IES MOSSEN ALCOVER (Manacor)", 0));
		PlazasBean.listaPlazas.add(new Plaza("IES SON FERRER (Calvià)", 0));
		PlazasBean.listaPlazas.add(new Plaza("IES SANTA MARGALIDA (Santa Margalida)", 0));
		PlazasBean.listaPlazas.add(new Plaza("IES CAPDEPERA (Capdepera)", 0));
		/*listaPlazas.add(new Plaza("IES JUNIPER SERRA (Palma)", 0));
		listaPlazas.add(new Plaza("IES MOSSEN ALCOVER (Manacor)", 0));
		listaPlazas.add(new Plaza("IES SON FERRER (Calvià)", 0));
		listaPlazas.add(new Plaza("IES SANTA MARGALIDA (Santa Margalida)", 0));
		listaPlazas.add(new Plaza("IES CAPDEPERA (Capdepera)", 0));*/
	}

	public void guardarPlazas() {
		listaPlazasAdjudicadas.add(this.plazaAdjudicada);
	}

}

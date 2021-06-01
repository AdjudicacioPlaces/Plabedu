package es.caib.plabedu.back.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;

import es.caib.plabedu.back.model.Formulari;
import es.caib.plabedu.back.model.Plaza;

@Named
@RequestScoped
public class FormulariBeanPrime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Formulari formulari = new Formulari();
	private static List<Formulari> lista = new ArrayList<>();
	private static List<Plaza> listaPlazas;
	private static Integer[] numPlaza;
	private String mailAction;
	private String prova = "datos";
	// Amb aquesta anotació declarem el recurs que necessitem per emprar el servei
	// SMTP de la CAIB
	// @Resource(mappedName="java:opt/jboss/wildfly/standalone/deployments/plabedu-mail.xml")
	// private Session JNDIName;

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

	public String getMailAction() {
		return mailAction;
	}

	public void setMailAction(String mailAction) {
		this.mailAction = mailAction;
	}

	public String getProva() {
		return prova;
	}

	public void setProva(String prova) {
		this.prova = prova;
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
	@PostConstruct
	public void afegirPlaza() {
		FormulariBeanPrime.listaPlazas = new ArrayList<Plaza>();
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

	public void validarOrdrePreferencia() {
		Integer[] numReservats = new Integer[FormulariBeanPrime.listaPlazas.size()];
		for (int i = 0; i < FormulariBeanPrime.listaPlazas.size(); i++) {
			numReservats[i] = FormulariBeanPrime.listaPlazas.get(i).getOrdrePreferencia();
		}
		for (int i = 0; i < FormulariBeanPrime.listaPlazas.size(); i++) {
			for (int j = 0; i < numReservats.length; j++) {
				if (FormulariBeanPrime.listaPlazas.get(i).getOrdrePreferencia() == numReservats[j]) {

				}
			}
		}
	}

	public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
		Document pdf = (Document) document;
		pdf.open();
		pdf.setPageSize(PageSize.A4);
		Paragraph p = new Paragraph("Nom: " + this.formulari.getNom() + "\n" + "Llinatges: "
				+ this.formulari.getLlinatge() + "\n" + "Telèfon: " + this.formulari.getTelefon() + "\n"
				+ "Correu electrònic: " + this.formulari.getEmail() + "\n\n");
		pdf.add(p);
	}

	/*
	 * public void sendMail() {
	 * 
	 * try { MimeMessage m = new MimeMessage(JNDIName); Address from = new
	 * InternetAddress("no-reply@caib.es"); Address[] to = new InternetAddress[] {
	 * new InternetAddress("jose.miguel.rivas.22@gmail.com") };
	 * 
	 * m.setFrom(from); m.setRecipients(Message.RecipientType.TO, to);
	 * m.setSubject("JBoss AS 7 Mail"); m.setSentDate(new java.util.Date());
	 * m.setContent("Mail sent from JBoss AS 7", "text/plain"); Transport.send(m);
	 * this.mailAction = "Mail sent!"; } catch (javax.mail.MessagingException e) {
	 * e.printStackTrace(); this.mailAction = "Error in Sending Mail: " + e; } }
	 */
}

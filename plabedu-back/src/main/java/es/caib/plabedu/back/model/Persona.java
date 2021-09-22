/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.caib.plabedu.back.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Gabriel Nicolau
 * @author x43131274
 */
public class Persona {
    private Integer Id;
    private String dni;
    private String nom;
    private String llinatge1;
    private String llinatge2;
    private Date dataNeix;
    private Double puntuacio; // No té actualitzacions a no ser que hi hagi una nova convocatoria per actualitzar mèrits
    private Integer lloc; // en el cas d'empat hi ha uns criteris a la convocatoria per a salvar aquest empat. Des de l'EBAP ens ho donen fet.
    private String usuari;
    private String telefon;
    private String email;

    public Persona(Integer Id, String dni, String nom, String llinatge1, String llinatge2, String dataNeix, Double puntuacio, Integer lloc,String usuari,String telefon,String email) throws ParseException {
        this.Id = Id;
        this.dni = dni;
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        // canviar la data a String per poder passar una data simple del estil dd/mm/aaaa
        SimpleDateFormat parseador = new SimpleDateFormat("dd-MM-yy");
        this.dataNeix = parseador.parse(dataNeix);
        this.puntuacio = puntuacio;
        this.lloc = lloc;
        this.usuari=usuari;
        this.telefon=telefon;
        this.email=email;
    }
    
    
    public Integer getLloc() {
        return lloc;
    }

    public void setLloc(Integer lloc) {
        this.lloc = lloc;
    }


    public Date getDataNeix() {
        return dataNeix;
    }

    public void setDataNeix(Date dataNeix) {
        this.dataNeix = dataNeix;
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public void setLlinatge1(String llinatge1) {
        this.llinatge1 = llinatge1;
    }

    public String getLlinatge2() {
        return llinatge2;
    }

    public void setLlinatge2(String llinatge2) {
        this.llinatge2 = llinatge2;
    }

    public Double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(Double puntuacio) {
        this.puntuacio = puntuacio;
    }
        public String getUsuari() {
        return usuari;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

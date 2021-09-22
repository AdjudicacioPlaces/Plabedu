/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.caib.plabedu.back.model;

/**
 *
 * @author x43131274
 */
public class Lloc_feina {
    private Integer Id; //necessari per a sol·licituds
    private String codi_lloc; //necessari per a sol·licituds
    private String Nom_lloc; //necessari per a sol·licituds
    private String Destinacio; //necessari per a sol·licituds
    private String Illa; //necessari per a sol·licituds

    public Lloc_feina(Integer Id, String codi_lloc, String Nom_lloc, String Destinacio, String Illa) {
        this.Id = Id;
        this.codi_lloc = codi_lloc;
        this.Nom_lloc = Nom_lloc;
        this.Destinacio = Destinacio;
        this.Illa = Illa;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCodi_lloc() {
        return codi_lloc;
    }

    public void setCodi_lloc(String codi_lloc) {
        this.codi_lloc = codi_lloc;
    }

    public String getNom_lloc() {
        return Nom_lloc;
    }

    public void setNom_lloc(String Nom_lloc) {
        this.Nom_lloc = Nom_lloc;
    }

    public String getDestinacio() {
        return Destinacio;
    }

    public void setDestinacio(String Destinacio) {
        this.Destinacio = Destinacio;
    }

    public String getIlla() {
        return Illa;
    }

    public void setIlla(String Illa) {
        this.Illa = Illa;
    }
    
    public String toString()
    {
        return(codi_lloc + " ___ " + Nom_lloc+ " ___ " +Destinacio+ " ___ "+Illa);
    }
}

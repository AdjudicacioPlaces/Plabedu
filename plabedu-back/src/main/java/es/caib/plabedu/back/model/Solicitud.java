/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.caib.plabedu.back.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Gabriel Nicolau
 * @author x43131274
 */
public class Solicitud {
    private Persona perso;
    private Integer NumSol;
    private Integer Convocatoria;
    private  HashMap <Integer, Lloc_feina> places;

    public Solicitud(Persona perso, Integer NumSol, Integer Convocatoria, HashMap<Integer, Lloc_feina> places) {
        this.perso = perso;
        this.NumSol = NumSol;
        this.Convocatoria = Convocatoria;
        this.places = places;
    }

    public Persona getPerso() {
        return perso;
    }

    public void setPerso(Persona perso) {
        this.perso = perso;
    }

    public Integer getNumSol() {
        return NumSol;
    }

    public void setNumSol(Integer NumSol) {
        this.NumSol = NumSol;
    }

    public Integer getConvocatoria() {
        return Convocatoria;
    }

    public void setConvocatoria(Integer Convocatoria) {
        this.Convocatoria = Convocatoria;
    }

    public HashMap<Integer, Lloc_feina> getPlaces() {
        return places;
    }

    public void setPlaces (HashMap<Integer, Lloc_feina> places) {
        this.places = places;
    }
   
}

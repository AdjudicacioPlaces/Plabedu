/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.caib.plabedu.back.controller;

import es.caib.plabedu.back.model.Persona;
import es.caib.plabedu.back.security.UserInfo;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author x43131274
 */
@Named
@RequestScoped
public class configuracioUsuari implements Serializable{

    private static final long serialVersionUID = 1L;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private UserInfo dadeslogin;
    private Persona dadespersona;
    
    public configuracioUsuari ()
    {
        
    }
        
}

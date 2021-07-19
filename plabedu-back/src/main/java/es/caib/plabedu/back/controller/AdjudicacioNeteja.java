/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.caib.plabedu.back.controller;

import static com.itextpdf.kernel.pdf.PdfName.Collection;
import es.caib.plabedu.back.model.Lloc_feina;
import es.caib.plabedu.back.model.Persona;
import es.caib.plabedu.back.model.Solicitud;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x43131274
 */
public class AdjudicacioNeteja extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdjudicacioNeteja</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdjudicacioNeteja at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

    
    private String adjudicacio() throws ParseException
    {  
        // Cridam a una consulta SQl per saber quines son les sol·licituds que han entrat.
        // Cream els llocs de feina
        Lloc_feina lloc11= new Lloc_feina(1, "lloc1prova", "nom del lloc 1", "Destinació del lloc 1", "Mallorca");
        Lloc_feina lloc12= new Lloc_feina(2, "lloc2prova", "nom del lloc 2", "Destinació del lloc 2", "Mallorca");
        Lloc_feina lloc13= new Lloc_feina(3, "lloc3prova", "nom del lloc 3", "Destinació del lloc 3", "Mallorca");
        Lloc_feina lloc14= new Lloc_feina(4, "lloc4prova", "nom del lloc 4", "Destinació del lloc 4", "Mallorca");
        // Cream ls sol·licitud
           //primer cream la persona
        Persona per1= new Persona( 1, "00000012N", "persona", "uno", "unos", "31-03-2016", 50.5, 3);
           //Cream la llista de places amb l'ordre que ha demanat la persona
        HashMap<Integer, Lloc_feina> places = new HashMap<Integer, Lloc_feina>();
        places.put(1,lloc14);
        places.put(2,lloc12);
        places.put(3,lloc11);
        
           // Cream la sol·licitud
        Solicitud sol1=new Solicitud(per1, 10001, 2021001, places);
            
        //primer cream la persona
        Persona per2= new Persona( 2, "00000012N", "persona2", "uno2", "unos2", "31-03-2016", 51.5, 1);
           //Cream la llista de places amb l'ordre que ha demanat la persona
        HashMap<Integer, Lloc_feina> places2 = new HashMap<>();
        places2.put(1,lloc12);
        places2.put(2,lloc11);
        places2.put(3,lloc13);
        places2.put(4,lloc14);
           // Cream la sol·licitud
        Solicitud sol2=new Solicitud(per2, 10001, 2021001, places2);
        
        //primer cream la persona
        Persona per3= new Persona( 3, "00000012N", "persona3", "uno3", "unos3", "31-03-2016", 51.0, 2);
           //Cream la llista de places amb l'ordre que ha demanat la persona
        HashMap<Integer, Lloc_feina> places3 = new HashMap<Integer, Lloc_feina>();
        places3.put(1,lloc11);
        places3.put(2,lloc13);
        places3.put(3,lloc12);
        places3.put(4,lloc14);
           // Cream la sol·licitud
        Solicitud sol3=new Solicitud(per3, 10001, 2021001, places3);
        
        
        // Crear una llista de les persones que han participar a aquesta convocatoria amb les places i la prioritat que han triat
        HashMap <Integer, Solicitud> solicituds = new HashMap<Integer, Solicitud>();
        solicituds.put(sol1.getPerso().getLloc(), sol1);
        solicituds.put(sol2.getPerso().getLloc(), sol2);
        solicituds.put(sol3.getPerso().getLloc(), sol3);
        //Ordenam per lloc les sol·licituds
       // solicituds = sortMapByValues(solicituds);
        for (HashMap.Entry<Integer, Solicitud> entry : solicituds.entrySet()) {       
            System.out.println(entry.toString());
            System.out.println("prova de commit");
        }
        // crear una llista de les places disponibles per aquesta convocatoria
        ArrayList <Lloc_feina> llocFeina = new ArrayList<Lloc_feina>();;
        // crear una llista per a les places i l'adjudicació a cada una d'elles 
       
        
        //Ordenar la llista de sol·licituds per puntuació de la persona
        
        
        /* fer un doble for un per passar de persona a persona i 
           l'altre per cercar dins les prioritats quina plaça està lliure
           fer-ho per a totes les persones que han fet sol·licitud.
        
           Una vegada acabada la llista de les persones que han fet sol·licitud
           acaba l'adjudicació.
        
           Treure un llistat de les persones que han obtingut plaça i quina, 
           i un altre amb els llocs de feina que han quedat deserts.
          
        */
        
        return ("Procediment acabat");
    }


}

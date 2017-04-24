/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.impl.GrpaveDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mapping.Grpave;
import mapping.Usuario;

/**
 *
 * @author Eduardo
 */
public class Agregar extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
        Usuario em = new Usuario();
        String datos = "";
        em = (Usuario) sesion.getAttribute("Empleado");
        String id = request.getParameter("id").trim();
        String pdf = request.getParameter("pdf").trim();
        String calle = request.getParameter("calle").trim().toUpperCase();
        String colonia = request.getParameter("colonia").trim().toUpperCase();
        int cp = Integer.parseInt(request.getParameter("CP").trim().toUpperCase());
        String delegacion = request.getParameter("delegacion").trim().toUpperCase();
        String entidad = request.getParameter("entidad").trim().toUpperCase();
        int ano = Integer.parseInt(request.getParameter("ano").trim());
        String tipo = request.getParameter("tipo").trim();
        
        
        try {
            GrpaveDaoImpl dao = new GrpaveDaoImpl();
            Grpave d = new Grpave();
            d.setIdGrpAve(id);
            d.setCalle(calle);
            d.setColonia(colonia);
            d.setCp(cp);
            d.setDelegacion(delegacion);
            d.setEntidad(entidad);
            d.setFecha(ano);
            d.setTipo(tipo);
            d.setArchivo(pdf);
            d.setEstado("Capturado");
            d.setIdusuario(em.getIdusuario());
            d.setDropbox(0);
            
            dao.insertar(d);
            response.sendRedirect("jsps/Producto/Correcto.jsp");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.impl.GrpaveDaoImpl;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mapping.Grpave;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

/**
 *
 * @author Eduardo
 */
public class Upload extends HttpServlet {

    String ruta = "", direccion = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ruta = getServletContext().getRealPath("/");

        try {

            //  direccion ="C:\\wamp\\www\\disfracesdepelicula.com\\resourceweb\\images\\productos\\";
            direccion = ruta + "/Avaluos/";
            //direccion = ruta + "/Avaluos/";
            File destino = new File(direccion);
            ServletRequestContext src = new ServletRequestContext(request);

            if (ServletFileUpload.isMultipartContent(src)) {
                DiskFileItemFactory factory = new DiskFileItemFactory((1024 * 1024), destino);
                ServletFileUpload upload = new ServletFileUpload(factory);

                java.util.List lista = upload.parseRequest(src);
                File file = null;
                java.util.Iterator it = lista.iterator();

                while (it.hasNext()) {
                    FileItem item = (FileItem) it.next();
                    /*  60*/ file = new File(item.getName());
                    /*  61*/ int a = file.getName().indexOf(".pdf");
                    /*  62*/ if (a != -1) {
                        /*  63*/ GrpaveDaoImpl dao = new GrpaveDaoImpl();
                        /*  64*/ Grpave ap = new Grpave();
                        /*  65*/ ap = dao.Buscar(file.getName().replaceAll(".pdf", ""));
                        /*  66*/ if (ap == null) {
                            /*  67*/ item.write(new File(destino, file.getName()));
                            /*  68*/ response.sendRedirect((new StringBuilder()).append("jsps/Producto/captura.jsp?id=").append(file.getName().replaceAll(".pdf", "")).append("&pdf=").append(file.getName()).append("").toString());
                        } else {
                            /*  70*/ response.sendRedirect("jsps/Producto/Error.jsp?op=2");
                        }
                    } else {
                        /*  73*/ response.sendRedirect("jsps/Producto/Error.jsp?op=1");
                    }

                } // end while
            }

            //   
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
        } catch (Exception ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
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

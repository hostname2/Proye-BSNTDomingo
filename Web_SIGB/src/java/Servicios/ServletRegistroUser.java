/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Beans.Auxiliar;
import SIGB.Modelo.Dao.GestorDao_Persona;
import SIGB.Modelo.Dao.GestorDao_Usuario;
import SIGB.Modelo.Entidades.Persona;
import SIGB.Modelo.Entidades.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marvin
 */
public class ServletRegistroUser extends HttpServlet {

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
        String destino = "cliente.jsp";
        
        HttpSession sesion_error = request.getSession(true);
        String error = "";
        
        GestorDao_Persona gP = GestorDao_Persona.getInstancia();
        GestorDao_Usuario gU = GestorDao_Usuario.getInstancia();

        String sl_contrasena = request.getParameter("contrasena");
        boolean bl_tipo = false;
                //Boolean.valueOf(request.getParameter("tipo"));
        String sl_id = Auxiliar.checkId(request.getParameter("cedula"));
        String sl_nombre = request.getParameter("nombre");
        String sl_apellido1 = request.getParameter("apellido1");
        String sl_apellido2 = request.getParameter("apellido2");
        String sl_email = request.getParameter("correo");

        String sl_fecNac = request.getParameter("fechanaci");
       
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE MMM dd yyyy HH:mm:ss a");
        Date date = new Date();
        try {
            date = formatter.parse(sl_fecNac);
        } catch (ParseException ex) {

        }

        int il_telefono = Integer.parseInt(request.getParameter("telefono"));
        String sl_direccion = request.getParameter("direccion");
        Persona p = new Persona(sl_id, sl_nombre, sl_apellido1, sl_apellido2, sl_email, date, il_telefono, sl_direccion);
        Usuario u = new Usuario(sl_contrasena, bl_tipo, p);
        try {
            gP.agregarPersona(p);
            gU.agregarUsuario(u);
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario", u);
            response.sendRedirect(destino);
        } catch (SQLException ex) {
            
            error = "Error al registrar Usuario, intentelo nuevamente..";
            sesion_error.setAttribute("error", error + "_" + "formulario-registro.jsp");
            response.sendRedirect("paginaError.jsp");
            
            Logger.getLogger(ServletRegistroUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            
            error = "Error al registrar Usuario, intentelo nuevamente..";
            sesion_error.setAttribute("error", error + "_" + "formulario-registro.jsp");
            response.sendRedirect("paginaError.jsp");
            
            Logger.getLogger(ServletRegistroUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
            error = "Error al registrar Usuario, intentelo nuevamente..";
            sesion_error.setAttribute("error", error + "_" + "formulario-registro.jsp");
            response.sendRedirect("paginaError.jsp");
            
            Logger.getLogger(ServletRegistroUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
            error = "Error al registrar Usuario, intentelo nuevamente..";
            sesion_error.setAttribute("error", error + "_" + "formulario-registro.jsp");
            response.sendRedirect("paginaError.jsp");
            
            Logger.getLogger(ServletRegistroUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        System.out.println("hola");

//        if (Formulario.validacion(request, response)) {
//            if (this.verificarDatos(sl_contrasena, sl_id, sl_nombre, sl_apellido1, sl_apellido2, sl_email, sl_fecNac, il_telefono, sl_direccion)) {
//
//                try {
//                    if (pf_sUD.agregarUsuario(new Usuario(sl_contrasena, bl_tipo, new Persona(sl_id, sl_nombre, sl_apellido1, sl_apellido2, sl_email, dl_fecha, il_telefono, sl_direccion)))) {
//                        destino = "exito.jsp?exito=2";
//                    } else {
//                        destino = "error.jsp?error=4";
//                    }
//                } catch (Exception ex) {
//                }
//                
//            }
//        } else {
//            destino = "error.jsp?error=24";
//        }
//
//        response.sendRedirect(destino);
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
    

}

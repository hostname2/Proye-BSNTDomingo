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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Roberto
 */
public class SeveltLogin extends HttpServlet {

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
        response.setHeader("cache-control", "no-cache, no-store, must-revalidate");

        GestorDao_Usuario gDB = GestorDao_Usuario.getInstancia();
        GestorDao_Persona gDBP = GestorDao_Persona.getInstancia();

        boolean usuarioValido = false;

        String usuario = Auxiliar.checkId(request.getParameter("cedula"));
        String password = request.getParameter("contrasena");
        
        if (usuario != null && password != null) {
            usuarioValido = gDB.verificarUsuario(
                    usuario, password);
        }
        HttpSession sesion_error = request.getSession(true);

        String error = "";
        if (usuarioValido) {

            //Persona e = null;
            Usuario usu = null; 
            try {
                //e = gDBP.getPersona(usuario);
                usu = gDB.getUsuario(usuario);
                System.out.println(usu.toString());
            } catch (Exception ex) {
                Logger.getLogger(SeveltLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario", usu);

            sesion.setMaxInactiveInterval(60 * 3);
            
            if (!usu.isPn_sTipo()) {

                response.sendRedirect("cliente.jsp");

            } else {

                response.sendRedirect("administracion.jsp");

            }

        } else {

            error = "No existe el usuario ó contraseña incorrecta";
            sesion_error.setAttribute("error", error + "_" + "index.jsp");
            response.sendRedirect("paginaError.jsp");
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

}

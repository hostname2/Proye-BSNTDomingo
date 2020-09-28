/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import SIGB.Modelo.Dao.GestorDao_Documento;
import SIGB.Modelo.Entidades.Documento;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

@WebServlet(
        name = "ServletBusquedaDocumentos",
        urlPatterns = {"/ServletBusquedaDocumentos"}
)
/**
 *
 * @author sebas
 */
@MultipartConfig
public class ServletBusquedaDocumentos extends HttpServlet {

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
            System.out.println("Aca se cargarian los datos");
            JSONObject r = null;

            Enumeration<String> p = request.getParameterNames();
            String dato = null;
            while (p.hasMoreElements()) {
                String n = p.nextElement();
                String[] v = request.getParameterValues(n);
                if (v.length == 1) {
                    dato = v[0];
                }
            }
            if (isNumeric(dato)) {
                r = this.DocumentosJson(Integer.parseInt(dato));
            }

            if (r != null) {
                out.println(r.toString(4));
            }
            System.out.printf("Datos enviados:\n%s\n", r.toString(4));
        }
    }

    private JSONObject DocumentosJson(int porDato) {
        System.out.println("Aca se cargarian los datos con la informacion de ");
        //Documento doc = new Documento(0, "Accion", "Ingles", "2000", "casas", "pepe camacho", "ciencias", "editorial", "muchas paginas", "12345", 3, "bueno", "7410", "fisico", "Articulo");
        Documento doc = null;
        try {
            doc = pf_sGD.getDocumento(porDato);
            System.out.println(doc.toString());
        }
         catch (Exception ex) {
//            Logger.getLogger(ServletBusquedaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cae en excepcion");
        }
        JSONObject r = new JSONObject();
        if (doc != null) {
        r.put("pn_sIdDocumento", doc.getPn_sIdDocumento());
        r.put("pn_sClasicación", doc.getPn_sClasicación());
        r.put("pn_sIdioma", doc.getPn_sIdioma());
        r.put("pn_sFechaEdicion", doc.getPn_sFechaEdicion());
        r.put("pn_sTitulo", doc.getPn_sTitulo());
        r.put("pn_sAutor", doc.getPn_sAutor());
        r.put("pn_sMateria", doc.getPn_sMateria());
        r.put("pn_sLugEditorial", doc.getPn_sLugEditorial());
        r.put("pn_sDesFisica", doc.getPn_sDesFisica());
        r.put("pn_sISBN", doc.getPn_sISBN());
        r.put("pn_sEjemplares", doc.getPn_sEjemplares());
        r.put("pn_sNota", doc.getPn_sNota());
        r.put("pn_sTipo", doc.getPn_sTipo());
        r.put("pn_sISN", doc.getPn_sISN());
        r.put("pn_sFormatoDoc", doc.getPn_sFormatoDoc());
        }

        //System.out.printf("Datos enviados:\n%s\n", r.toString(4));
        return r;
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
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

    private final GestorDao_Documento pf_sGD = GestorDao_Documento.getInstancia();
}

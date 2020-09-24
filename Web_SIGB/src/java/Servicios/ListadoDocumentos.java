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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet(
        name = "ListadoDocumentos",
        urlPatterns = {"/ListadoDocumentos"}
)
/**
 *
 * @author sebas
 */
public class ListadoDocumentos extends HttpServlet {

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
            out.println("<title>Servlet ListadoDocumentos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListadoDocumentos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private JSONObject lista_documentos() {

        List<Documento> lista = new ArrayList<>();

        lista = pf_sGD.obtenerListadoDocs();

        JSONObject obj = toJSON(lista);

        return obj;
    }

    public JSONObject toJSON(List<Documento> docs) {
        JSONArray a = new JSONArray();
        docs.forEach((p) -> {
            a.put(toJSON(p));
        });
        JSONObject r = new JSONObject();
        r.put("lista-libros", a);
        return r;
    }

    public JSONObject toJSON(Documento d) {
        JSONObject r = new JSONObject();
        r.put("pn_sIdDocumento", d.getPn_sIdDocumento());
        r.put("pn_sClasicación", d.getPn_sClasicación());
        r.put("pn_sIdioma", d.getPn_sIdioma());
        r.put("pn_sFechaEdicion", d.getPn_sFechaEdicion());
        r.put("pn_sTitulo", d.getPn_sTitulo());
        r.put("pn_sAutor", d.getPn_sAutor());
        r.put("pn_sMateria", d.getPn_sMateria());
        r.put("pn_sLugEditorial", d.getPn_sLugEditorial());
        r.put("pn_sDesFisica", d.getPn_sDesFisica());
        r.put("pn_sISBN", d.getPn_sISBN());
        r.put("pn_sEjemplares", d.getPn_sEjemplares());
        r.put("pn_sNota", d.getPn_sNota());
        r.put("pn_sTipo", d.getPn_sTipo());
        r.put("pn_sISN", d.getPn_sISN());
        r.put("pn_sFormatoDoc", d.getPn_sFormatoDoc());
        return r;
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

package Sevicios;

import SIGB.Modelo.Dao.GestorDao_Documento;
import SIGB.Modelo.Entidades.Persona;
import SIGB.Modelo.Entidades.Usuario;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletEliminarDocumento extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String destino = "registroAceptado.jsp";

        int sl_numero = Integer.parseInt(request.getParameter("idDocumento"));

        if (Formulario.validacion(request, response)) {

            try {
                if (pf_sDD.eliminarDocumento(sl_numero)) {
                    destino = "exito.jsp?exito=2";
                } else {
                    destino = "error.jsp?error=4";
                }
            } catch (Exception ex) {
            }

        } else {
            destino = "error.jsp?error=24";
        }

        response.sendRedirect(destino);
    }

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private final GestorDao_Documento pf_sDD = GestorDao_Documento.getInstancia();

}

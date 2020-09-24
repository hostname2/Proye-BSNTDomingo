package Servicios;

import Beans.Auxiliar;
import SIGB.Modelo.Dao.GestorDao_Usuario;
import SIGB.Modelo.Entidades.Persona;
import SIGB.Modelo.Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EliminarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String destino = "";

        String sl_id = this.checkId(request.getParameter("id"));

        HttpSession sesion_error = request.getSession(true);
        String mensaje = "";

        if (Auxiliar.validacion(request, response)) {
            if (sl_id != null) {

                try {
                    if (pf_sUD.eliminarUsuario(sl_id)) {
                        mensaje = "Usuario Eliminado con exito";
                        sesion_error.setAttribute("Mensaje", mensaje + "_" + "index.jsp");
                        destino = "paginaError.jsp";
                    } else {
                        mensaje = "Error al eliminar Usuario";
                        sesion_error.setAttribute("Mensaje", mensaje + "_" + "index.jsp");
                        destino = "paginaError.jsp";
                    }
                } catch (Exception ex) {
                    mensaje = "Error al eliminar Usuario";
                    sesion_error.setAttribute("Mensaje", mensaje + "_" + "index.jsp");
                    destino = "paginaError.jsp";
                }

            } else {
                mensaje = "Error, faltan datos para eliminar el Usuario";
                sesion_error.setAttribute("Mensaje", mensaje + "_" + "index.jsp");
                destino = "paginaError.jsp";
            }
            
        } else {
            mensaje = "Error al eliminar Usuario";
            sesion_error.setAttribute("Mensaje", mensaje + "_" + "index.jsp");
            destino = "paginaError.jsp";
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

    private String checkId(String txt) {
        String r = txt;

        Pattern pat = Pattern.compile("([1-9,A])-?([0-9]{4})-?([0-9]{4})");
        Matcher m = pat.matcher(txt);
        if (m.find()) {
            r = String.format("%s%s%s", m.group(1), m.group(2), m.group(3));
        }

        return r;
    }

    private final GestorDao_Usuario pf_sUD = GestorDao_Usuario.getInstancia();

}

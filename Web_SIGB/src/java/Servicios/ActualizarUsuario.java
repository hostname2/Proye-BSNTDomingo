
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

public class ActualizarUsuario extends HttpServlet {

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
        
        HttpSession sesion = request.getSession(true);
        Usuario us = (Usuario) sesion.getAttribute("usuario");

        String sl_contrasena = us.getPn_sContrasena();
        boolean bl_tipo = us.isPn_sTipo();
                //Boolean.valueOf(request.getParameter("tipo"));
        String sl_id = us.getPn_pPersona().getPn_sId();
        String sl_nombre = Auxiliar.eliminarEspacios(request.getParameter("nombre"));
        String sl_apellido1 = Auxiliar.eliminarEspacios(request.getParameter("apellido1"));
        String sl_apellido2 = Auxiliar.eliminarEspacios(request.getParameter("apellido2"));
        String sl_email = Auxiliar.eliminarEspacios(request.getParameter("correo"));
        Date date = us.getPn_pPersona().getPn_sFecNac();
        int il_telefono = Integer.parseInt(Auxiliar.eliminarEspacios(request.getParameter("telefono")));
        String sl_direccion = request.getParameter("direccion");

        HttpSession sesion_error = request.getSession(true);
        String mensaje = "";

        if (Auxiliar.validacion(request, response)) {
            if (this.verificarDatos(sl_nombre, sl_apellido1, sl_apellido2, sl_email, il_telefono, sl_direccion)) {

                try {
                    if (pf_sUD.actualizarUsuario(new Usuario(sl_contrasena, bl_tipo, new Persona(sl_id, sl_nombre, sl_apellido1, sl_apellido2, sl_email, date, il_telefono, sl_direccion)))) {
                        mensaje = "Usuario Actualizado con exito";
                        sesion_error.setAttribute("Mensaje", mensaje + "_" + "cliente.jsp");
                        destino = "paginaError.jsp";
                    } else {
                        mensaje = "Faltan datos para actualizar Usuario";
                        sesion_error.setAttribute("Mensaje", mensaje + "_" + "cliente.jsp");
                        destino = "paginaError.jsp";
                    }
                } catch (Exception ex) {
                    mensaje = "Error al actualizar Usuario";
                    sesion_error.setAttribute("Mensaje", mensaje + "_" + "cliente.jsp");
                    destino = "paginaError.jsp";
                }

            }
        } else {
            mensaje = "Error al actualizar Usuario";
            sesion_error.setAttribute("Mensaje", mensaje + "_" + "cliente.jsp");
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

    private boolean verificarDatos(String sl_nombre, String sl_apellido1, String sl_apellido2, String sl_email, int il_telefono, String sl_direccion) {
        if ( sl_nombre != null && sl_apellido1 != null && sl_apellido2 !=null && sl_email != null && il_telefono != 0 && sl_direccion != null  && sl_nombre != null) {
            return true;
        }
        else{
            return false;
        }
    }

    private final GestorDao_Usuario pf_sUD = GestorDao_Usuario.getInstancia();

}

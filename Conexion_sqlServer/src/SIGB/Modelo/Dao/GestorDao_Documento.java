/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGB.Modelo.Dao;

import SIGB.Modelo.Dao.IMEC.IMEC_Documento;
import SIGB.Modelo.Dao.IMEC.IMEC_Persona;
import SIGB.Modelo.Datos.GestorBD;
import SIGB.Modelo.Entidades.Documento;
import SIGB.Modelo.Entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Marvin
 */
public class GestorDao_Documento {

    public GestorDao_Documento() {
        bd = GestorBD.obtenerInstancia();
    }

    public static GestorDao_Documento getInstancia() {
        if (instancia == null) {
            instancia = new GestorDao_Documento();
        }
        return instancia;
    }

    private Connection obtenerConexion() {
        return bd.obtenerConexion();
    }

    private void cerrarConexion() {
        bd.closeConnection();
    }

//    public List<Moneda> obtenerLista() {
//        List<Moneda> monedas = new ArrayList<>();
//
//        // Abre una conexión a la base de datos y carga la lista de usuarios.
//        try {
//            Connection cnx = bd.obtenerConexion();
//            Statement stm = cnx.createStatement();
//            ResultSet rs = stm.executeQuery(IMEC_Moneda.LISTAR.obtenerComando());
//            while (rs.next()) {
//                Moneda registro = new Moneda(
//                        rs.getString("nombre"),
//                        rs.getString("descripcion"),
//                        rs.getString("simbolo"),
//                        rs.getDouble("tipo_cambio_compra"),
//                        rs.getDouble("tipo_cambio_venta")
//                );
//                monedas.add(registro);
//            }
//        } catch (SQLException ex) {
//            System.err.printf("Excepción: '%s'%n", ex.getMessage());
//        } finally {
//            cerrarConexion();
//        }
//
//        return monedas;
//    }
//
//    public String listaMonedasHTML() {
//        StringBuilder r = new StringBuilder();
//        List<Moneda> monedas = obtenerLista();
//        if (monedas.size() > 0) {
//            r.append("<select id=\"TipoMoneda\" name=\"TipoMoneda\" size=\"1\">\n");
//            for (Moneda m : monedas) {
//                r.append(String.format("\t<option value=\"%s\">%s</option>%n", m.getId_Moneda(), m.getDescripcion()));
//            }
//            r.append("</select>\n");
//        } else {
//            r.append("<p>(No hay registros en la base de datos.)</p>");
//        }
//
//        return r.toString();
//    }
//
//    public static String listaMonedasHTML(GestorDao_Documento g) {
//        return g.listaMonedasHTML();
//    }
//    public Moneda getMoneda(String idMoneda) throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException,
//            Exception {
//        Moneda m = new Moneda();
//        try (Connection cnx = obtenerConexion();
//                PreparedStatement stm = cnx.prepareStatement(IMEC_Moneda.CONSULTAR.obtenerComando())) {
//
//            stm.clearParameters();
//            stm.setString(1, idMoneda);
//
//            try (ResultSet rs = stm.executeQuery()) {
//                if (rs.next()) {
//
//                    m.setId_Moneda(rs.getString("nombre"));
//                    m.setDescripcion(rs.getString("Descripcion"));
//                    m.setSimbolo(rs.getString("simbolo"));
//                    m.setTipo_Cambio_compra(rs.getDouble("tipo_cambio_compra"));
//                    m.setTipo_Cambio_venta(rs.getDouble("tipo_cambio_venta"));
//                } else {
//                    throw new Exception(String.format("NO SE ENCUENTRA EL MONEDA: %d", idMoneda));
//                }
//            } finally {
//                cerrarConexion();
//            }
//        }
//        return m;
//    }
    public boolean agregarDocumento(Documento m) throws SQLException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {

        boolean exito = false;

        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Documento.INSERTAR.obtenerComando())) {
            stm.clearParameters();

            stm.setString(1, m.getPn_sClasicación());
            stm.setString(2, m.getPn_sIdioma());
            stm.setString(3, m.getPn_sFechaEdicion());
            stm.setString(4, m.getPn_sTitulo());
            stm.setString(5, m.getPn_sAutor());
            stm.setString(6, m.getPn_sMateria());
            stm.setString(7, m.getPn_sLugEditorial());
            stm.setString(8, m.getPn_sDesFisica());
            stm.setString(9, m.getPn_sISBN());
            stm.setInt(10, m.getPn_sEjemplares());
            stm.setString(11, m.getPn_sNota());
            stm.setString(12, m.getPn_sISN());
            stm.setString(13, m.getPn_sFormatoDoc());
            stm.setString(14, m.getPn_sTipo());

            exito = stm.executeUpdate() == 1;

//            if (stm.executeUpdate() != 1) {
//                throw new SQLException();
//            }
        } finally {
            cerrarConexion();
        }
        return exito;

    }

    public boolean actualizarDocumento(Documento m) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {

        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Documento.MODIFICAR.obtenerComando())) {
            stm.clearParameters();

            stm.setString(1, m.getPn_sClasicación());
            stm.setString(2, m.getPn_sIdioma());
            stm.setString(3, m.getPn_sFechaEdicion());
            stm.setString(4, m.getPn_sTitulo());
            stm.setString(5, m.getPn_sAutor());
            stm.setString(6, m.getPn_sMateria());
            stm.setString(7, m.getPn_sLugEditorial());
            stm.setString(8, m.getPn_sDesFisica());
            stm.setString(9, m.getPn_sISBN());
            stm.setInt(10, m.getPn_sEjemplares());
            stm.setString(11, m.getPn_sNota());
            stm.setString(12, m.getPn_sISN());
            stm.setString(13, m.getPn_sFormatoDoc());
            stm.setString(14, m.getPn_sTipo());
            stm.setInt(15, m.getPn_sIdDocumento());

            exito = stm.executeUpdate() == 1;
//            if (stm.executeUpdate() != 1) {
//                throw new SQLException();
//            }

        } finally {
            cerrarConexion();
        }
        return exito;
    }

    public boolean eliminarDocumento(int idDocumento) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Documento.EXCLUIR.obtenerComando())) {
            stm.clearParameters();
            stm.setInt(1, idDocumento);

            exito = stm.executeUpdate() == 1;
//            if (stm.executeUpdate() != 1) {
//                System.err.printf("NO SE PUEDE ELIMINAR PRODUCTO: '%s'", codigo);
//
//            }
        }
        return exito;
    }

    public Documento getDocumento(int idDocumento) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {
        Documento m = new Documento();
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Documento.CONSULTAR.obtenerComando())) {

            stm.clearParameters();
            stm.setInt(1, idDocumento);

            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {

                    m.setPn_sIdDocumento(rs.getInt("idDocumento"));
                    m.setPn_sClasicación(rs.getString("Clasificacion"));
                    m.setPn_sIdioma(rs.getString("Idioma"));
                    m.setPn_sFechaEdicion(rs.getString("Fec_edicion"));
                    m.setPn_sTitulo(rs.getString("Titulo"));
                    m.setPn_sAutor(rs.getString("Autor"));
                    m.setPn_sMateria(rs.getString("Materia"));
                    m.setPn_sLugEditorial(rs.getString("Lugar_Editorial"));
                    m.setPn_sDesFisica(rs.getString("Des_Fisica"));
                    m.setPn_sISBN(rs.getString("ISBN"));
                    m.setPn_sEjemplares(rs.getInt("Ejemplares"));
                    m.setPn_sNota(rs.getString("Nota"));
                    m.setPn_sNota(rs.getString("ISN"));
                    m.setPn_sNota(rs.getString("Formato_Doc"));
                    m.setPn_sNota(rs.getString("Tipo_Nombre"));

//                  
                } else {
                    throw new Exception(String.format("NO SE ENCUENTRA CUENTA: %d", idDocumento));
                }
            }
        }
        return m;
    }

    private static GestorDao_Documento instancia = null;
    private GestorBD bd = null;

}

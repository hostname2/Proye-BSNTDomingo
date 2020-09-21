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
import SIGB.Modelo.Util.Utiles;
import java.sql.Connection;
import java.sql.Date;
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
public class GestorDao_Persona {

    public GestorDao_Persona() {
        bd = GestorBD.obtenerInstancia();
    }

    public static GestorDao_Persona getInstancia() {
        if (instancia == null) {
            instancia = new GestorDao_Persona();
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
    public boolean agregarPersona(Persona m) throws SQLException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {

        boolean exito = false;

        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Persona.INSERTAR.obtenerComando())) {
            stm.clearParameters();

            stm.setString(1, m.getPn_sId());
            stm.setString(2, m.getPn_sNombre());
            stm.setString(3, m.getPn_sApellido1());
            stm.setString(4, m.getPn_sApellido2());
            stm.setString(5, m.getPn_sEmail());
            stm.setDate(6, Utiles.util2sql(m.getPn_sFecNac()));
            stm.setInt(7, m.getPn_sTelefono());
            stm.setString(8, m.getPn_sDireccion());

            exito = stm.executeUpdate() == 1;

//            if (stm.executeUpdate() != 1) {
//                throw new SQLException();
//            }
        } finally {
            cerrarConexion();
        }
        return exito;

    }

    public boolean actualizarPersona(Persona m) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {

        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Persona.MODIFICAR.obtenerComando())) {
            stm.clearParameters();

            stm.setString(1, m.getPn_sNombre());
            stm.setString(2, m.getPn_sApellido1());
            stm.setString(3, m.getPn_sApellido2());
            stm.setString(4, m.getPn_sEmail());
            stm.setDate(5, Utiles.util2sql(m.getPn_sFecNac()));
            stm.setInt(6, m.getPn_sTelefono());
            stm.setString(7, m.getPn_sDireccion());
            stm.setString(8, m.getPn_sId());

            exito = stm.executeUpdate() == 1;
//            if (stm.executeUpdate() != 1) {
//                throw new SQLException();
//            }

        } finally {
            cerrarConexion();
        }
        return exito;
    }

    public boolean eliminarPersona(String idPersona) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Persona.EXCLUIR.obtenerComando())) {
            stm.clearParameters();
            stm.setString(1, idPersona);

            exito = stm.executeUpdate() == 1;
//            if (stm.executeUpdate() != 1) {
//                System.err.printf("NO SE PUEDE ELIMINAR PRODUCTO: '%s'", codigo);
//
//            }
        }
        return exito;
    }

    public Persona getPersona(String idPersona) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {
        Persona m = new Persona();
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Persona.CONSULTAR.obtenerComando())) {

            stm.clearParameters();
            stm.setString(1, idPersona);

            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {

                    m.setPn_sId(rs.getString("idPersona"));
                    m.setPn_sNombre(rs.getString("Nombre"));
                    m.setPn_sApellido1(rs.getString("Apellido1"));
                    m.setPn_sApellido2(rs.getString("Apellido2"));
                    m.setPn_sEmail(rs.getString("Email"));
                    m.setPn_sFecNac(rs.getDate("Fec_Nacimiento"));
                    m.setPn_sTelefono(rs.getInt("Telefono"));
                    m.setPn_sDireccion(rs.getString("Direccion"));

//                  
                } else {
                    throw new Exception(String.format("NO SE ENCUENTRA CUENTA: %d", idPersona));
                }
            }
        }
        return m;
    }

    private static GestorDao_Persona instancia = null;
    private GestorBD bd = null;

}

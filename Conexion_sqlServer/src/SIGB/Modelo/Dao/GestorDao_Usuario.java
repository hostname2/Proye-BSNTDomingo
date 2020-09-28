package SIGB.Modelo.Dao;

import SIGB.Modelo.Dao.IMEC.IMEC_Usuario;
import SIGB.Modelo.Datos.GestorBD;
import SIGB.Modelo.Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorDao_Usuario {

    public GestorDao_Usuario() {
        bd = GestorBD.obtenerInstancia();

    }

    public static GestorDao_Usuario getInstancia() {
        if (instancia == null) {
            instancia = new GestorDao_Usuario();
            instancia_1 = new GestorDao_Persona();
        }
        return instancia;
    }

    private Connection obtenerConexion() {
        return bd.obtenerConexion();
    }

    private void cerrarConexion() {
        bd.closeConnection();
    }

    public boolean agregarUsuario(Usuario u) throws SQLException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {

        boolean exito = false;

        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.INSERTAR.obtenerComando())) {
            stm.clearParameters();

            stm.setString(1, u.getPn_sContrasena());
            stm.setBoolean(2, u.isPn_sTipo());
            stm.setString(3, u.getPn_pPersona().getPn_sId());

            exito = stm.executeUpdate() == 1;

        }
        return exito;

    }

    public boolean actualizarUsuario(Usuario u) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {

        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.MODIFICAR.obtenerComando())) {
            stm.clearParameters();
            stm.setString(1, u.getPn_sContrasena());
            stm.setString(2, u.getPn_pPersona().getPn_sId());
            instancia_1.actualizarPersona(u.getPn_pPersona());

            exito = stm.executeUpdate() == 1;

        }
        return exito;
    }

    public boolean eliminarUsuario(String idUsuario) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        boolean exito = false;
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.EXCLUIR.obtenerComando())) {
            stm.clearParameters();
            stm.setString(1, idUsuario);

            exito = stm.executeUpdate() == 1;
            instancia_1.eliminarPersona(idUsuario);

        }
        return exito;
    }
    
    public boolean verificarUsuario(String usuario, String clave) {
        boolean encontrado = false;
        try {
            Connection cnx = obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.CONSULTAR_VERIFICAR.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, usuario);
                stm.setString(2, clave);
                ResultSet rs = stm.executeQuery();
                encontrado = rs.next();

            }

        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            cerrarConexion();
        }
        return encontrado;
    }
    
    public Usuario getUsuario(String id) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException,
            Exception {
        Usuario u = new Usuario();
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.CONSULTAR_ID.obtenerComando())) {

            stm.clearParameters();
            stm.setString(1, id);

            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {

                    u.setPn_sTipo(rs.getBoolean("Tipo"));
                    u.setPn_sContrasena(rs.getString("contrasenia")); 
                    u.setPn_pPersona(instancia_1.getPersona(rs.getString("Persona_idPersona")));

                } else {
                    throw new Exception(String.format("NO SE ENCUENTRA EL USUARIO: %d", id));
                }
            }
        }
        return u;
    }
    

    private static GestorDao_Usuario instancia = null;
    private static GestorDao_Persona instancia_1 = null;
    private GestorBD bd = null;

}

//    public Usuario getUsuario(String id) throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException,
//            Exception {
//        Usuario u = new Usuario();
//        try (Connection cnx = obtenerConexion();
//                PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.CONSULTAR_ID.obtenerComando())) {
//
//            stm.clearParameters();
//            stm.setString(1, id);
//
//            try (ResultSet rs = stm.executeQuery()) {
//                if (rs.next()) {
//
//                    u.setCodigoUsuario(rs.getString("id_usuario"));
//                    u.setPassword(rs.getString("clave_acceso"));
//                    u.setClaveVencida(rs.getInt("clave_vencida"));
//                    u.setRol(rs.getInt("rol"));
//
//                } else {
//                    throw new Exception(String.format("NO SE ENCUENTRA EL USUARIO: %d", id));
//                }
//            }
//        }
//        return u;
//    }
//    public boolean verificarUsuario(String usuario, String clave) {
//        boolean encontrado = false;
//        try {
//            Connection cnx = obtenerConexion();
//            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.CONSULTAR.obtenerComando())) {
//                stm.clearParameters();
//                stm.setString(1, usuario);
//                stm.setString(2, clave);
//                ResultSet rs = stm.executeQuery();
//                encontrado = rs.next();
//
//            }
//
//        } catch (SQLException ex) {
//            System.err.printf("Excepción: '%s'%n", ex.getMessage());
//        } finally {
//            cerrarConexion();
//        }
//        return encontrado;
//    }
//
//    public boolean verificarUsuarioNombre(String usuario) {
//        boolean encontrado = false;
//        try {
//            Connection cnx = obtenerConexion();
//            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.CONSULTAR_NOMBRE.obtenerComando())) {
//                stm.clearParameters();
//                stm.setString(1, usuario);
//                ResultSet rs = stm.executeQuery();
//                encontrado = rs.next();
//
//            }
//
//        } catch (SQLException ex) {
//            System.err.printf("Excepción: '%s'%n", ex.getMessage());
//        } finally {
//            cerrarConexion();
//        }
//        return encontrado;
//    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_sqlserver;


import SIGB.Modelo.Dao.GestorDao_Usuario;
import SIGB.Modelo.Datos.GestorBD;
import SIGB.Modelo.Entidades.Persona;
import SIGB.Modelo.Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class Conexion_sqlServer {

    static Connection conn = null;

    public static void main(String[] args) {

        try {
            GestorBD a = GestorBD.obtenerInstancia();
            a.obtenerConexion();
//            insertPrueba("0", "dd");
            Persona p = new Persona("123456", "Marvinggg", "Chavarría", "Bonilla", "march@gmail.com", new Date(), 12322, "heredia centro");
//            GestorDao_Persona gP= GestorDao_Persona.getInstancia();
//           // gP.agregarPersona(p);
//            System.out.println(gP.getPersona("123456"));
////            Documento d = new Documento(5, "Dramaqq", "espaniol", "2012", "casas", "pepe gonzales", "ciencias", "editorial", "muchas paginas", "12345", 3, "bueno", "0", "7410", "fisico");
//            GestorDao_Documento b = GestorDao_Documento.getInstancia();
////            b.actualizarDocumento(d);
//            System.out.println(b.getDocumento(5));
            Usuario u = new Usuario("123ww", false, p);
            GestorDao_Usuario us = GestorDao_Usuario.getInstancia();
            us.eliminarUsuario("123456");

        } catch (Exception ex) {
            Logger.getLogger(Conexion_sqlServer.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String serverName = "DESKTOP-M3J8M69";
//        String port= "1433";
//        String databaseName = "Prueba";
//        String username = "Marvin";
//        String Password = "root";
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbURL = "jdbc:sqlserver://"+serverName+"\\SQLEXPRESS:"+port+";databaseName="+databaseName+";user="+username+";password="+Password;
//             conn = DriverManager.getConnection(dbURL);
//            if (conn != null) {
//                System.out.println("Connected");
//                insertPrueba("Roberto", "888");
//            }else{
//                System.out.println("Malo");
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex, "Error al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
//
//        }

    }

    static public void insertPrueba(String nom, String ced) {
        String pruebaQuery = "insert into tipo(Tipo_Nombre) values (?) ";
        conn = GestorBD.obtenerInstancia().obtenerConexion();
        try {
            PreparedStatement pst = conn.prepareStatement(pruebaQuery);
            pst.setString(1, nom);
            //pst.setString(2, nom);
            int valor = pst.executeUpdate();
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "se inserto los datos correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Problema no se inserto los datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion_sqlServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

//boolean primo = false;
//int numero = 71;
//int contador = 0;
//for(int i = numero; i > 0; i--){
//     System.out.println("k"+i);
//    if(numero % i == 0 ){
//        System.out.println("ok"+contador);
//        contador++;
//    }
//}
//if(contador == 2){
//    primo = true;
//}
//JOptionPane.showMessageDialog(null, primo);
//}}

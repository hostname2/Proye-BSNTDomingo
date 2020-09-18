/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class Conexion_sqlServer {

    /**
     * @param args the command line arguments
     * String dbURL = "jdbc:sqlserver://DESKTOP-M3J8M69\\SQLEXPRESS:1433;databaseName=Prueba;user=Marvin;password=root";
     */
    public static void main(String[] args) {

        Connection conexion = null;
        String serverName = "DESKTOP-M3J8M69";
        String port= "1433";
        String databaseName = "Prueba";
        String username = "Marvin";
        String Password = "root";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://"+serverName+"\\SQLEXPRESS:"+port+";databaseName="+databaseName+";user="+username+";password="+Password;
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
            }else{
                System.out.println("Malo");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

    }

}

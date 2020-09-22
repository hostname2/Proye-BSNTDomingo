package SIGB.Modelo.Datos;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBD {

    private GestorBD() {
        System.out.printf("Inicializando manejador BD: '%s'..%n", CLASE_MANEJADOR);
        try {
            Class.forName(CLASE_MANEJADOR).newInstance();
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    public static GestorBD obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorBD();
        }
        return instancia;
    }

    public Connection obtenerConexion() {
//        Connection cnx = null;
        try {
            Properties prop = new Properties();
              prop.load(getClass().getResourceAsStream(PROPERTIES_FILE_NAME));
            
//            URL resourceUrl = getClass().getResource(PROPERTIES_FILE_NAME);
//            File file = new File(resourceUrl.toURI());
//            prop.load(new BufferedInputStream(new FileInputStream(file)));
            String port = prop.getProperty("database_port");
            String user = prop.getProperty("database_user");
            String protocolo = prop.getProperty("database_protocolo");
            String url_servidor = prop.getProperty("database_url_servidor");
            String password = prop.getProperty("database_password");
            String database = prop.getProperty("database_name");
             //String dbURL = "jdbc:sqlserver://"+serverName+"\\SQLEXPRESS:"+port+";databaseName="+databaseName+";user="+username+";password="+Password;
            String URL_conexion
                    = String.format(FORMATO_CONEXION, protocolo, url_servidor, port, database, user, password);
//          
            cnx = DriverManager.getConnection(URL_conexion);
            if (cnx != null) {
                System.out.println("Connected");
               
            }else{
                System.out.println("Malo");
            }

        } catch (IOException | SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }

    public void closeConnection() {
        if (cnx != null) {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.err.printf("Exception: '%s'%n", ex.getMessage());
            }
        }
    }

    private static final String CLASE_MANEJADOR = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String FORMATO_CONEXION = "%s//%s:%s;databaseName=%s;user=%s;password=%s";
    //private static final String FORMATO_CONEXION = "%s//%s\\SQLEXPRESS:%s;databaseName=%s;user=%s;password=%s";
    public static final String PROPERTIES_FILE_NAME = "configuracion.properties";
    private static GestorBD instancia = null;
    private Connection cnx = null;
}

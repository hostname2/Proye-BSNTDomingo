package SIGB.Modelo.Util;

public class Utiles {

    public static java.sql.Date util2sql(java.util.Date d) {

        // Esta conversión pierde el componente de tiempo (hora y minutos)
        // del parámetro.
        return new java.sql.Date(d.getTime());
    }

//    public static java.sql.Date convertUtilToSql(java.util.Date uDate) {
//        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
//        return sDate;
//    }
    public static java.sql.Timestamp util2Timestamp(java.util.Date d) {
        return new java.sql.Timestamp(d.getTime());
    }

    public static java.util.Date sql2Util(java.sql.Date sd) {
        return new java.util.Date(sd.getTime());
    }

    public static java.util.Date timestamp2Util(java.sql.Timestamp ts) {
        return new java.util.Date(ts.getTime());
    }

    public static String getPassword() {
        return getPassword(8);
    }

    private static String getPassword(int length) {
        return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
    }

    private static String getCuenta(int length) {
        return getPassword(NUMEROS, length);
    }

    private static String getPassword(String key, int length) {
        String pswd = "";

        for (int i = 0; i < length; i++) {
            pswd += (key.charAt((int) (Math.random() * key.length())));
        }

        return pswd;
    }

//    private static String getUserName(int length) {
//        return getPassword("usuario" + NUMEROS + MAYUSCULAS + MINUSCULAS, length);
//    }
    public static String getUserName() {
        String username = "user" + getPassword(4);
        return username;
    }

    public static String getNumeroCuenta() {
        String username = "CRC" + getCuenta(13);
        return username;
    }

    private static final String NUMEROS = "0123456789";

    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";

    public static String ESPECIALES = "#&¡¿?";

}

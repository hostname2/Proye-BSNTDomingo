
package Beans;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Auxiliar implements Serializable {
    
    public static boolean validacion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession sesionDisponible = request.getSession();
        if (sesionDisponible == null) {
            return false;
        }

        return true;
    }
    
}

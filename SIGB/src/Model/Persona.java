
package Model;

import java.util.Date;

public class Persona {
    
    private String pn_sId;
    private String pn_sNombre;
    private String pn_sApellidos;
    private String pn_sEmail;
    private Date pn_sFecNac;
    private int pn_sTelefono;
    private String pn_sDireccion;

    public Persona() {
        this("","","","", new Date(),0,"");
    }
    
    public Persona(String pn_sId, String pn_sNombre, String pn_sApellidos, String pn_sEmail, Date pn_sFecNac, int pn_sTelefono, String pn_sDireccion) {
        this.pn_sId = pn_sId;
        this.pn_sNombre = pn_sNombre;
        this.pn_sApellidos = pn_sApellidos;
        this.pn_sEmail = pn_sEmail;
        this.pn_sFecNac = pn_sFecNac;
        this.pn_sTelefono = pn_sTelefono;
        this.pn_sDireccion = pn_sDireccion;
    }

    public String getPn_sId() {
        return pn_sId;
    }

    public void setPn_sId(String pn_sId) {
        this.pn_sId = pn_sId;
    }

    public String getPn_sNombre() {
        return pn_sNombre;
    }

    public void setPn_sNombre(String pn_sNombre) {
        this.pn_sNombre = pn_sNombre;
    }

    public String getPn_sApellidos() {
        return pn_sApellidos;
    }

    public void setPn_sApellidos(String pn_sApellidos) {
        this.pn_sApellidos = pn_sApellidos;
    }

    public String getPn_sEmail() {
        return pn_sEmail;
    }

    public void setPn_sEmail(String pn_sEmail) {
        this.pn_sEmail = pn_sEmail;
    }

    public Date getPn_sFecNac() {
        return pn_sFecNac;
    }

    public void setPn_sFecNac(Date pn_sFecNac) {
        this.pn_sFecNac = pn_sFecNac;
    }

    public int getPn_sTelefono() {
        return pn_sTelefono;
    }

    public void setPn_sTelefono(int pn_sTelefono) {
        this.pn_sTelefono = pn_sTelefono;
    }

    public String getPn_sDireccion() {
        return pn_sDireccion;
    }

    public void setPn_sDireccion(String pn_sDireccion) {
        this.pn_sDireccion = pn_sDireccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "pn_sId=" + pn_sId + ", pn_sNombre=" + pn_sNombre + ", pn_sApellidos=" + pn_sApellidos + ", pn_sEmail=" + pn_sEmail + ", pn_sFecNac=" + pn_sFecNac + ", pn_sTelefono=" + pn_sTelefono + ", pn_sDireccion=" + pn_sDireccion + '}';
    }
    
}

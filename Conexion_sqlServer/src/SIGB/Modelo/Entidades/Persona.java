package SIGB.Modelo.Entidades;

import java.util.Date;

public class Persona {

    private String pn_sId;
    private String pn_sNombre;
    private String pn_sApellido1;
    private String pn_sApellido2;
    private String pn_sEmail;
    private Date pn_sFecNac;
    private int pn_sTelefono;
    private String pn_sDireccion;

    public Persona() {
        this("", "", "", "", "", new Date(), 0, "");
    }

    public Persona(String pn_sId, String pn_sNombre, String pn_sApellido1, String pn_sApellido2, String pn_sEmail, Date pn_sFecNac, int pn_sTelefono, String pn_sDireccion) {
        this.pn_sId = pn_sId;
        this.pn_sNombre = pn_sNombre;
        this.pn_sApellido1 = pn_sApellido1;
        this.pn_sApellido2 = pn_sApellido2;
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

    public String getPn_sApellido1() {
        return pn_sApellido1;
    }

    public void setPn_sApellido1(String pn_sApellido1) {
        this.pn_sApellido1 = pn_sApellido1;
    }

    public String getPn_sApellido2() {
        return pn_sApellido2;
    }

    public void setPn_sApellido2(String pn_sApellido2) {
        this.pn_sApellido2 = pn_sApellido2;
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
        return "Persona{" + "pn_sId=" + pn_sId + ", pn_sNombre=" + pn_sNombre + ", pn_sApellido1=" + pn_sApellido1 + ", pn_sApellido2=" + pn_sApellido2 + ", pn_sEmail=" + pn_sEmail + ", pn_sFecNac=" + pn_sFecNac + ", pn_sTelefono=" + pn_sTelefono + ", pn_sDireccion=" + pn_sDireccion + '}';
    }

}

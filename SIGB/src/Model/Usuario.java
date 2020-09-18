
package Model;

public class Usuario {
    
    private String pn_sContrasena;
    private boolean pn_sTipo;
    private String pn_sIdPersona;

    public Usuario() {
        this("", false, "");
    }

    public Usuario(String pn_sContrasena, boolean pn_sTipo, String pn_sIdPersona) {
        this.pn_sContrasena = pn_sContrasena;
        this.pn_sTipo = pn_sTipo;
        this.pn_sIdPersona = pn_sIdPersona;
    }

    public String getPn_sContrasena() {
        return pn_sContrasena;
    }

    public void setPn_sContrasena(String pn_sContrasena) {
        this.pn_sContrasena = pn_sContrasena;
    }

    public boolean isPn_sTipo() {
        return pn_sTipo;
    }

    public void setPn_sTipo(boolean pn_sTipo) {
        this.pn_sTipo = pn_sTipo;
    }

    public String getPn_sIdPersona() {
        return pn_sIdPersona;
    }

    public void setPn_sIdPersona(String pn_sIdPersona) {
        this.pn_sIdPersona = pn_sIdPersona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "pn_sContrasena=" + pn_sContrasena + ", pn_sTipo=" + pn_sTipo + ", pn_sIdPersona=" + pn_sIdPersona + '}';
    }
    
}

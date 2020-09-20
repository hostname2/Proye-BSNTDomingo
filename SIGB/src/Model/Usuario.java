
package Model;

public class Usuario {
    
    private String pn_sContrasena;
    private boolean pn_sTipo;
    private Persona pn_pPersona;

    public Usuario() {
        this("",false, new Persona());
    }

    public Usuario(String pn_sContrasena, boolean pn_sTipo, Persona pn_pPersona) {
        this.pn_sContrasena = pn_sContrasena;
        this.pn_sTipo = pn_sTipo;
        this.pn_pPersona = pn_pPersona;
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

    public Persona getPn_pPersona() {
        return pn_pPersona;
    }

    public void setPn_pPersona(Persona pn_pPersona) {
        this.pn_pPersona = pn_pPersona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "pn_sContrasena=" + pn_sContrasena + ", pn_sTipo=" + pn_sTipo + ", pn_pPersona=" + pn_pPersona + '}';
    }
    
}
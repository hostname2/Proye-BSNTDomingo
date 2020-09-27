package SIGB.Modelo.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Capacitacion {

    private int pn_sIdCapacitacion;
    private String pn_sNombre;
    private String pn_sDescripcion;
    private int pn_sCapacidad;
    private Usuario pn_sInstructor;
    private List<Usuario> pn_lParticipantes;

    public Capacitacion() {
        this(0, "", "", 0, new Usuario(), new ArrayList());
    }

    public Capacitacion(int pn_sIdCapacitacion, String pn_sNombre, String pn_sDescripcion, int pn_sCapacidad, Usuario pn_sInstructor, List<Usuario> pn_lParticipantes) {
        this.pn_sIdCapacitacion = pn_sIdCapacitacion;
        this.pn_sNombre = pn_sNombre;
        this.pn_sDescripcion = pn_sDescripcion;
        this.pn_sCapacidad = pn_sCapacidad;
        this.pn_sInstructor = pn_sInstructor;
        this.pn_lParticipantes = pn_lParticipantes;
    }

    public int getPn_sIdCapacitacion() {
        return pn_sIdCapacitacion;
    }

    public void setPn_sIdCapacitacion(int pn_sIdCapacitacion) {
        this.pn_sIdCapacitacion = pn_sIdCapacitacion;
    }

    public String getPn_sNombre() {
        return pn_sNombre;
    }

    public void setPn_sNombre(String pn_sNombre) {
        this.pn_sNombre = pn_sNombre;
    }

    public String getPn_sDescripcion() {
        return pn_sDescripcion;
    }

    public void setPn_sDescripcion(String pn_sDescripcion) {
        this.pn_sDescripcion = pn_sDescripcion;
    }

    public int getPn_sCapacidad() {
        return pn_sCapacidad;
    }

    public void setPn_sCapacidad(int pn_sCapacidad) {
        this.pn_sCapacidad = pn_sCapacidad;
    }

    public Usuario getPn_sInstructor() {
        return pn_sInstructor;
    }

    public void setPn_sInstructor(Usuario pn_sInstructor) {
        this.pn_sInstructor = pn_sInstructor;
    }

    public List<Usuario> getPn_lParticipantes() {
        return pn_lParticipantes;
    }

    public void setPn_lParticipantes(List<Usuario> pn_lParticipantes) {
        this.pn_lParticipantes = pn_lParticipantes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" + "pn_sIdCapacitacion=" + pn_sIdCapacitacion + ", pn_sNombre=" + pn_sNombre + ", pn_sDescripcion=" + pn_sDescripcion + ", pn_sCapacidad=" + pn_sCapacidad + ", pn_sInstructor=" + pn_sInstructor + ", pn_lParticipantes=" + pn_lParticipantes + '}';
    }

}

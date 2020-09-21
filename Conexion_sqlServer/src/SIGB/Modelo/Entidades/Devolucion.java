
package SIGB.Modelo.Entidades;

import java.util.Date;

public class Devolucion {
    
    private int pn_sIdDevolucion;
    private Prestamo pn_sPrestamo;
    private Date pn_sDevolucion;
    private int pn_sNoEjemplares;

    public Devolucion() {
        this(0,new Prestamo(),new Date(),0);
    }

    public Devolucion(int pn_sIdDevolucion, Prestamo pn_sPrestamo, Date pn_sDevolucion, int pn_sNoEjemplares) {
        this.pn_sIdDevolucion = pn_sIdDevolucion;
        this.pn_sPrestamo = pn_sPrestamo;
        this.pn_sDevolucion = pn_sDevolucion;
        this.pn_sNoEjemplares = pn_sNoEjemplares;
    }

    public int getPn_sIdDevolucion() {
        return pn_sIdDevolucion;
    }

    public void setPn_sIdDevolucion(int pn_sIdDevolucion) {
        this.pn_sIdDevolucion = pn_sIdDevolucion;
    }

    public Prestamo getPn_sPrestamo() {
        return pn_sPrestamo;
    }

    public void setPn_sPrestamo(Prestamo pn_sPrestamo) {
        this.pn_sPrestamo = pn_sPrestamo;
    }

    public Date getPn_sDevolucion() {
        return pn_sDevolucion;
    }

    public void setPn_sDevolucion(Date pn_sDevolucion) {
        this.pn_sDevolucion = pn_sDevolucion;
    }

    public int getPn_sNoEjemplares() {
        return pn_sNoEjemplares;
    }

    public void setPn_sNoEjemplares(int pn_sNoEjemplares) {
        this.pn_sNoEjemplares = pn_sNoEjemplares;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "pn_sIdDevolucion=" + pn_sIdDevolucion + ", pn_sPrestamo=" + pn_sPrestamo + ", pn_sDevolucion=" + pn_sDevolucion + ", pn_sNoEjemplares=" + pn_sNoEjemplares + '}';
    }
    
}

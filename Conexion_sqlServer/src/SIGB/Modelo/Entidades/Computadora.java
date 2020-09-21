
package SIGB.Modelo.Entidades;

public class Computadora {
    
    private int pn_sIdCompu;
    private boolean pn_sEstado;

    public Computadora() {
        this(0, false);
    }

    public Computadora(int pn_sIdCompu, boolean pn_sEstado) {
        this.pn_sIdCompu = pn_sIdCompu;
        this.pn_sEstado = pn_sEstado;
    }

    public int getPn_sIdCompu() {
        return pn_sIdCompu;
    }

    public void setPn_sIdCompu(int pn_sIdCompu) {
        this.pn_sIdCompu = pn_sIdCompu;
    }

    public boolean isPn_sEstado() {
        return pn_sEstado;
    }

    public void setPn_sEstado(boolean pn_sEstado) {
        this.pn_sEstado = pn_sEstado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "pn_sIdCompu=" + pn_sIdCompu + ", pn_sEstado=" + pn_sEstado + '}';
    }
    
}

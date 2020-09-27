package SIGB.Modelo.Entidades;

import java.util.Date;

public class Prestamo {

    private int pn_sIdPrestamo;
    private Usuario pn_sUsuaio;
    private int pn_sIdDocumento;
    private int pn_sIdComputadora;
    private Date pn_sFecInicial;
    private Date pn_sFechaFinal;

    public Prestamo() {
        this(0, new Usuario(), 0, 0, new Date(), new Date());
    }

    public Prestamo(int pn_sIdPrestamo, Usuario pn_sUsuaio, int pn_sIdDocumento, int pn_sIdComputadora, Date pn_sFecInicial, Date pn_sFechaFinal) {
        this.pn_sIdPrestamo = pn_sIdPrestamo;
        this.pn_sUsuaio = pn_sUsuaio;
        this.pn_sIdDocumento = pn_sIdDocumento;
        this.pn_sIdComputadora = pn_sIdComputadora;
        this.pn_sFecInicial = pn_sFecInicial;
        this.pn_sFechaFinal = pn_sFechaFinal;
    }

    public int getPn_sIdPrestamo() {
        return pn_sIdPrestamo;
    }

    public void setPn_sIdPrestamo(int pn_sIdPrestamo) {
        this.pn_sIdPrestamo = pn_sIdPrestamo;
    }

    public Usuario getPn_sUsuaio() {
        return pn_sUsuaio;
    }

    public void setPn_sUsuaio(Usuario pn_sUsuaio) {
        this.pn_sUsuaio = pn_sUsuaio;
    }

    public int getPn_sIdDocumento() {
        return pn_sIdDocumento;
    }

    public void setPn_sIdDocumento(int pn_sIdDocumento) {
        this.pn_sIdDocumento = pn_sIdDocumento;
    }

    public int getPn_sIdComputadora() {
        return pn_sIdComputadora;
    }

    public void setPn_sIdComputadora(int pn_sIdComputadora) {
        this.pn_sIdComputadora = pn_sIdComputadora;
    }

    public Date getPn_sFecInicial() {
        return pn_sFecInicial;
    }

    public void setPn_sFecInicial(Date pn_sFecInicial) {
        this.pn_sFecInicial = pn_sFecInicial;
    }

    public Date getPn_sFechaFinal() {
        return pn_sFechaFinal;
    }

    public void setPn_sFechaFinal(Date pn_sFechaFinal) {
        this.pn_sFechaFinal = pn_sFechaFinal;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "pn_sIdPrestamo=" + pn_sIdPrestamo + ", pn_sUsuaio=" + pn_sUsuaio + ", pn_sIdDocumento=" + pn_sIdDocumento + ", pn_sIdComputadora=" + pn_sIdComputadora + ", pn_sFecInicial=" + pn_sFecInicial + ", pn_sFechaFinal=" + pn_sFechaFinal + '}';
    }

}

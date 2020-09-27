package SIGB.Modelo.Entidades;

public class Auditoria {

    private int pn_sIdBitacora;
    private String pn_sBitacora;

    public Auditoria() {
        this(0, "");
    }

    public Auditoria(int pn_sIdBitacora, String pn_sBitacora) {
        this.pn_sIdBitacora = pn_sIdBitacora;
        this.pn_sBitacora = pn_sBitacora;
    }

    public int getPn_sIdBitacora() {
        return pn_sIdBitacora;
    }

    public void setPn_sIdBitacora(int pn_sIdBitacora) {
        this.pn_sIdBitacora = pn_sIdBitacora;
    }

    public String getPn_sBitacora() {
        return pn_sBitacora;
    }

    public void setPn_sBitacora(String pn_sBitacora) {
        this.pn_sBitacora = pn_sBitacora;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "pn_sIdBitacora=" + pn_sIdBitacora + ", pn_sBitacora=" + pn_sBitacora + '}';
    }

}

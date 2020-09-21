
package SIGB.Modelo.Entidades;

public class Documento {
    
    private int pn_sIdDocumento;
    private String pn_sClasicación;
    private String pn_sIdioma;
    private String pn_sFechaEdicion;
    private String pn_sTitulo;
    private String pn_sAutor;
    private String pn_sMateria;
    private String pn_sLugEditorial;
    private String pn_sDesFisica;
    private String pn_sISBN;
    private int pn_sEjemplares;
    private String pn_sNota;
    private String pn_sTipo;
    private String pn_sISN;
    private String pn_sFormatoDoc;  

    public Documento() {
        this(0,"","","","","","","","","",0,"","","","");
    }

    public Documento(int pn_sIdDocumento, String pn_sClasicación, String pn_sIdioma, String pn_sFechaEdicion, String pn_sTitulo, String pn_sAutor, String pn_sMateria, String pn_sLugEditorial, String pn_sDesFisica, String pn_sISBN, int pn_sEjemplares, String pn_sNota, String pn_sTipo, String pn_sISN, String pn_sFormatoDoc) {
        this.pn_sIdDocumento = pn_sIdDocumento;
        this.pn_sClasicación = pn_sClasicación;
        this.pn_sIdioma = pn_sIdioma;
        this.pn_sFechaEdicion = pn_sFechaEdicion;
        this.pn_sTitulo = pn_sTitulo;
        this.pn_sAutor = pn_sAutor;
        this.pn_sMateria = pn_sMateria;
        this.pn_sLugEditorial = pn_sLugEditorial;
        this.pn_sDesFisica = pn_sDesFisica;
        this.pn_sISBN = pn_sISBN;
        this.pn_sEjemplares = pn_sEjemplares;
        this.pn_sNota = pn_sNota;
        this.pn_sTipo = pn_sTipo;
        this.pn_sISN = pn_sISN;
        this.pn_sFormatoDoc = pn_sFormatoDoc;
    }

    public int getPn_sIdDocumento() {
        return pn_sIdDocumento;
    }

    public void setPn_sIdDocumento(int pn_sIdDocumento) {
        this.pn_sIdDocumento = pn_sIdDocumento;
    }

    public String getPn_sClasicación() {
        return pn_sClasicación;
    }

    public void setPn_sClasicación(String pn_sClasicación) {
        this.pn_sClasicación = pn_sClasicación;
    }

    public String getPn_sIdioma() {
        return pn_sIdioma;
    }

    public void setPn_sIdioma(String pn_sIdioma) {
        this.pn_sIdioma = pn_sIdioma;
    }

    public String getPn_sFechaEdicion() {
        return pn_sFechaEdicion;
    }

    public void setPn_sFechaEdicion(String pn_sFechaEdicion) {
        this.pn_sFechaEdicion = pn_sFechaEdicion;
    }

    public String getPn_sTitulo() {
        return pn_sTitulo;
    }

    public void setPn_sTitulo(String pn_sTitulo) {
        this.pn_sTitulo = pn_sTitulo;
    }

    public String getPn_sAutor() {
        return pn_sAutor;
    }

    public void setPn_sAutor(String pn_sAutor) {
        this.pn_sAutor = pn_sAutor;
    }

    public String getPn_sMateria() {
        return pn_sMateria;
    }

    public void setPn_sMateria(String pn_sMateria) {
        this.pn_sMateria = pn_sMateria;
    }

    public String getPn_sLugEditorial() {
        return pn_sLugEditorial;
    }

    public void setPn_sLugEditorial(String pn_sLugEditorial) {
        this.pn_sLugEditorial = pn_sLugEditorial;
    }

    public String getPn_sDesFisica() {
        return pn_sDesFisica;
    }

    public void setPn_sDesFisica(String pn_sDesFisica) {
        this.pn_sDesFisica = pn_sDesFisica;
    }

    public String getPn_sISBN() {
        return pn_sISBN;
    }

    public void setPn_sISBN(String pn_sISBN) {
        this.pn_sISBN = pn_sISBN;
    }

    public int getPn_sEjemplares() {
        return pn_sEjemplares;
    }

    public void setPn_sEjemplares(int pn_sEjemplares) {
        this.pn_sEjemplares = pn_sEjemplares;
    }

    public String getPn_sNota() {
        return pn_sNota;
    }

    public void setPn_sNota(String pn_sNota) {
        this.pn_sNota = pn_sNota;
    }

    public String getPn_sTipo() {
        return pn_sTipo;
    }

    public void setPn_sTipo(String pn_sTipo) {
        this.pn_sTipo = pn_sTipo;
    }

    public String getPn_sISN() {
        return pn_sISN;
    }

    public void setPn_sISN(String pn_sISN) {
        this.pn_sISN = pn_sISN;
    }

    public String getPn_sFormatoDoc() {
        return pn_sFormatoDoc;
    }

    public void setPn_sFormatoDoc(String pn_sFormatoDoc) {
        this.pn_sFormatoDoc = pn_sFormatoDoc;
    }

    @Override
    public String toString() {
        return "Documento{" + "pn_sIdDocumento=" + pn_sIdDocumento + ", pn_sClasicaci\u00f3n=" + pn_sClasicación + ", pn_sIdioma=" + pn_sIdioma + ", pn_sFechaEdicion=" + pn_sFechaEdicion + ", pn_sTitulo=" + pn_sTitulo + ", pn_sAutor=" + pn_sAutor + ", pn_sMateria=" + pn_sMateria + ", pn_sLugEditorial=" + pn_sLugEditorial + ", pn_sDesFisica=" + pn_sDesFisica + ", pn_sISBN=" + pn_sISBN + ", pn_sEjemplares=" + pn_sEjemplares + ", pn_sNota=" + pn_sNota + ", pn_sTipo=" + pn_sTipo + ", pn_sISN=" + pn_sISN + ", pn_sFormatoDoc=" + pn_sFormatoDoc + '}';
    }
    
}

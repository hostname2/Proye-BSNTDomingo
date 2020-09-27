package SIGB.Modelo.Dao.IMEC;

public enum IMEC_Documento {
    INSERTAR("INSERT INTO Documento (Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); "),
    CONSULTAR("SELECT * FROM Documento WHERE idDocumento = ?; "),
    LISTADO("SELECT * FROM Documento"),
    MODIFICAR("UPDATE Documento SET Clasificacion = ?, Idioma = ?, Fec_edicion = ?, Titulo = ?, Autor = ?, Materia = ?, Lugar_Editorial = ?, Des_Fisica = ?, ISBN = ?, Ejemplares = ?, Nota = ?, ISN = ?, Formato_Doc = ?, Tipo_Nombre = ? WHERE idDocumento = ?; "),
    EXCLUIR("DELETE FROM Documento WHERE idDocumento = ?; "),
    //LISTAR("SELECT nombre, descripcion, simbolo, tipo_cambio_compra, tipo_cambio_venta FROM moneda; "),
    VERIFICAR("");

    IMEC_Documento(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}

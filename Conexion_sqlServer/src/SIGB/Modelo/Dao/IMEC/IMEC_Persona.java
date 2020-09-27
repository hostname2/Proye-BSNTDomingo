package SIGB.Modelo.Dao.IMEC;

public enum IMEC_Persona {
    INSERTAR("INSERT INTO Persona (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)VALUES (?, ?, ?, ?, ?, ?, ?, ?); "),
    CONSULTAR("SELECT * FROM Persona WHERE idPersona = ?; "),
    MODIFICAR("UPDATE Persona SET Nombre = ?, Apellido1 = ?, Apellido2 = ?, Email = ?, Fec_Nacimiento = ?, Telefono = ?, Direccion = ? WHERE idPersona = ?; "),
    EXCLUIR("DELETE FROM Persona WHERE idPersona = ?; "),
    //LISTAR("SELECT nombre, descripcion, simbolo, tipo_cambio_compra, tipo_cambio_venta FROM moneda; "),
    VERIFICAR("");

    IMEC_Persona(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}

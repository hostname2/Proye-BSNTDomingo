package SIGB.Modelo.Dao.IMEC;

public enum IMEC_Usuario {
    INSERTAR("INSERT INTO Usuario (contrasenia, Tipo, Persona_idPersona) VALUES (?, ?, ?); "),
    // CONSULTAR_ID("SELECT * FROM Usuario WHERE id_usuario = ?; "),
    CONSULTAR("SELECT * FROM Usuario WHERE Persona_idPersona = ?; "),
    //CONSULTAR_NOMBRE("SELECT * FROM Usuario WHERE id_usuario = ?; "),
    MODIFICAR("UPDATE Usuario SET contrasenia = ? WHERE Persona_idPersona = ?; "),
    EXCLUIR("DELETE FROM Usuario WHERE Persona_idPersona=?; ");
    // LISTAR("SELECT id_usuario, clave, nombre, ultimo_acceso, prioridad FROM usuarios ORDER BY id_usuario; "),
    //VERIFICAR("SELECT id_usuario FROM usuarios WHERE id_usuario=? AND clave=?; ");

    IMEC_Usuario(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}

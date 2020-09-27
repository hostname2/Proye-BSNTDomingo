package SIGB.Modelo.Dao.IMEC;

public enum IMEC_Cuenta {
    INSERTAR("INSERT INTO Cuenta (num_cuenta, tipo_cuenta_id_tipo_cuenta, cliente_id_cliente, moneda_nombre, fecha_creacion, limite_transferencia_diaria, activa, saldo_inicial, fecha_ultima_aplicacion, saldo_final)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); "),
    CONSULTAR("SELECT * FROM Cuenta WHERE cliente_id_cliente = ?; "),
    CONSULTAR_NUMCUENTA("SELECT * FROM Cuenta WHERE num_cuenta = ?; "),
    MODIFICAR("UPDATE Cuenta SET tipo_cuenta_id_tipo_cuenta = ?, cliente_id_cliente = ?, moneda_nombre = ?, fecha_creacion = ?, limite_transferencia_diaria = ?, activa = ?, saldo_inicial = ?, fecha_ultima_aplicacion = ?, saldo_final = ? WHERE num_cuenta = ?; "),
    EXCLUIR("falta"),
    LISTARACTIVAS("SELECT activa FROM Cuenta WHERE cliente_id_cliente = ?;"),
    LISTAR("SELECT num_cuenta, cliente_id_cliente FROM Cuenta WHERE cliente_id_cliente = ?;"),
    VERIFICAR("SELECT num_cuenta FROM Cuenta WHERE num_cuenta=?; ");

    IMEC_Cuenta(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}

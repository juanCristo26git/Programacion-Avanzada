package edu.puj.model;

public class Postpago extends Cuenta {
    private long cargoFijo;

    public Postpago(long id, String numero) {
        super(id, Long.parseLong(numero));
        this.cargoFijo = 20000; // valor por defecto
    }


    public long obtenerPagoCuenta() {
        return 0;
    }
    }



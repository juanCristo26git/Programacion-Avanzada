package edu.puj.model;

import java.util.ArrayList;
import java.util.List;

public class Prepago extends Cuenta{
    private long numeroMinutos;
    private List<Recarga> recargas = new ArrayList<>();
    public Prepago(long id, String numero) {
        super(id, Long.parseLong(numero));
        this.numeroMinutos = 5; // valor por defecto por ahora
    }

    public long obtenerPagoCuenta() {
        return 0;
    }


}

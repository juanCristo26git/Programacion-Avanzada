package edu.puj.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public abstract class Cuenta implements Serializable {
    private long id;
    private long numero;
    private List<Llamada> llamadas = new ArrayList<>();

    public Cuenta(long id, long numero) {
        this.id = id;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public abstract long obtenerPagoCuenta();

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", numero=" + numero +
                '}';
    }
}

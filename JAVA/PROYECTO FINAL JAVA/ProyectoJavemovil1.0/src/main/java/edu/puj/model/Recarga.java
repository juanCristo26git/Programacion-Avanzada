package edu.puj.model;

import java.time.LocalDate;

public class Recarga {
    private long valor;
    private LocalDate fecha;

    public Recarga(long valor, LocalDate fecha) {
        this.valor = valor;
        this.fecha = fecha;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

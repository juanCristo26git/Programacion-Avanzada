package edu.puj.model;

import java.time.LocalDate;

public class LlamadaNacional extends Llamada {
    public LlamadaNacional(LocalDate fecha, long duracion, String telefonoDestinatario) {
        super(fecha, duracion, telefonoDestinatario);
    }

    @Override
    public long calcularValor() {
        return 0;
    }

}

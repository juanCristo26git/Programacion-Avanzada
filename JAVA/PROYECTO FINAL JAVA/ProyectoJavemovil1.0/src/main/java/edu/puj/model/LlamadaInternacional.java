package edu.puj.model;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada {
    private String paisDestino;

    public LlamadaInternacional(LocalDate fecha, long duracion, String telefonoDestinatario, String paisDestino) {
        super(fecha,duracion,telefonoDestinatario);
        this.paisDestino = paisDestino;
    }

    @Override
    public long calcularValor() {
        return 0;
    }

}

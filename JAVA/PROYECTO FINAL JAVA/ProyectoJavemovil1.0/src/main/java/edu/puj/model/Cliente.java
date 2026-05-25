package edu.puj.model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String identificacion;
    private String nombre;
    private String direccion;
    private String tipoId;

    public Cliente(String identificacion, String nombre, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoId = tipoId;
    }

    // Getters y Setters
    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTipoId() { return tipoId; }
    public void setTipoId(String tipoId) { this.tipoId = tipoId; }

    @Override
    public String toString() {
        return nombre + " (" + identificacion + tipoId +" )" + direccion;
    }
}


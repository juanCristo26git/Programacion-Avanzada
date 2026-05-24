package edu.puj.model;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String codigo;
    private Integer edad;
    Scanner sc = new Scanner(System.in);

    public Estudiante(String nombre, Integer edad, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Estudiante" +
                "nombre" + nombre + ", edad" + edad + ", codigo" + codigo;
    }
}
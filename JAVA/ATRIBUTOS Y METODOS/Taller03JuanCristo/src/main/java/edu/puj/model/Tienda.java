package edu.puj.model;

import java.util.ArrayList;


public class Tienda {

    private String nombre;


    private ArrayList<Producto> inventario;

    private static final double IVA = 0.19;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>(); // Lista vacía
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(Producto p) {
        this.inventario.add(p);
    }

    public void mostrarInventario() {
        System.out.println("\nInventario de " + this.nombre + ":");
        for (Producto p : this.inventario) {
            System.out.println(p);
        }
    }

    public static double calcularPrecioConIVA(double precioBase) {
        return precioBase * (1 + IVA);
    }
}

package edu.puj.model;

public class Producto {


    private String nombre;
    private double precio;
    private String categoria;
    private final String codigo;
    private static int contadorProductos = 0;


    public Producto(String nombre, double precio, String categoria) {

        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

        contadorProductos++;


        this.codigo = categoria.toUpperCase() + "-" + contadorProductos;

        System.out.println("Producto creado: " + this.nombre + " (Código: " + this.codigo + ")");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return this.codigo;
    }


    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + (int) porcentaje + "% a " + this.nombre);
        this.precio = this.precio * (1 - porcentaje / 100);
    }


    public void aplicarDescuento() {

        this.aplicarDescuento(10);
    }


    public static int getContadorProductos() {
        return contadorProductos;
    }

    public final void mostrarResumen() {
        System.out.println("Resumen → " + this.nombre
                + " | Código: " + this.codigo
                + " | Precio: $" + String.format("%,.0f", this.precio));
    }

    @Override
    public String toString() {
        return String.format("- %-15s | Código: %-8s | Precio: $%,.0f",
                this.nombre, this.codigo, this.precio);
    }
}

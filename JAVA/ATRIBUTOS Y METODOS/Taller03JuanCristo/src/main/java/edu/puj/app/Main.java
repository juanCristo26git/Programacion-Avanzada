package edu.puj.app;

import edu.puj.model.Tienda;
import edu.puj.model.Producto;

public class Main {

        public static void main(String[] args) {

            System.out.println("--- Sistema de Tienda ---");

            Tienda tienda = new Tienda("MiTienda");

            Producto tv      = new Producto("TV Samsung",  2000000, "ELEC");
            Producto camisa  = new Producto("Camisa Polo",   90000, "ROPA");
            Producto laptop  = new Producto("Laptop ASUS", 4000000, "ELEC");

            tienda.agregarProducto(tv);
            tienda.agregarProducto(camisa);
            tienda.agregarProducto(laptop);


            System.out.println();


            tv.aplicarDescuento();


            laptop.aplicarDescuento(20);


            System.out.println();
            tv.mostrarResumen();
            camisa.mostrarResumen();
            laptop.mostrarResumen();

            System.out.println("Total de productos creados: " + Producto.getContadorProductos());


            double precioConIVA = Tienda.calcularPrecioConIVA(laptop.getPrecio());
            System.out.printf("Precio de la Laptop con IVA: $%,.0f%n", precioConIVA);


            tienda.mostrarInventario();
        }
    }



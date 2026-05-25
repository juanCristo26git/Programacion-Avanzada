package edu.puj.app;
import edu.puj.model.*;
import edu.puj.negocio.IEmpresa;
import edu.puj.persistencia.ManejoArchivos;

import java.time.LocalDate;
import java.util.Scanner;

public class TestConsola {
    private static IEmpresa empresa = new Empresa("JaveMóvil");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:{
                        System.out.println("1 INGRESAR CLIENTE");
                        int opcion2;
                        do {
                            System.out.println("SELECCIONAR OPCION:");
                            System.out.println("1. SELECCIONAR ARCHIVO DE CLIENTES");
                            System.out.println("0. REGRESAR AL MENU PRINCIPAL");
                            System.out.println();
                            opcion2 = sc.nextInt();
                            sc.nextLine();
                            switch (opcion2) {
                                case 1: {
                                    System.out.print("Ingrese la ruta completa del archivo de clientes: ");
                                    String ruta = sc.nextLine().trim();

                                    try {
                                        ManejoArchivos.cargarClientesDesdeArchivo((Empresa) empresa, ruta);
                                    } catch (Exception e) {
                                        System.out.println(" No se pudo cargar el archivo:");
                                        System.out.println("   " + e.getMessage());
                                    }

                                }
                                case 0:{
                                    mostrarMenu();
                                }
                            }
                        }while (opcion2 != 0);
                    }
                    case 2:{ agregarCuenta();}
                    case 3: {registrarLlamada();}
                    case 4:{ agregarRecarga();}
                    case 5: {reporteFacturacionPostpago();}
                    case 6: {reporteRecargas();}
                    case 7:{ salvarSistema();}
                    case 8: { cargarSistema();}
                    case 0:{ System.out.println("¡Hasta pronto!");}
                    default:{System.out.println("Opción inválida.");}
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE FACTURACIÓN JAVEMÓVIL ===");
        System.out.println("1. Cargar clientes");
        System.out.println("2. Agregar cuenta (Prepago/Postpago)");
        System.out.println("3. Registrar llamada");
        System.out.println("4. Agregar recarga");
        System.out.println("5. Reporte facturación postpago");
        System.out.println("6. Reporte recargas");
        System.out.println("7. Guardar sistema");
        System.out.println("8. Cargar sistema");
        System.out.println("0. Salir");
        System.out.print("Seleccione opción: ");
    }

    // Implementar los demás métodos según las reglas del enunciado...
    // (Se pueden completar según necesidad)

    private static void cargarClientes() { /* Implementar lectura de archivo */ }
    private static void agregarCuenta() { /* Implementar */ }
    private static void registrarLlamada() { /* Implementar */ }
    private static void agregarRecarga() { /* Implementar */ }
    private static void reporteFacturacionPostpago() { /* Implementar */ }
    private static void reporteRecargas() { /* Implementar */ }
    private static void salvarSistema() throws Exception {
        System.out.print("Nombre del archivo: ");
        String archivo = sc.nextLine();
        ManejoArchivos.salvarSistema((Empresa) empresa, archivo);
        System.out.println("Sistema guardado exitosamente.");
    }

    private static void cargarSistema() throws Exception {
        System.out.print("Nombre del archivo: ");
        String archivo = sc.nextLine();
        empresa = ManejoArchivos.cargarSistema(archivo);
        System.out.println("Sistema cargado exitosamente.");
    }
}

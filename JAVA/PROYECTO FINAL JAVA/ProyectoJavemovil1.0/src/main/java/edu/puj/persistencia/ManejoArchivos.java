package edu.puj.persistencia;
import edu.puj.model.Cliente;
import edu.puj.model.Empresa;
import java.io.*;
import java.util.ArrayList;

public class ManejoArchivos {

    public static void salvarSistema(Empresa empresa, String ruta) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(empresa);
        }
    }

    public static Empresa cargarSistema(String ruta) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (Empresa) ois.readObject();
        }
    }

    public static void cargarClientesDesdeArchivo(Empresa empresa, String rutaArchivo) throws Exception {
        ArrayList<Cliente> clientesCargados = new ArrayList<>();
        int lineaNumero = 0;
        int clientesAgregados = 0;
        int duplicados = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean enSeccionClientes = false;

            while ((linea = br.readLine()) != null) {
                lineaNumero++;
                linea = linea.trim();

                if (linea.isEmpty()) continue;


                if (linea.equals("#CLIENTES")) {
                    enSeccionClientes = true;
                    continue;
                }

                if (!enSeccionClientes) continue;


                if (linea.equals("#FIN")) {
                    break;
                }


                if (linea.startsWith("#nombre")) continue;

                // Procesar línea de cliente
                try {
                    Cliente cliente = parsearLineaCliente(linea);
                    if (cliente != null) {
                        if (empresa.buscarCliente(cliente.getIdentificacion()) == false) {
                            empresa.agregarCliente(cliente);
                            clientesCargados.add(cliente);
                            clientesAgregados++;
                        } else {
                            System.out.println(" Cliente duplicado ignorado (línea " + lineaNumero + "): " +
                                    cliente.getIdentificacion());
                        }
                    }
                } catch (Exception e) {
                    System.out.println(" Error al procesar línea " + lineaNumero + ": " + linea);
                    System.out.println("   Motivo: " + e.getMessage());
                }
            }

            System.out.println(" Carga completada:");
            System.out.println("   Clientes agregados: " + clientesAgregados);
        } catch (Exception e) {
            throw new Exception("Error al leer el archivo: " + e.getMessage());
        }
    }


    private static Cliente parsearLineaCliente(String linea) {
        // Dividir por el separador *
        String[] partes = linea.split("\\*");
//Verifica si el formato es correcto
        if (partes.length < 3) {
            throw new IllegalArgumentException("Formato inválido.");
        }

        String nombre = partes[0].trim();
        String identificacion = partes[1].trim();
        String direccion = partes[2].trim();

        if (nombre.isEmpty() || identificacion.isEmpty()) {
            throw new IllegalArgumentException("Nombre o cédula vacíos");
        }

        return new Cliente(identificacion, nombre, direccion);
    }
}

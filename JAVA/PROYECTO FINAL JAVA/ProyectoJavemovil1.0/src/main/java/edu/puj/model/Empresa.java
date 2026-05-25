package edu.puj.model;

import edu.puj.negocio.IEmpresa;

import java.util.ArrayList;

public class Empresa  implements IEmpresa  {
     private String nombre;
     private ArrayList<Cliente> clientes = new ArrayList<>();
     private ArrayList<Cuenta> cuentas = new ArrayList<>();

     public Empresa(String nombre) {
         this.nombre = nombre;

     }

     public ArrayList<Cliente> getClientes() {
         return clientes;
     }
     @Override
     public void agregarCliente(Cliente cliente) {
         if (buscarCliente(cliente.getIdentificacion()) == false) {
             clientes.add(cliente);
         }
     }

     public boolean buscarCliente(String identificacion) {
         for (Cliente cliente : clientes) {
             if (cliente.getIdentificacion().equals(identificacion)) {
                 return true;
             }
         }
         return false;
     }
 }
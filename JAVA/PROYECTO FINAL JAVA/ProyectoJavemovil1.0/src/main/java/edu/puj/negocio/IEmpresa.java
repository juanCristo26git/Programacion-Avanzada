package edu.puj.negocio;

import edu.puj.model.Cliente;

import java.util.ArrayList;

public interface IEmpresa {
    public ArrayList<Cliente> getClientes();

    void agregarCliente(Cliente cliente);
}

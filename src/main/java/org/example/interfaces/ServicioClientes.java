package org.example.interfaces;

import org.example.Cliente;

public interface ServicioClientes   {
    Boolean agregarCliente(Cliente cliente);
    Boolean eliminarCliente(Integer numero);
    Cliente consultarCliente(Integer numero);
    Cliente[] obtenerClientes();
    Cliente buscarClientePorRFC(String rfc);
}

package org.example;

import org.example.interfaces.ServicioClientes;

import java.util.ArrayList;
import java.util.List;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private List<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    @Override
    public Boolean agregarCliente(Cliente cliente) {
        return clientes.add(cliente);
    }

    @Override
    public Boolean eliminarCliente(Integer numero) {
        return clientes.removeIf(cliente -> cliente.getNumero().equals(numero));
    }

    @Override
    public Cliente consultarCliente(Integer numero) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero().equals(numero)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente[] obtenerClientes() {
        return clientes.toArray(new Cliente[0]);
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getRfc().equals(rfc)) {
                    return cliente;
                }
            }
        }
        return null;
    }
}
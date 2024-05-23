package org.example;

import org.example.interfaces.ServicioClientes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // domicilios
        Domicilio domicilioBanco = new Domicilio("Calle 1", 123, "Colonia 1", "Estado 1", 11111);
        Domicilio domicilioCliente1 = new Domicilio("Calle 2", 456, "Colonia 2", "Estado 2", 22222);
        Domicilio domicilioCliente2 = new Domicilio("Calle 3", 789, "Colonia 3", "Estado 3", 33333);

        // banco
        Banco banco = new Banco("Bancolombia", domicilioBanco, "RFCBANCO", "555-5555");

        // clientes
        Cliente cliente1 = new Cliente(1, "Juan Perez", domicilioCliente1, "RFC1", "555-1234", "2000-01-01");
        Cliente cliente2 = new Cliente(2, "Maria Lopez", domicilioCliente2, "RFC2", "555-5678", "1985-02-02");

        //cuentas
        CuentaDeAhorro cuentaAhorro1 = new CuentaDeAhorro(1111, 5000.0, 0.01);
        CuentaDeCheque cuentaCheque1 = new CuentaDeCheque(2222, 1500.0, 50.0);

        System.out.println("Agregando clientes al banco: " + banco.agregarCliente(cliente1));
        System.out.println("Agregando clientes al banco: " + banco.agregarCliente(cliente2));
        System.out.println("Eliminando cliente del banco: " + banco.eliminarCliente(1));
        System.out.println("Consultando cliente del banco: " + banco.consultarCliente(2));
        System.out.println("Obteniendo clientes del banco: " + Arrays.toString(banco.obtenerClientes()));
        System.out.println("Buscando cliente por RFC" + banco.buscarClientePorRFC("RFC2"));

        System.out.println("Agregando cuentas al cliente: " + cliente1.agregarCuenta(cuentaAhorro1));
        System.out.println("Agregando cuentas al cliente: " + cliente1.agregarCuenta(cuentaCheque1));
        System.out.println("Cancelando cuenta del cliente: " + cliente1.cancelarCuenta(1111));
        System.out.println("Abonando a la cuenta del cliente: " );
        cliente1.abonarCuenta(2222, 500.0);
        System.out.println("Retirando de la cuenta del cliente: " );
        cliente1.retirar(2222, 100.0);
        System.out.println("Obteniendo cuentas del cliente: " + Arrays.toString(cliente1.obtenerCuentas()));

    }
}
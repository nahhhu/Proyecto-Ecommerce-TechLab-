package util;

import modelos.Cliente;

public class ClienteUtil {
    public static void mostrarCliente(Cliente cliente) {
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());
    }
}

package ejercicios;

import java.util.Scanner;


public class EjercicioClase2 {
    public static void main(String[] args) {
        int precioProducto = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa tu nombre");
        String nombreCliente = sc.nextLine();
        System.out.println("Ingresa la cantidad de productos que desees");
        int cantidadProductos = sc.nextInt();
        int montoTotal = precioProducto * cantidadProductos;
        System.out.println("Bienvenido" + nombreCliente + ", el monto total a pagar es de: $" + montoTotal);


        if (cantidadProductos > 100) {
            double descuento = montoTotal * 0.15;
            double montoFinal = montoTotal - descuento;
            System.out.println("Como su compra supera las 100 unidades ha recibido un descuento del %15. El monto a pagar es de: $" + montoFinal);
        }

        System.out.println("Hola " + nombreCliente + ", ingresa un numero por favor");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println("Los numeros del 1 a tu numero (recorridos con for) son los siguientes: " + i);
        }

        int cont = 1;
        while (cont < num) {
            cont++;
            System.out.println("Los numeros del 1 a tu numero (recorridos con while) son los siguientes: " + cont);
        }
    }
}

package inicio;
import  java.util.Scanner;


public class EjercicioClase1 {
    public static void main(String[] args) {
        int precioProducto = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa tu nombre");
        String nombreCliente = sc.nextLine();
        System.out.println("Ingresa la cantidad de productos que desees");
        int cantidadProductos = sc.nextInt();
        int montoTotal = precioProducto  * cantidadProductos;
        System.out.println("Bienvenido" + nombreCliente + ", el monto total a pagar es de: $" + montoTotal);

    }
}

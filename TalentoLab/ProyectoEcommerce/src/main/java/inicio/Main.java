package inicio;

import static util.ProductoUtil.aplicarImpuesto;
import static util.ProductoUtil.calcularPrecioFinal;
import util.ClienteUtil.*;

public class Main {
    public static void main(String[] args) {
        mostrarValorConImpuesto();
        mostrarValorConDescuento();

        String mensajeNuevo = ClienteUtil.mostrarMensaje("Nahuel");
        System.out.println(mensajeNuevo);

        String mensajeRecurrente = ClienteUtil.mostrarMensaje("Matias", 5);
        System.out.println(mensajeRecurrente);
    }

    public static void mostrarValorConImpuesto() {
        double precioInicial = 100;
        double precioConImpuesto = aplicarImpuesto(precioInicial, 20);
        System.out.println("El precio con el impuesto apicado es el siguiente: " + precioConImpuesto);
    }

    public static void mostrarValorConDescuento(){
        double precioInicial = 100;
        double precioConDescuento = calcularPrecioFinal(precioInicial,10,50);
        System.out.println("El precio de su producto con descuento es: " + precioConDescuento);
    }

}

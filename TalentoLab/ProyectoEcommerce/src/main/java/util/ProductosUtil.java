package util;
import modelos.Producto;

public class ProductosUtil {
    public static void aplicarDescuento(Producto producto, double porcentaje){
        if (producto != null && porcentaje > 0 && porcentaje <= 100){
            double precioActual = producto.getPrecio();
            double descuento = precioActual * (porcentaje / 100);
            double nuevoPrecio = precioActual - descuento;
            producto.setPrecio(nuevoPrecio);
        }
    }

    public static void calcularImpuesto(Producto producto, double impuesto){
        if (producto != null && impuesto >= 0){
            double precioActual = producto.getPrecio();
            double nuevoPrecio = precioActual + (precioActual * impuesto/100);
            producto.setPrecio(nuevoPrecio);
        }
    }

    public static  void mostrarProducto(Producto producto){
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getStock());
    }

}

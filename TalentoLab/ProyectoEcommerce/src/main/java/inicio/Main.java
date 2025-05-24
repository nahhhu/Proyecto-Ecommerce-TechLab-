package inicio;

import modelos.Cliente;
import modelos.Carrito;
import modelos.Producto;
import util.ClienteUtil;
import util.ProductosUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente nuevoCliente = new Cliente("Nahuel", "nahuel@gmail.com");
        ClienteUtil.mostrarCliente(nuevoCliente);


        ArrayList<Producto> catalogo = new ArrayList<>();
        Producto cafe = new Producto("Cafe Peruano", 5000, 2);
        ProductosUtil.aplicarDescuento(cafe, 10);
        ProductosUtil.calcularImpuesto(cafe, 21);

        Producto cafe1 = new Producto("Cafe Bolivia", 5500, 1);
        ProductosUtil.aplicarDescuento(cafe1, 10);
        ProductosUtil.calcularImpuesto(cafe1, 21);

        catalogo.add(cafe);
        catalogo.add(cafe1);


        Carrito pedido1 = new Carrito(nuevoCliente);
        pedido1.agregarProducto(cafe);
        pedido1.agregarProducto(cafe1);
        System.out.println(pedido1.calcularTotal());
        System.out.println("Cantidad total de productos creados " + Producto.getContadorProductos());
    }
}

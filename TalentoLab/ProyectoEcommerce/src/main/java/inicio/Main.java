package inicio;

import modelos.*;
import util.ClienteUtil;
import util.ProductosUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente nuevoCliente = new Cliente("Nahuel", "nahuel@gmail.com");
        ClienteUtil.mostrarCliente(nuevoCliente);


        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Cafe("Cabrales","Tostado",12000,1));
        productos.add(new Te("Taragui","Frutilla",3000,2));

        /*Producto cafe = new Producto("Cafe Peruano", 5000, 2);
        ProductosUtil.aplicarDescuento(cafe, 10);
        ProductosUtil.calcularImpuesto(cafe, 21);

        Producto cafe1 = new Producto("Cafe Bolivia", 5500, 1);
        ProductosUtil.aplicarDescuento(cafe1, 10);
        ProductosUtil.calcularImpuesto(cafe1, 21);

        catalogo.add(cafe);
        catalogo.add(cafe1);

         */


        /*Carrito pedido1 = new Carrito(nuevoCliente);
        pedido1.agregarProducto(cafe);
        pedido1.agregarProducto(cafe1);
        System.out.println(pedido1.calcularTotal());
        System.out.println("Cantidad total de productos creados " + Producto.getContadorProductos());
        */

        for (Producto p : productos){
            if (p instanceof Cafe){
                Cafe coffe = (Cafe) p;
                System.out.println("Cafe: " + coffe.getNombre() + "| Precio: " + coffe.calcularPrecioFinal() + "| Precio final: " + coffe.aplicarDescuento(15));
            }
            else if (p instanceof Te){
                Te tea = (Te) p;
                System.out.println("Te: " +tea.getNombre() + "| Precio: " + tea.calcularPrecioFinal() + "| Precio final: " + tea.aplicarDescuento(10));
            }
        }
    }
}

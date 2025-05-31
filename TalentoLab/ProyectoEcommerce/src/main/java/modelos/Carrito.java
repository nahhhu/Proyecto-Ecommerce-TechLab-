package modelos;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Producto> productos;
    private final Cliente cliente;


    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }


    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public String calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getStock();
        }
        return "El precio total del pedido es de " + total;
    }
}

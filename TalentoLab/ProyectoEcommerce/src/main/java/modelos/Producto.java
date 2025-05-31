package modelos;

public abstract class Producto {

    private static int contadorProductos;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        contadorProductos++;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 1) {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 1) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock tiene que ser mayor a 1");
        }
    }

    public abstract double calcularPrecioFinal();
}

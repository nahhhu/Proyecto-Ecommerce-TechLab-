package modelos;
import interfaces.Descontable;

public class Cafe extends Producto implements Descontable {
    private String tipo;

    public Cafe(String nombre, String tipo, double precio, int stock) {
        super(nombre, precio, stock);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double aplicarDescuento(double porcentaje){
        double total = getPrecio() * getStock();
        double descuento = total * (porcentaje/100);
        return total- descuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * getStock();
    }

}

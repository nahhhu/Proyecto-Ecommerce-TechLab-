package util;

public class ProductoUtil {
    public static double aplicarImpuesto(double precio, double procentaje){
        double precioConImpuesto  = precio  + (precio * procentaje / 100);
        return precioConImpuesto;
    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        double bonusAdicional = 5;
        if (cantidad > 50){
            double aplicarDescuentoExtra= precio - (precio * (descuento + bonusAdicional)/100);
            return aplicarDescuentoExtra;
        }else {
            double aplicarDescuento  = precio - (precio * descuento/100);
            return aplicarDescuento;
        }
    }
}

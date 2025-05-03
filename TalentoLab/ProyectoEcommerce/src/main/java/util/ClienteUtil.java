package util;

public class ClienteUtil {
    public static String mostrarMensaje(String nombre){
        return "Bienvenido " + nombre;
    }
    public static String mostrarMensaje(String nombre, int visita){
        return "Bienvenido " + nombre + " esta es la " + visita + " vez que nos visitas";
    }
}

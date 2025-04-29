public class EjercicioClase3 {
    public static void main(String[] args) {
        /*
        // limpiar el arrar producto
        String producto = "café Premium MOLIDO   ";
        //saca los espacios demás
        producto = producto.trim();
        //pasa las cosas a minuscula
        producto = producto.toLowerCase();
        //retorna el indice de la palabra o letra que le asignamos
        int indice = producto.indexOf('e');

        System.out.println(producto + indice);

        //problema gestion de catalogo de productos
        Contexto: Silvia quiere listar todos los productos disponibles. Inicialmente, Matías y Sabrina
          piensan en un array fijo, pero se dan cuenta de que el catálogo crecerá. Comienzan usando
          un array, notan su rigidez y luego considerarán ArrayList.

        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Cafe Molido Premium");
        listaProductos.add("Te Verde Organico");
        listaProductos.add("Chocolate Amargo 80%"); */

        /*Contexto: Ahora Silvia agrega un nuevo producto "Café Descafeinado" y decide que
        "Chocolate Amargo 80%" ya no estará disponible. Además, el cliente pregunta si existe
        cierto té especial. Con un ArrayList, Matías y Sabrina pueden hacerlo sin problemas.
        *

        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Cafe Molido Premium");
        listaProductos.add("Te Verde Organico");
        listaProductos.add("Chocolate Amargo 80%");

        listaProductos.add("Café Descafeinado");
        listaProductos.remove("Chocolate amargo 80%");

        if (listaProductos.contains("Te Verde Organico")){
            System.out.println("El catalogo contiene Te Verde Organico");
        }else {
            System.out.println("No se encuentra el producto");
        }
        for (String productos : listaProductos){
            System.out.println("El catalogo cuenta con: " + productos);
        }*/


        //Ejercicio 3 Manipulacion de cadenas

        //Ejercicio 3 Arrays

        String[] productos = new String[5];
        productos[0] = ("Cafe Tostado Brasil");
        productos[1] = ("Té Chai");
        productos[2] = ("Té Verde Orgánico");
        productos[3] = ("Té Negro");
        productos[4] = ("Café Tostado Perú");

        for (String producto : productos) {
            System.out.println("Los productos en el catálogo son: " + producto);
        }
        //si se intenta agregas un producto mas a la lista resultara en error ya que el array no permite ser modificado  luego de su asignacion de valores.


    }
}


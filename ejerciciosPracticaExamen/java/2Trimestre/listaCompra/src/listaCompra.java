
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class listaCompra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Creamos la lista de tipo String
        ArrayList<String> carrito = new ArrayList<>();

        System.out.print("Cuantos productos quieres añadir: ");
        int numeroProductos = sc.nextInt();
        sc.nextLine();
// creo el bucle para meter los elementos a la lista
        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Introduce el producto que quieres añadir: ");
            String producto = sc.nextLine();
            carrito.add(producto.toLowerCase());
        }
// llamo al metodo para imprimir la lista
        imprimirListaxe(carrito);

        //pedimos la posicion para eliminar un producto la pedimos int para que pille la posicion
        System.out.print("\n Introduce la posicion de la que quieres eliminar un producto: ");
        int posicion=sc.nextInt();
        sc.nextLine();
//eliminamos un producto por la posicion
        carrito.remove(posicion);
//llamamos al meotod para imprimir la lista
        imprimirListaxe(carrito);

// pedimos el producto que queremos eliminar de la lista y lo guardamos tipo String 
        System.out.println("\n Introduce el producto que quieres eliminar de la lista");
        String productoEliminar=sc.nextLine();

// hacemos la posicion para ver si la lista contiene el producto que quiere borrar y lo paso a minusculas para que no haya fallos
        if (carrito.contains(productoEliminar.toLowerCase())) {
            carrito.remove(productoEliminar);
        }else{// si no muestra el mensaje por si no se a encontrado ningun producto 
            System.out.println("No se ha encontrado ningun producto con ese valor");
        }

        imprimirListaxe(carrito);

        

    }
// metodo para imprimir la lista 
    public static void imprimirListaxe(List<String> carrito) {
        //creamos el iterator para recorrer la lista
        Iterator it = carrito.iterator();
        // bucle para ver si existe un nuevo atrib
        while (it.hasNext()) {
            // creamos la variable y guardamos el valor del iterador en el
            String carritoAux =  (String) it.next();
            System.out.print(" " + carritoAux);
        }
    }

}

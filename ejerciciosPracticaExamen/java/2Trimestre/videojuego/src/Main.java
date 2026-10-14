/*Ejercicio: Gestión de Videojuegos con ArrayList
Parte 1: Crear la clase Videojuego
Crea una clase llamada Videojuego que tenga los siguientes atributos:

titulo (String)

consola (String)

precio (double)

Debes implementar:

Un constructor que inicialice todos los atributos.

Los métodos getters para acceder a los atributos.

Un método llamado mostrarJuego() que imprima por pantalla los datos del videojuego de forma legible (ej. "Zelda - Switch - 59.90€").

Parte 2: Crear la clase Principal (Main)
En el programa principal (el public static void main), debes realizar las siguientes acciones en orden:

Crear una lista (ArrayList) que guarde objetos de tipo Videojuego.

Crear y añadir al menos 4 videojuegos diferentes a la lista.

Recorrer la lista y mostrar por pantalla todos los videojuegos (usando el método mostrarJuego()).

Recorrer la lista y mostrar SOLO los videojuegos que cuesten menos de 40 euros.

Borrar por índice: Elimina de la lista el videojuego que está en la posición 1 (recuerda que los índices empiezan en 0).

Borrar por valor: Elimina de la lista un videojuego pasándole el objeto exacto (ej. borra el juego 3 pasándole la variable donde lo guardaste).

Volver a mostrar la lista completa para comprobar que esos dos juegos han desaparecido correctamente. */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creamos la lista
        ArrayList<videojuego> listaxeVideojuegos = new ArrayList<>();
// añadimos los elementos a la lista

        listaxeVideojuegos.add(new videojuego("PS4", 55, "Las guarradas de eli"));
        listaxeVideojuegos.add(new videojuego("PC", 100, "Las mentiras del Paleolitico"));
        listaxeVideojuegos.add(new videojuego("PS5", 20, "Eurotrack simulator Ribeira"));
        listaxeVideojuegos.add(new videojuego("Switch", 200, "El cuñado de eli"));
// la muestro
        mostrarVideojuego(listaxeVideojuegos);

        System.out.println("------------------------------");
        // creo otro para crear un objeto nuevo y comparo a ver si es menos de 40 el precio
        Iterator it2 = listaxeVideojuegos.iterator();

        while (it2.hasNext()) {
            videojuego menosDeCuarenta = (videojuego) it2.next();
            if (menosDeCuarenta.getPrecio() < 40) {
                listaxeVideojuegos.remove(menosDeCuarenta);
            }
        }
        mostrarVideojuego(listaxeVideojuegos);

        System.out.println("------------------");

        // borramos por posicion

        System.out.print("Introduce la posicion que quieres eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        listaxeVideojuegos.remove(posicion);

        mostrarVideojuego(listaxeVideojuegos);



        System.out.println("----------------");
        // pedimos el videojuego por teclado
        System.out.print("\nIntroduce el titulo del videojuego: ");
        String tituloVideojuego = sc.nextLine().toLowerCase();

        Iterator it3 = listaxeVideojuegos.iterator();

        while (it3.hasNext()) {
            videojuego borrarVideojuego = (videojuego) it3.next();
            // si los titulos de la lista contienen o son iguales al titulo borralo de la propia lista
            if (borrarVideojuego.getVideojuego().equalsIgnoreCase(tituloVideojuego)) {
                it3.remove();
            }
        }

        mostrarVideojuego(listaxeVideojuegos);

    }

    public static void mostrarVideojuego(List<videojuego> listaxeVideojuegos) {

        Iterator it = listaxeVideojuegos.iterator();
        while (it.hasNext()) {
            videojuego auxiliar = (videojuego) it.next();
            System.out.println(" " + auxiliar);
        }

    }
}

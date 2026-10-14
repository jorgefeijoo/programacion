/*1. Uso de Pilas (Stacks) Basado en el concepto de la pila de platos   

Enunciado: Historial de Navegación
En un navegador web, el historial de las páginas visitadas en una pestaña se guarda en una pila para que el usuario pueda volver atrás. Cada página web tiene una URL y un título (por ejemplo: "www.google.com" y "Buscador").
El programa mostrará un menú que deberá permitir:

Visitar nueva página: Añadir una nueva página web a la pila de navegación.

Volver atrás: Sacar de la pila la página actual (la más reciente en la cima) para volver a la anterior, mostrando los datos de la página a la que se regresa.

Mostrar historial: Mostrar todas las páginas en el historial para esa pestaña, desde la más reciente a la más antigua.

Salir del programa. */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Navegador {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int menu = 0;
            String nuevaPagina = "";
            Deque<String> pililla = new ArrayDeque<>();
            while (menu != 4) {
                System.out.println("---Menu navegacion---");
                System.out.println("1. Visitar nueva pagina");
                System.out.println("2. Volver atras");
                System.out.println("3.Mostrar Historial");
                System.out.println("4.Salir");
                System.out.print("La opcion que estas introduciendo es: ");
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.println("Introduce la pagina que quieres visitar");
                        nuevaPagina=sc.nextLine();
                        pililla.push(nuevaPagina);
                        break;

                    case 2:
                        System.out.println(pililla.pop()); 

                        break;

                    case 3:
                        for (String pila : pililla) {
                            System.out.println(pila);
                        }

                        break;

                    case 4:
                        System.out.println("Cerrando menu ...");
                        return;

                    default:
                        break;
                }

            }
        }
    }

}

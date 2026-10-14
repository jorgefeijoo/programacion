/*2. Uso de Colas (Queues) Basado en el concepto de la cola del supermercado   Enunciado: Cola de ImpresiónEn las oficinas, 
cuando varios usuarios envían documentos a imprimir a la misma impresora, estos se almacenan en una cola y se imprimen en el orden en el que llegaron. 
Cada documento tiene un nombre de archivo (ej. "informe.pdf") y un número de páginas.El programa mostrará un menú que deberá permitir:Enviar a imprimir: 
Añadir un nuevo documento a la cola de impresión.Imprimir documento: Procesar el documento que lleva más tiempo esperando (el primero de la cola), mostrando sus datos por pantalla. Tras imprimirlo,
 este desaparece de la cola.Mostrar cola: Mostrar todos los documentos pendientes de imprimir, desde el primero que se imprimirá hasta el último.Salir del programa. */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Cola {

    public static void main(String[] args) {
        Deque<String> colilla = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        String nombreArchivos;
        while (menu != 4) {
            System.out.println("Menu de Impresion");
            System.out.println("1. Enviar a imprimir");
            System.out.println("2.Imprimir documento");
            System.out.println("3.Mostrar todos los documentos pendientes de imprimir");
            System.out.println("4.Salir");
            System.out.print("La opcion que estas introduciendo es: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Nombre del archivo que quieres mandar a imprimir");
                    nombreArchivos = sc.nextLine();
                    colilla.add(nombreArchivos);
                    break;

                case 2:
                   System.out.println(colilla.removeFirst()); 

                    break;

                case 3:
                    for (String cola : colilla) {
                        System.out.println(cola);
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    return;

                default:
                    break;
            }
        }
    }
}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Desenvolve un programa en Java que permita xestionar unha lista de números enteiros utilizando a colección ArrayList<Integer>.
O programa debe mostrar un menú interactivo por consola que se repita continuamente ata que o usuario decida saír. As opcións do menú serán as seguintes:
1. Engadir número: Solicita un número enteiro por teclado e engádeo ao final da lista.
2. Mostrar lista e tamaño: Mostra por pantalla todos os números que contén a lista actualmente, así como o seu tamaño total (cantidade de elementos).
3. Eliminar por posición: Solicita ao usuario un índice (posición) e elimina o número que se atopa nese lugar exacto da lista. Debe controlarse que a posición introducida sexa válida para evitar erros.
4. Eliminar por valor: Solicita un número por teclado e elimina a primeira aparición dese valor na lista (ollo á diferenza á hora de usar o método remove() con índices ou con obxectos Integer).
5. Saír: Despídese do usuario e remata a execución do programa.
Nota para o alumno: Despois de calquera operación de borrado (opcións 3 e 4), o programa debe mostrar de novo o contido actualizado da lista para confirmar que a operación se realizou correctamente.
 */
public class listas {

    public static void main(String[] args) {
        ArrayList<Integer> listaxeNumeros = new ArrayList();
        int menu = 0;
        Scanner sc = new Scanner(System.in);

        while (menu != 5) {
            System.out.println("\n1.Engadir numero:");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar por posicion");
            System.out.println("4. Eliminar por valor");
            System.out.println("5.Salir");
            System.out.print("La posicion que estas introduciendo es: ");
            menu=sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Introduce un numero para engadir a lista: ");
                    int numeroPedido = sc.nextInt();

                    listaxeNumeros.add(numeroPedido);
                    

                    break;

                case 2:
                     imprimirListaxe(listaxeNumeros);
                     System.out.println("\n El tamaño de la lista es : "+ listaxeNumeros.size()); 

                    break;

                case 3:
                    System.out.print("Introduce un indice: ");
                    int posicion=sc.nextInt();

                    if (posicion<0||posicion>listaxeNumeros.size()) {
                        System.out.println("introduce un valor valido");
                    }else{
                        listaxeNumeros.remove(posicion);
                        imprimirListaxe(listaxeNumeros);
                    }


                    break;

                case 4:
                    System.out.print("Introduce un indice: ");
                    Integer posicionValor=sc.nextInt();
                        listaxeNumeros.remove(posicionValor);
                        imprimirListaxe(listaxeNumeros);
                    
                    


                    break;

                case 5:
                    System.out.println("Cerrando menu ... ");
                    return;

                default:
                    break;
            }
        }

    }

    public static void imprimirListaxe(List<Integer> listaxeNumeros) {
        Iterator it = listaxeNumeros.iterator();
        while (it.hasNext()) {
             Integer auxiliar=  (Integer) it.next();
             System.out.print(" " + auxiliar);
        }
    }
}

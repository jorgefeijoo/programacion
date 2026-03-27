import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Supermercado {
  public static void main(String[] args) {
    int menu = 0;
    Scanner sc = new Scanner(System.in);
    Deque<Cliente> colaSupermecadillo = new ArrayDeque<>();
    // se repite el menu mientras no se escoja la opcion 4
    while (menu != 4) {
      System.out.println("1. Engadir cliente");
      System.out.println("2. Atender cliente");
      System.out.println("3. Mostrar Clientes");
      System.out.println("4 .Sair");
      System.out.print("La opcion que estas introduciendo es: ");
      menu = sc.nextInt();

      switch (menu) {
        // se pide el cliente por teclado y se añade a la cola
        case 1:
          System.out.print("Añade cliente:  ");
          sc.nextLine();
          String nome = sc.nextLine();
          System.out.print("Introduce o id do cliente: ");
          int id = sc.nextInt();
          colaSupermecadillo.add(new Cliente(nome, id));

          break;

        // elimina el ultimo elemento que se añadio a cola
        case 2:
          if (colaSupermecadillo.isEmpty()) {
            System.out.println("La cola esta vacia");
          } else {
            colaSupermecadillo.removeFirst();
          }

          break;

        // se muestra la lista despues de comprobar que no este vacia
        case 3:
          if (colaSupermecadillo.isEmpty()) {
            System.out.println("la cola esta vacia");
          } else {
            System.out.println(colaSupermecadillo);
          }
          break;

        // acaba el menu
        case 4:
          System.out.println("Saliendo del menu...");
          return;
        default:
          System.out.println("Prueba con otro numero entre 1 y 4 ");
          break;

      }
    }
  }
}

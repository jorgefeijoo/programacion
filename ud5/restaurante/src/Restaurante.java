import java.util.Scanner;
import java.util.Stack;

public class Restaurante {
  public static void main(String[] args) {
    int menu = 0;
    Scanner sc = new Scanner(System.in);
    Stack<Plato> piliñaPlatos = new Stack<>();
    // se repite el menu mientras no se escoja la opcion 4
    while (menu != 4) {
      System.out.println("1. Engadir prato sucio");
      System.out.println("2. Lavar el ultimo plato que llego");
      System.out.println("3. Mostrar los platos de la pila");
      System.out.println("4 .Sair");
      System.out.print("La opcion que estas introduciendo es: ");
      menu = sc.nextInt();

      switch (menu) {
        // se pide el plato por teclado y se añade a la pila
        case 1:
          System.out.print("Introduce el plato que quieres añadir: ");
          sc.nextLine();
          String plato = sc.nextLine();
          System.out.print("Introduce o id do plato: ");
          int id = sc.nextInt();
          piliñaPlatos.push(new Plato(id, plato));

          break;

        // ellimina el ultimo elemento que se añadio a la pila
        case 2:
          if (piliñaPlatos.isEmpty()) {
            System.out.println("La pila esta vacia");
          } else {
            piliñaPlatos.pop();
          }

          break;

        // se muestra la lista llamando al metodo
        case 3:
          mostrarPila(piliñaPlatos);
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

  // creamos o metodo para mostrar la pila
  private static void mostrarPila(Stack<Plato> piliñaPlatos) {
    System.out.println("PILA:");
    for (int i = piliñaPlatos.size() - 1; i >= 0; i--) {
      System.out.println(piliñaPlatos.get(i));
    }

  }
}

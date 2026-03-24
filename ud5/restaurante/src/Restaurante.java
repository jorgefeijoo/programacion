import java.util.Scanner;
import java.util.Stack;

public class Restaurante {
  public static void main(String[] args) {
    int menu = 0;
    Scanner sc = new Scanner(System.in);
    Stack<Plato> pilaPlatos = new Stack<>();
    while (menu != 4) {
      System.out.println("1. Engadir prato sucio");
      System.out.println("2. Lavar el ultimo plato que llego");
      System.out.println("3. Mostrar los platos de la pila");
      System.out.println("4 .Sair");
      System.out.print("La opcion que estas introduciendo es: ");
      menu = sc.nextInt();

      switch (menu) {
        case 1:
          System.out.print("Introduce el plato que quieres añadir: ");
          sc.nextLine();
          String plato = sc.nextLine();
          pilaPlatos.push(new Plato(plato));

          break;

        case 2:
          pilaPlatos.pop();

          break;

        case 3:
          mostrarPila(pilaPlatos);
          break;

        case 4:
          System.out.println("Saliendo del menu...");
          return;

      }
    }

  }

  private static void mostrarPila(Stack<Plato> pilaPlatos) {
    System.out.println("PILA:");
    for (int i = pilaPlatos.size() - 1; i >= 0; i--) {
      System.out.println("│ " + pilaPlatos.get(i) + " │");
    }

  }
}

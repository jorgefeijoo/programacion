package ComparacionCadenas;

import java.util.Scanner;

public class ComparacionCadenas {

  public static int pedirCadenas() {

    String cadena1 = "";
    String cadena2 = "";

    // creamos o bucle para que si las cadenas estan vacias se repita todo el rato
    while (cadena1.isEmpty() || cadena2.isEmpty()) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce a primeira cadena: ");
      cadena1 = sc.nextLine();
      System.out.print("Vuelve a introducir la cadena: ");
      cadena2 = sc.nextLine();
      // facemos a condicion para que si esta vacia se muestre el error
      if (cadena1.isEmpty() || cadena2.isEmpty()) {
        System.out.println("No se pueden introducir cadenas valeiras, Vuelve a introducirlas");
      }
      sc.close();
    }

    // condicion para que si las cadenas son exactamente iguales devuelva 2
    if (cadena1.equals(cadena2)) {
      return 2;
      // condicion para que si las cadenas son iguales ignorado mayusculas devuelva 1
    } else if (cadena1.equalsIgnoreCase(cadena2)) {
      return 1;
      // si las cadenas no tienen la misma longitud que devuelva -1
    } else if (cadena1.length() != cadena2.length()) {
      return -1;
      // si no que devuelva 0
    } else {
      return 0;
    }

  }

}

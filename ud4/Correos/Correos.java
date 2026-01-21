package Correos;

import java.util.Scanner;

public class Correos {

  public static boolean ComprobacionCorreos() {

    String cadena1 = "";
    String cadena2 = "";

    while (cadena1.isEmpty() || cadena2.isEmpty()) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce a primeira cadena: ");
      cadena1 = sc.nextLine();
      System.out.print("Vuelve a introducir la cadena: ");
      cadena2 = sc.nextLine();
    }
    if (cadena1.equalsIgnoreCase(cadena2) && cadena1.length() == cadena2.length()) {
      return true;
    } else {
      return false;
    }
  }
}

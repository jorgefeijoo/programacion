package expresionesRegulares;

import java.util.Scanner;

public class expresionesRegulares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a cadea: ");
    String cadea = sc.nextLine();
    System.out.print("Introduce la palabra que quieres cambiar: ");
    String palabra = sc.nextLine();
    System.out.print("Introduce por la que quieres substituir: ");
    String substitucion = sc.nextLine();
    String resultado = cadea.replaceAll(palabra, substitucion);
    System.out.print("O texto con la palabra cambiada es: " + resultado);

  }
}

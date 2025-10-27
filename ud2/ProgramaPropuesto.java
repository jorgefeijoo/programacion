package ud2;

import java.util.Scanner;

public class ProgramaPropuesto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println("El numero es negativo");
    } else {
      int cont = 0;
      while (num > 0) {
        num = num / 10;
        cont++;
      }
      System.out.println("El numero tiene " + cont + " digitos");
    }

  }
}

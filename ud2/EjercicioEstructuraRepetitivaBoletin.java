package ud2;

import java.util.Scanner;

public class EjercicioEstructuraRepetitivaBoletin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("Introduce un numero: ");
    int num1 = sc.nextInt();
    if (num1 >= 30 && num1 <= 1) {
      System.out.println("O programa finalizou, proba un numero maior que 1 e menor que 30");
    }
  }
}

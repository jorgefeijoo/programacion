package ud2;

import java.util.Scanner;

public class EjercicioBucleFor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero de voltas2: ");
    int numvoltas = sc.nextInt();

    for (int i = 1; i <= numvoltas; i++) {
      System.out.println("numero de volta " + i);
    }

  }

}

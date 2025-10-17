package ud2;

import java.util.Scanner;

public class EjercicioBucleFor2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número maior que 1");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      System.out.println(i);
    }
  }
}

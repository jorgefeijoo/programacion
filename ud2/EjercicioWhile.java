package ud2;

import java.util.Scanner;

public class EjercicioWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero de voltas : ");
    int numvoltas = sc.nextInt();
    int i = 1;// declaramos as variables
    while (i <= numvoltas) {// decimos a condicion
      System.out.println(i);
      i++;// para que no se hagan infinitos

    }

  }

}

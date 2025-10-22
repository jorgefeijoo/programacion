package ud2;

import java.util.Scanner;

public class BucleDoWhileBoletin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero onde queres que pare: ");// creamos el scanner donde queremos que pare el
                                                                  // programa
    int num1 = sc.nextInt();

    int MultiploActual = 8;// creamos la variable con el valor de 8 xa que e o primer numero multiplo de 8
    do {
      System.out.println(MultiploActual);
      MultiploActual += 8;// vamos sumando 8 a la variable para saber los multiplos de 8

    } while (MultiploActual <= num1);// ponemos la condicion donde queremos que pare
    System.out.print("Los numeros multiplos de 8 antes de " + num1 + " son esos");
  }
}

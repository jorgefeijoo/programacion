package ud2;

import java.util.Scanner;

public class EjercicioBoletin15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero de filas do rectangulo: ");// creamos scanner y leemos el numero de filas que
                                                                    // queremos que tenga
    int numFila = sc.nextInt();
    System.out.print("Introduce o numero de columnas do rectangulo: ");
    int numColums = sc.nextInt();
    if (numFila < 1 || numColums < 1) {
      System.out.println("Introduce un numero maior que 1");// creamis sccaner y leemos el numero de columnas que
                                                            // queremos que tenga
    } else {// creamos a codicional para si lo otro no se cumple se imprima esto
      for (int i = 0; i < numFila; i++) {// creamos el bucle para que se imprima hasta el numero de filas que
                                         // introducimos
        for (int j = 0; j < numColums; j++) {// creamos el buble para que se imprima el numero de columnas que
                                             // introducimos
          System.out.print("*");

        }
        System.out.println();
      }
    }
  }
}
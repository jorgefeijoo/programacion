package Excepcion2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion2 {
  public static void main(String[] args) {
    int[] array = new int[] { 1, 2, 3, 4 };
    Scanner sc = new Scanner(System.in);
    int posicion = -2;

    // creamos el bucle para que se repita mientras no este dentro del bucle
    while (!(posicion >= 0 && posicion <= 3)) {
      // meto para pedir la posicion dentro del try para que me lo coja las
      // excepciones
      try {
        System.out.println("Introduce la posicion del array ( entre 0 y 4 ) ");
        posicion = sc.nextInt();
        // si esta dentro del rango lo imprimo
        if (posicion >= 0 && posicion <= 3) {
          System.out.println("El valor que hay en la posicion : " + posicion + " es " + array[posicion]);
        } else {
          // si no lanzo la excepcion
          throw new IndexOutOfBoundsException();
        }

      } catch (InputMismatchException e) {
        sc.nextLine();
        System.out.println("Prueba a meter un numero entero");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("No puedes meter un numero que no este en el rango");
      }

    }
  }
}

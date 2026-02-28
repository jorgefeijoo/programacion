package ejercicio9arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9arrays {

  public static void soloPares(int[] numeros) {
    // creamos esta variable para contar el numero de pares que hay para crear el
    // array con la longitud de los pares
    int cantidadPares = 0;

    // hacemos un bucle donde si es par la aumenta esa variable
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        cantidadPares++;

      }
    }
    // creamos o outro array con la longitud de los pares
    int[] pares = new int[cantidadPares];

    // creamos esta variable para encontrar los pares
    int indicePares = 0;

    // le damos o valor al nuevo array que sea igual al otro y cuando son pares que
    // se incremente el indice para que solo muestren los pares
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        pares[indicePares] = numeros[i];
        indicePares++;

      }
    }

    Arrays.sort(pares);

    System.out.println("Arrays: " + Arrays.toString(pares));

  }

  public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a longitude do array: ");
    int longitude = sc.nextInt();

    int[] numeros = new int[longitude];

    for (i = 0; i < numeros.length; i++) {
      System.out.print("Introduce o valor do array: ");
      numeros[i] = sc.nextInt();
    }
    ejercicio9arrays.soloPares(numeros);

  }
}

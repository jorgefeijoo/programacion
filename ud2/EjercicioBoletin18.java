package ud2;

import java.util.Scanner;

public class EjercicioBoletin18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o primeiro numero: ");// pedimos por teclado o primeiro numero
    int num1 = sc.nextInt();
    System.out.print("Introduce o segundo numero: ");// pedimos por teclado o segundo numero
    int num2 = sc.nextInt();
    int resultado = num1 * num2;
    int cont = 0;

    if (num1 <= 0 || num2 <= 0) {// creamos la condicion para que si meten un numero menor que 0 se imprima ese
                                 // mensaje
      System.out.println("Non se pode realizar o MCM probe con outros numeros");
    } else {// si no que se haga esto
      /*
       * tengo que hacer un bucle donde mire todos los numeros pero cuando encuentre
       * un multiplo del resultado que pare y ese e o MCM
       */
    }
  }
}
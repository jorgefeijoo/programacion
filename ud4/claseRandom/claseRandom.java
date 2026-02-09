package claseRandom;

import java.util.Random;
import java.util.Scanner;

public class claseRandom {
  public static void main(String[] args) {
    int limiteInferior = 0;
    int limiteSuperior = 1;
    Random numeroAleatorio = new Random();

    // creamos un bucle que se repita mientras el limite inferior no sea igual al
    // superior
    while (limiteInferior != limiteSuperior) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce el limite inferior: ");
      limiteInferior = sc.nextInt();
      System.out.print("Introduce el limite superior: ");
      limiteSuperior = sc.nextInt();

      // ponemos la condicion donde si el limite inferior es superior al superior que
      // muestre el mensaje de error
      if (limiteInferior > limiteSuperior) {
        System.out.println("No se puede meter un limite inferior mayor que el superior");
      }
      // Pero si no son iguales que imprima un numero random metiendole los valores de
      // los limites para que lo imprima entre esos valores
      else if (limiteInferior != limiteSuperior) {
        System.out.println(numeroAleatorio.nextInt(limiteInferior, limiteSuperior));
      }

    }
  }
}
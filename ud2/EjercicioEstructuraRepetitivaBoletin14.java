package ud2;

import java.util.Scanner;

public class EjercicioEstructuraRepetitivaBoletin14 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("Introduce un numero: ");// Iniciamos y leemos el scanner para introducir el numero que queremos
                                              // multiplicar
    int num1 = sc.nextInt();
    int numMultiplicacion = 1;// iniciamos la variable en 1 porque es el primer numero por el que queremos
                              // multiplicar
    if (num1 >= 30 || num1 <= 1) {// establecemos la condicion para que si introducen un numero menor que 1 o
                                  // mayor que 30 se acabe el programa
      System.out.println("O programa finalizou, proba un numero maior que 1 e menor que 30");
    } else {// creamos la condicion else para que si no se ejecuta lo otro se haga el
            // programa

      do {
        int resultado = num1 * numMultiplicacion;// creamos la variable resultado para mostrar el resultado de la
                                                 // multiplicacion
        System.out.println(
            "El resultado de la multiplicacion entre " + num1 + " y " + numMultiplicacion + " es : " + resultado);
        numMultiplicacion++;// hacemos que el numero por el que multiplicamos se vaya sumando
      } while (numMultiplicacion <= 10);// creamos la condicion para cuando la multiplicacion llegue a 10 pare
    }
  }
}

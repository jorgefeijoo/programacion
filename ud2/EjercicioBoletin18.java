package ud2;

import java.util.Scanner;

public class EjercicioBoletin18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o primeiro numero: ");// pedimos por teclado o primeiro numero
    int num1 = sc.nextInt();
    System.out.print("Introduce o segundo numero: ");// pedimos por teclado o segundo numero
    int num2 = sc.nextInt();
    int resultado = num1 * num2;// creamos a variable resultado que e o produto dos dous numeros
    int cont = 0;

    if (num1 <= 0 || num2 <= 0) {// creamos la condicion para que si meten un numero menor que 0 se imprima ese
                                 // mensaje
      System.out.println("Non se pode realizar o MCM probe con outros numeros");
    } else {// si no que se haga esto
      for (int i = 1; i <= resultado; i++) {//creamos o bucle for iniciandolo en 1 xa que 1 é multiplo de todos hasta resultado que es el minimo comun multiplo siempre
        if (i % num1 == 0 && i % num2 == 0) {// comprobamos que i sea multiplo de num y num2 
          System.out.println("O MCM de " + num1 + " e " + num2 + " e: " + i);
          break;//paramos o bucle para que no siga buscando mas multiplos
        }
      }
     
    }
  }
}
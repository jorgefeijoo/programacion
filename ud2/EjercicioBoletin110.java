package ud2;

import java.util.Scanner;

public class EjercicioBoletin110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// creamos e leemos o scanner para poder introducir o 2 numeros por teclado
    int dividendo;
    int divisor;
    int resultado;// creamos a variable resultado para hacer a division
    int contador = 0;
    do {// creamos o bucle para que si el numero introducido no es -1 se repita
      System.out.print("Introduce o dividendo: ");
      dividendo = sc.nextInt();
      System.out.print("Introduce o divisor: ");
      divisor = sc.nextInt();
      contador++;
      try {
        resultado = dividendo / divisor; // Isto lanza unha excepción
        System.out.println("Resultado: " + resultado);
      } catch (ArithmeticException e) {
        System.out.println("Erro: non se pode dividir entre cero.");
      } finally {
        System.out.println("O programa continuara");
      }
      System.out.println("El numero de divisiones calculado es: " + contador);
    } while (dividendo != -1 || divisor != -1);// poñemos a condicion
  }
}

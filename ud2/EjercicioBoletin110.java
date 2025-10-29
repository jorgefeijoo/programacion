package ud2;

import java.util.Scanner;

public class EjercicioBoletin110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// creamos e leemos o scanner para poder introducir o 2 numeros por teclado
    System.out.print("Introduce o dividendo : ");
    int dividendo = sc.nextInt();
    System.out.print("Introduce o divisor: ");
    int divisor = sc.nextInt();
    int resultado;// creamos a variable resultado para hacer a division
    if (dividendo == 0 || divisor == 0) {// ponemos la condicion para que si alguno de los 2 numeros son 0 mande el
      // mensaje
      System.out.println("Non se pode realizar a division probe con otros numeros");
    }
    try {
      resultado = dividendo / divisor; // Isto lanza unha excepción
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: non se pode dividir entre cero.");
    } finally {
      System.out.println("O programa continuara");
    }

    ;
  }
}

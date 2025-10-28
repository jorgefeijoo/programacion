package ud2;

import java.util.Scanner;

public class EjercicioBoletin17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce o teu dia de nacemento: ");// creamos o scanner para que pongan el dia
    int dia = sc.nextInt();
    System.out.print("Introduce o teu mes de nacemento: ");// creamos el scanner para que ponga el mes
    int mes = sc.nextInt();
    System.out.print("Introduce o teu ano de nacemento: ");// creamos el scanner para que ponga el año
    int ano = sc.nextInt();
    do {
      System.out.print("Introduce o teu dia de nacemento: ");// creamos o scanner para que pongan el dia
      System.out.print("Introduce o teu mes de nacemento: ");// creamos el scanner para que ponga el mes
      System.out.print("Introduce o teu ano de nacemento: ");// creamos el scanner para que ponga el año
    } while (dia >= 1 || dia > 31 || mes >= 1 || mes >= 12 || ano > 2025);

    /*
     * }else
     * 
     * {
     * System.out.println("A tua data de nacemento é: " + dia + "/" + mes + "/" +
     * ano);// le decimos su fecha de
     * // nacimiento
     * int resultado = dia + mes + ano;// creamos la variable resultado para
     * conseguir el resultado de sumar su fecha
     * // de nacemento
     * System.out.
     * println("El resultado de la suma de tu fecha de nacimiento es de: " +
     * resultado);
     * 
     * int cont = 0;
     * while (resultado > 0) {
     * resultado = resultado / 10;
     * cont++;
     * }
     * System.out.println("El numero tiene " + cont + " digitos");
     * }
     */
  }
}
package Caracteres;

import java.util.Scanner;

public class Caracteres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valor = 0;
    do {

      do {
        System.out.print("Introduce de cuantos numeros quieres saber la representacion: ");
      } while (valor <= 1 && valor >= 50);
      valor = sc.nextInt();

    } while (valor != 0);

    if (valor == 0) {
      System.out.println("El valor no puede ser 0 el programa finalizo");
    }
    char car = (char) valor;
    System.out.println("Valor Unicode " + valor);
    System.out.println("Representacion " + car);

  }
}

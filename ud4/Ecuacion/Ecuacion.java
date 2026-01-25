package Ecuacion;

import java.util.Scanner;

public class Ecuacion {
  public static void main(String[] args) {
    // creamos el Scanner y pedimos los valores por teclado
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor de a: ");
    int a = sc.nextInt();
    System.out.print("Introduce el valor de b: ");
    int b = sc.nextInt();
    System.out.print("Introduce el valor de c: ");
    int c = sc.nextInt();

    // creamos la variable discriminante para hacer la cuenta
    double discriminante = (b * b) - 4 * a * c;
    // variables ecuacion para crear la cuenta
    double ecuacion1 = (-b + Math.sqrt(discriminante)) / 2 * a;
    double ecuacion2 = (-b - Math.sqrt(discriminante)) / 2 * a;

    // creamos las condiciones para comprobar si el discriminante es 0 que solo haga
    // la division y si es menor pues que imprima el mensaje
    if (discriminante == 0) {
      ecuacion2 = -b / 2 * a;
      ecuacion1 = -b / 2 * a;

    }
    if (discriminante < 0) {
      System.out.println("La ecuación no tiene solucion real");
    }
    if (a == 0) {
      System.out.println("Es una ecuacion de primer grado. Este programa solo calcula las de 2 grado");
    } else {
      System.out.println("El resultado de la ecuacion con los siguientes valores: " + "a " + a + " b " + b + " c " + c
          + " es: " + ecuacion1);
      System.out.println("El resultado de la ecuacion con los siguientes valores: " + "a " + a + " b " + b + " c " + c
          + " es: " + ecuacion2);
    }

  }
}

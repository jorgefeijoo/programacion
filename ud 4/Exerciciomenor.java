import java.util.Scanner;

public class Exerciciomenor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// creamos las 6 variables de los numeros que tiene que tienen que introducir
                                        // por teclado
    System.out.print("Introduce o primeiro numero: ");
    int num1 = sc.nextInt();
    System.out.print("Introduce o segundo numero numero: ");
    int num2 = sc.nextInt();
    System.out.print("Introduce o terceiro numero: ");
    int num3 = sc.nextInt();
    System.out.print("Introduce o cuarto numero: ");
    int num4 = sc.nextInt();
    System.out.print("Introduce o quinto numero: ");
    int num5 = sc.nextInt();
    System.out.print("Introduce o sexto numero: ");
    int num6 = sc.nextInt();
    if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5 && num1 <= num6) {// hacemos una comparacion de
                                                                                       // num1 con todos los numeros
                                                                                       // para ver si es el menor
      System.out.println("El numero mas pequeño es el " + num1);
    } else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5 && num2 <= num6) {// hacemos una comparacion
                                                                                              // de num2 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas pequeño es el " + num2);
    } else if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5 && num3 <= num6) {// hacemos una comparacion
                                                                                              // de num3 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas pequeño es el " + num3);
    } else if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5 && num4 <= num6) {// hacemos una comparacion
                                                                                              // de num4 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas pequeño es el " + num4);
    } else if (num5 <= num1 && num5 <= num3 && num5 <= num4 && num5 <= num2 && num5 <= num6) {// hacemos una comparacion
                                                                                              // de num5 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas pequeño es el " + num5);
    } else if (num6 <= num1 && num6 <= num3 && num6 <= num4 && num6 <= num5 && num6 <= num2) {// hacemos una comparacion
                                                                                              // de num6 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas pequeño es el " + num6);
    }
    if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 && num1 >= num6) {// hacemos una comparacion de
                                                                                       // num1 con todos los numeros
                                                                                       // para ver si es el menor
      System.out.println("El numero mas grande es el " + num1);
    } else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6) {// hacemos una comparacion
                                                                                              // de num2 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas grande es el " + num2);
    } else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5 && num3 >= num6) {// hacemos una comparacion
                                                                                              // de num3 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas grande es el " + num3);
    } else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5 && num4 >= num6) {// hacemos una comparacion
                                                                                              // de num4 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas grande es el " + num4);
    } else if (num5 >= num1 && num5 >= num3 && num5 >= num4 && num5 >= num2 && num5 >= num6) {// hacemos una comparacion
                                                                                              // de num5 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas grande es el " + num5);
    } else if (num6 >= num1 && num6 >= num3 && num6 >= num4 && num6 >= num5 && num6 >= num2) {// hacemos una comparacion
                                                                                              // de num6 con todos los
                                                                                              // numeros para ver si es
                                                                                              // el menor
      System.out.println("El numero mas grande es el " + num6);
    }

  }
}

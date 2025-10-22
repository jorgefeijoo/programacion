
package ud2;

import java.util.Scanner;

public class BucleDoWhile2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("numero de personas que van a introducir altura: ");// creamos o escaner para saber cantas personas
                                                                         // van a introducir a altura
    int personas = sc.nextInt();
    int contador = 0;// creamos la variable contador
    double SumaAlturas = 0;// creamos la variable para guardar la suma de las alturas
    double altura;// Variabler onde se le cada altura
    do {// ponemos la condicion
      System.out.print("Introduce a altura: ");
      altura = sc.nextDouble();// creamos scanner para introducir as alturas
      SumaAlturas += altura; // gardamos as alturas en la variable SumaAlturas
      contador++;
    } while (contador < personas);
    if (personas <= 0) {
      System.out.println("Non se pode facer xa que o numero e negativo");
    } else {
      System.out.println("Prueba a introducir un numero positivo");
    }
    System.out.println("La altura media es: " + (SumaAlturas / personas));// realizamos la operacion de las medias

  }
}

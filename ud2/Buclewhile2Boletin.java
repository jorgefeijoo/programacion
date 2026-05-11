package ud2;

import java.util.Scanner;

public class Buclewhile2Boletin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("numero de personas que van a introducir altura: ");// creamos o escaner para saber cantas personas
                                                                         // van a introducir a altura
    int personas = sc.nextInt();
    int contador = 0;// creamos la variable contador
    double SumaAlturas = 0;// creamos la variable para guardar la suma de las alturas
    double altura;// Variabler onde se le cada altura
    while (contador < personas) {// ponemos la condicion
      System.out.print("Introduce a altura: ");
      altura = sc.nextDouble();// creamos scanner para introducir as alturas
      SumaAlturas += altura; // gardamos as alturas en la variable SumaAlturas
      contador++;
    }
    System.out.println("La altura media es: " + (SumaAlturas / personas));// realizamos la operacion de las medias

  }
}

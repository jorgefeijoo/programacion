package ud2;

import java.util.Scanner;

public class Buclewhile2Boletin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("numero de personas que van a introducir altura: ");
    int personas = sc.nextInt();
    int contador = 0;

double SumaAlturas=0;
    while (contador <= personas) {
      System.out.print("Introduce a altura: ");
      double altura = sc.nextDouble();
      altura+=SumaAlturas;
      contador++;
    }
System.out.println("La altura media es: " + (SumaAlturas/personas));
    
  }
}

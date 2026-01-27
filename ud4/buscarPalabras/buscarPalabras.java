package buscarPalabras;

import java.util.Scanner;

public class buscarPalabras {
  public static void aparacionPalabra() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a frase: ");
    String frase = sc.nextLine();
    System.out.print("Introduce os caracteres a consultar: ");
    String caracteres = sc.nextLine();
    String fraseMinusculas = frase.toLowerCase();
    System.out.println(fraseMinusculas);

    int contador = 0;
    for (int i = 0; i < frase.length(); i++) {
      if (fraseMinusculas.contains(caracteres)) {
        contador++;
      }
      System.out.println("El numero de ocorrencias de " + caracteres + " es: " + contador);
    }

  }

}

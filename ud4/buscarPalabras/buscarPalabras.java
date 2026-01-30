package buscarPalabras;

import java.util.Scanner;

public class buscarPalabras {

  public static int aparacionPalabra() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a frase: ");
    String frase = sc.nextLine();
    System.out.print("Introduce os caracteres a consultar: ");
    String caracteres = sc.nextLine();
    String fraseMinusculas = frase.toLowerCase();
    System.out.println(fraseMinusculas);

    int contador = 0;
    int posicion = 0;
    int i = 0;

    // creamos o bucle que se repita mientras encuentre alguna ocorrencia
    while (fraseMinusculas.indexOf(caracteres, i) != -1) {

      // le indicamos que la posicion es desde donde encontro la primera ocorrencia
      posicion = fraseMinusculas.indexOf(caracteres, i);
      // si encuentra una ocorrencia se le suma uno al contador
      contador++;

      // le pasamos a i el valor para que empiece desde donde acabo + los caracteres
      // de la palabra
      i = posicion + caracteres.length();

    }

    return contador;
  }

}

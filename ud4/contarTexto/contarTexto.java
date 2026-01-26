package contarTexto;

import java.util.Scanner;

public class contarTexto {

  public static void contarCaracteres(String texto) {
    int i;
    for (i = 0; i < texto.length(); i++) {

    }
    System.out.println("los caracteres de este texto son: " + i);
  }

  public static void contarPalabras(String texto) {
    int j;
    for (j = 0; j < texto.length(); j++) {
      if (texto.charAt(j) == ' ') {
        j++;
      }
    }
    System.out.println("las palabras de este texto son: " + j);
  }

  public static void contarParrafos(String texto) {
    int i;
    for (i = 0; i < texto.length();) {
      if (texto.charAt(i) == '\n') {
        i++;
      }
    }
    System.out.println("los parrafos de este parrafo es: " + i);
  }
}

package contarTexto;

public class contarTexto {

  public static void contarCaracteres(String texto) {
    System.out.println("los caracteres de este texto son: " + texto.length());
  }

  public static void contarParrafos(String texto) {
    int contador = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == '\n') {
        contador++;

      }
    }
    int contadorParrafos = contador + 1;
    System.out.println("los parrafos de este parrafo es: " + contadorParrafos);
  }

  public static void contarPalabras(String texto) {
    int contador = 0;
    for (int j = 0; j < texto.length(); j++) {

      if (texto.charAt(j) == ' ' || texto.charAt(j) == '\n') {
        contador++;
      }
    }

    System.out.println("Las palabras de este texto son: " + (contador + 1));
  }

  public static void contarFrases(String texto) {
    int contador = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == '.') {
        contador++;
      }
    }
    System.out.println("El numero de oraciones de este texto son: " + contador);

  }
}

package Correos;

import java.util.Scanner;

public class Correos2 {

  // Confirma que la cadena contenga en alguna posición intermedia el carácter @ y
  // solamente puede aparecer una vez
  public static boolean comprobarCorreo(String correo) {
    return !correo.startsWith("@") &&
        !correo.endsWith("@") &&
        cuentaArrobas(correo) == 1;
  }

  // comprobar el número de arrobas de una cadena
  public static int cuentaArrobas(String cadena) {
    int cuenta = 0;
    for (int i = 0; i < cadena.length(); i++) {
      if (cadena.charAt(i) == '@') {
        cuenta++;
      }
    }
    return cuenta;
  }

  // convierte los correos a minúsculas y confirma si son iguales
  public static boolean correosSonIguales(String correo1, String correo2) {
    // No se comprueba la longitud porque equals ya confirma que tienen los mismos
    // caracteres. El código sería correo1.length() == correo2.length()
    return correo1.toLowerCase().equals(correo2.toLowerCase());
  }

  public static void main(String[] args) {
    String cadena1 = "";
    String cadena2 = "";
    // creamos o bucle para que si la cadena es vacio que se repita el bucle todo el
    // rato
    try (Scanner sc = new Scanner(System.in)) {
      // creamos o bucle para que si la cadena es vacio que se repita el bucle todo el
      // rato
      while (cadena1.isEmpty() || cadena2.isEmpty()) {
        System.out.print("Introduce a primeira cadena: ");
        cadena1 = sc.nextLine();
        System.out.print("Vuelve a introducir la cadena: ");
        cadena2 = sc.nextLine();
      }
    }
    if (!correosSonIguales(cadena1, cadena2)) {
      System.out.println("Los correos no son iguales");
      return;
    }

    if (!comprobarCorreo(cadena1)) {
      System.out.println("El correo no es válido");
      return;
    }

    System.out.println("Todas las comprobaciones se han ejecutado correctamente");
  }

}

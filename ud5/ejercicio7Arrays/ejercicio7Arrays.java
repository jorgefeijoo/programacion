package ejercicio7Arrays;

import java.util.Scanner;

class ejercicio7Arrays {
  public static boolean comprobarDNI(int numero, char letra, char[] letrillas) {
    // guardamos el resto del numero entre 23 en la variable
    int resto = numero % 23;

    // comprobamos si la letra es igual que la letra de la tabla en la posicion del
    // resto
    if (letra == letrillas[resto]) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    char[] letrillas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
        'L', 'C', 'K', 'E' };
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero do teu DNI: ");
    int numero = sc.nextInt();
    System.out.print("Introduce la letra del DNI: ");
    char letra = sc.next().toUpperCase().charAt(0);
    // comprobamos si el metodo devuelve true imprime ese mensaje si no no
    if (ejercicio7Arrays.comprobarDNI(numero, letra, letrillas)) {
      System.out.println("El dni es correcto");
    } else {
      System.out.println("El dni es incorrecto");
    }
  }

}
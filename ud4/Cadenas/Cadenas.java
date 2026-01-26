
import java.util.Scanner;

//ejercicio que lea 2 cadenas por teclado las concatene de las 2 maneras que vimos  que calcule la longitud de la cadena concatenada e que mostre para cada posicion o caracter que ten asignado
public class Cadenas {

  public static void main(String[] args) {
    // creamos o Scanner e metemos os valores
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a primeira cadena: ");
    String cadena1 = sc.nextLine();

    System.out.print("Introduce a segunda cadena: ");
    String cadena2 = sc.nextLine();
    // creamos a variable para a concatenacion

    String concat1 = cadena1 + cadena2;
    // Para pasar los caracteres de las minusculas a las maiusculas
    System.out.println(concat1.toUpperCase());

    // condicion para ver si la cadena esta baleira
    if (concat1.isEmpty()) {
      System.out.println("La cadena esta baleira");
    }
    if (concat1.equals("")) {//
      System.out.println("La cadena esta vacia por el segundo metodo");
    } else {

      // creamos a variable longitud para contar la longitud mediante el length
      int lonxitude1 = cadena1.length() + cadena2.length();
      System.out.println("La longitud de la primera cadena es: " + lonxitude1);

      // pasar de String a cadena
      int numero = 150;
      String texto = String.valueOf(numero);
      System.out.println(texto);

      // creamos o bucle para decir donde esta cada posicion

      for (int i = 0; i < lonxitude1; i++) {
        System.out.println("Carácter en posición " + i + ": " + concat1.charAt(i));
      }
      // comprueba si son iguales las cadenas
      if (cadena1.equals(cadena2)) {
        System.out.println("Son iguales");
      } else {
        System.out.println("No son iguales");
      }

    }

    System.out.println("-------------------------------------------------------------");
    // pedimos os valores
    System.out.print("Introduce a primeira cadena: ");
    String cadena3 = sc.nextLine();
    System.out.print("Introduce a segunda cadena: ");
    String cadena4 = sc.nextLine();
    // creamos a variable para a concatenacion
    String concat2 = cadena3.concat(cadena4);
    // pasamos todos los caracteres a minusculas
    concat2.toLowerCase();
    System.out.println(concat2.toLowerCase());
    // creamoos la condicion para saber si esta baleira

    if (concat2.isEmpty()) {
      System.out.println("La cadena esta baleira");
    }
    if (concat2 == "") {
      System.out.println("La cadena esta vacia por el metodo 2");
    } else {
      // creamos a variable longitud para contar la longitud mediante el length
      int lonxitude2 = cadena3.length() + cadena4.length();
      System.out.println("La longitud de la segunda cadena es: " + lonxitude2);
      // creamos o bucle para decir donde esta cada posicion
      for (int i = 0; i < lonxitude2; i++) {
        System.out.println("Carácter en posición " + i + ": " + concat2.charAt(i));
      }
    }
    if (cadena3.equals(cadena4)) {
      System.out.println("Son iguales");
    } else {
      System.out.println("No son iguales");
    }

  }
}

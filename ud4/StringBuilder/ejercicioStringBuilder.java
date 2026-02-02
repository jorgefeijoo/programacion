package StringBuilder;

import java.util.Scanner;

public class ejercicioStringBuilder {

  public static String CadeaInversa(String cadea) {
    StringBuilder sb = new StringBuilder();
    sb.append(cadea);
    System.out.println("Inversa: " + sb.reverse());
    return cadea;
  }

  public static String cambioPalabra(String cadea) {
    StringBuilder sb = new StringBuilder();
    sb.setLength(0);
    sb.append(cadea);
    sb.replace(3, 9, "Java!");

    System.out.println("Cambio: " + sb.toString());
    return cadea;
  }

  public static String InsertarPalabra(String cadea) {
    StringBuilder sb = new StringBuilder();
    sb.append(cadea);

    sb.insert(4, " anxito ");
    System.out.println("Insertar: " + sb.toString());
    return cadea;
  }

  public static String substituirVogais(String cadea) {
    StringBuilder sb = new StringBuilder();
    String vocales = "aeiou";
    for (int i = 0; i < cadea.length(); i++) {
      char caracteres = cadea.charAt(i);
      if (vocales.indexOf(caracteres) == -1) {
        sb.append(caracteres);
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce una cadena: ");
    String cadea = sc.nextLine();

    ejercicioStringBuilder.CadeaInversa(cadea);
    ejercicioStringBuilder.cambioPalabra(cadea);
    ejercicioStringBuilder.InsertarPalabra(cadea);
    System.out.println(ejercicioStringBuilder.substituirVogais(cadea));

    sc.close();
  }
}
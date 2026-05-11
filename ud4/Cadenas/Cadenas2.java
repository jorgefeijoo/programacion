import java.util.Scanner;

public class Cadenas2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a primeira cadena: ");
    String cadena1 = sc.nextLine();

    System.out.print("Introduce a segunda cadena: ");
    String cadena2 = sc.nextLine();
    // creamos a variable para a concatenacion

    String concat1 = cadena1 + cadena2;
    System.out.println(concat1.trim());

    int indice = concat1.indexOf('o');
    System.out.println("La posicion de caracter introducido es: " + indice);
    int indiceUltimo = concat1.lastIndexOf('o');
    System.out.println("La ultima posicion de caracter introducido es: " + indiceUltimo);

    if (cadena1.contains("anxito")) {
      System.out.println("El metodo va bien ");
    } else {
      System.out.println("El metodo este va mal");
    }

    if (concat1.startsWith("anx")) {
      System.out.println("Este metodo va muy bien");
    } else {
      System.out.println("Este metodo va muy mal");
    }

    System.out.println(concat1.trim().substring(3));
    System.out.println(concat1.trim().substring(0, 3));

  }
}

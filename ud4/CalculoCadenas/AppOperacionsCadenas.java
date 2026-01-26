import java.util.Scanner;

public class AppOperacionsCadenas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce unha cadena: ");
    String cadena1 = sc.nextLine();
    System.out.println(OperacionsCadenas.Reves(cadena1));
    String cadenaInvertida = OperacionsCadenas.Reves(cadena1);
    OperacionsCadenas.sinEspazos(cadena1);
    System.out.println();
    System.out.println("A cadena e un palindroma?: " + OperacionsCadenas.palindroma(cadena1, cadenaInvertida));
  }

}

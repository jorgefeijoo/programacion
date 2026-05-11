import java.util.Scanner;

public class NumeroPar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println("El " + num + " es un numero par");
    } else {
      System.out.println("El " + num + " es un numero impar");
    }
  }
}

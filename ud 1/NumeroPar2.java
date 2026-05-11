import java.util.Scanner;

public class NumeroPar2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o  numero: ");
    int num1 = sc.nextInt();
    String resultado = (num1 % 2 == 0) ? "Par" : "Impar";
    System.out.println("El " + num1 + " es un numero " + resultado);
  }
}

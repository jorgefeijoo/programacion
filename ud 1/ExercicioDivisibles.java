import java.util.Scanner;

public class ExercicioDivisibles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o numero: ");
    int num1 = sc.nextInt();// introducimos num 1
    System.out.print("Introduce o segundo numero: ");
    int num2 = sc.nextInt();
    if (num1 % num2 == 0) {
      System.out.println("Los numeros son divisibles entre si");

    } else {
      System.out.println("Los numeros no son divisible entre si");
    }
    if (num2 % num1 == 0) {
      System.out.println("Los numeros son divisibles entre si");

    } else {
      System.out.println("Los numeros no son divisible entre si");
    }
  }
}

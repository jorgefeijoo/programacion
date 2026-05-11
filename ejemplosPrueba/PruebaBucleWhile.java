import java.util.Scanner;

public class PruebaBucleWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número maior que 1");
    int num = sc.nextInt();
    int i = 1;
    while (i <= num) {
      System.out.println(i);
      i++;
    }
  }
}

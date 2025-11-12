import java.util.Scanner;
public class SumaDecimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
System.out.print("Introduce o primeiro número (en decimal): ");
    double num1= sc.nextDouble();
    System.out.print("Introduce o segundo numero da suma (en decimal) ");
    double num2 = sc.nextDouble();
    System.out.println("O resultado da suma é " + (num1+num2));

        
    }
}

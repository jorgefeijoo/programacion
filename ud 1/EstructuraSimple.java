import java.util.Scanner;

public class EstructuraSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creamos a clase scanner para introducir os datos
        System.out.print("Introduce o primeriro numero: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {// introducimos a condicion
            System.out.println("El numero es par");// decimos a sentenza
        } else {
            System.out.println("Es impar");// si el numero es impar se imprimira esto
        }
        sc.close();

        
    }
}

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o ano: ");
        int año1 = sc.nextInt();
        if (año1 % 400 == 0) {// ponemos condiciones
            System.out.println(año1 + " é año bisiesto");
        } else if (año1 % 100 == 0) {// creamos otra condicion
            System.out.println(año1 + "  non é un año bisiesto");
        } else if (año1 % 4 == 0) {//miramos otra condicion 
            System.out.println(año1 + " é año bisiesto");
        } else {// si no pasa ninguna de las anteriores pasa esto
            System.out.println(año1 + " non é año bisiesto");
        }
        sc.close();
    }
}

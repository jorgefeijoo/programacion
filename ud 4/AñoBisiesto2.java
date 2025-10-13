
    import java.util.Scanner;
public class AñoBisiesto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o ano: ");
        int año1 = sc.nextInt();
        if (año1 % 400 == 0) {// ponemos condiciones
            System.out.println(año1 + " é año bisiesto");
        } else {// si no pasa ninguna de las anteriores pasa esto
           if (año1%100==0) {
            System.out.println(año1 + " non é año bisiesto");
           if (año1%4==0) {
            System.out.println(año1 + " é un ano bisiesto");
           }
        }
    }
        sc.close();
    }
}

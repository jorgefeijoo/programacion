
import java.util.Scanner;

public class TraballoCadeas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a primera cadena: ");
        String cadena1 = sc.nextLine();
        System.out.print("Introduce a segunda cadena: ");
        String cadena2 = sc.nextLine();
        System.out.println("suma das dos cadenas: " + (cadena1 + "" +cadena2));
    }

}

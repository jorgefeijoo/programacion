
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AppLogistica {

    public static void main(String[] args) {
        String[] codigos = new String[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codigos.length; i++) {
            System.out.print("Introduce los valores del array: ");
            codigos[i] = sc.nextLine();
        }

        for (int i = 0; i < codigos.length; i++) {
            codigos[i] = logistica.limpiarTexto(codigos[i]);
            System.out.println("El valor del array en la posicion " + i + " es " + codigos[i]);
        }

        Arrays.sort(codigos);
        for (int i = 0; i < codigos.length; i++) {
            System.out.println(  " \n El valor del array en la posicion " + i + " es " + codigos[i]
        
        );
        }

        System.out.println("------------------------------------------");

        Arrays.sort(codigos, Collections.reverseOrder());
        for (int i = 0; i < codigos.length; i++) {
            System.out.println(" \n El valor del array en la posicion " + i + " es " + codigos[i]);
        }

    }
}

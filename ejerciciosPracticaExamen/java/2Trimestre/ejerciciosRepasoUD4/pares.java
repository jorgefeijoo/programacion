
import java.util.Arrays;
import java.util.Scanner;

public class pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantos numeros quieres introducir: ");
        int CantidadNumeros = sc.nextInt();
        int pares[] = new int[CantidadNumeros];

        for (int i = 0; i < CantidadNumeros; i++) {
            System.out.print("Introducir los numeros con los que quieres rellenar el array: ");
            pares[i] = sc.nextInt();

        }
        int posiciones = soloPares(pares);

        Arrays.sort(pares, 0, posiciones);

        System.out.println("--------------------");
        for (int i = 0; i < posiciones; i++) {
            System.out.println("El valor del array en la posicion " + i + " es:  " + pares[i]);
        }
    }

    public static int soloPares(int[] pares) {

        int pos = 0;
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                pares[pos] = pares[i];
                pos++;
            }
        }
        return pos;

    }
}

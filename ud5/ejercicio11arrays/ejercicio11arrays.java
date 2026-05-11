
import java.util.Random;
import java.util.Scanner;

public class ejercicio11arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
         int rango = (9 - 1) + 1;// las posiciones que se va a mover 
        int valorAleatorio = r.nextInt(rango) + 1;
        int suma =0;

        System.out.print("Introduce el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el numero de columnas:");
        int columnas = sc.nextInt();
        System.out.println();

        int numeros[][] = new int[filas][columnas];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Fila " + i +" : ");
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]=r.nextInt(rango)+1;
                System.out.print( numeros[i][j]+ " ");
                suma+=numeros[i][j];
            }
            System.out.println();
        }
        System.out.println("\nLa suma de los valores del array es: "+ suma);

       

    }

}

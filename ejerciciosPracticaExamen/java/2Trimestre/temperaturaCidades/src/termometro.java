
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class termometro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        double min = -5;
        double max = 40;
        double mediaTemp = 0;
        Double[] medias = new Double[5];

// creamos o arrai
        double matriz[][] = new double[5][7];

        // bucle para rellenar los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextDouble(min, max);
            }
        }
// bucle para recorrer el arrai
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" Fila " + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        // guardamos la media de las temperaturas en una variable
        for (int i = 0; i < matriz.length; i++) {
            // creamos la variable suma que es como las filas 
            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                // a esas variables filas le sumamos el valor de la suma de sus columnas
                suma = suma + matriz[i][j];
            }
            // le hacemos la media diviendiendo esa suma por el numero de columnas en este caso 7
            mediaTemp = suma / 7;
            System.out.println();
            // lo metemos en un array
            medias[i] = mediaTemp;
        }

        Arrays.sort(medias, Collections.reverseOrder());
        for (int i = 0; i < medias.length; i++) {
            System.out.println("El valor del array en la posicion " + i + " es " + medias[i]);
        }

    }
}

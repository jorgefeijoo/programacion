
import java.util.Random;

public class Cualificaciones {

    public static void main(String[] args) {

        Random r = new Random();
        int[][] notas = new int[4][3];
        String[] alumnos = {"Ana", "Brais", "Celia", "David"};
        int mediaAlumno = 0;
       

        // array para rellenar la matriz
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = r.nextInt(10 - 0) + 1;;
            }
        }

         int notaMasAlta=notas[0][0];

// bucle para mostrar el array
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            System.out.print(alumnos[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(" " + notas[i][j]);
                suma = suma + notas[i][j];

                if (notas[i][j]>=notaMasAlta) {
                    notaMasAlta=notas[i][j];
                }
            }
              mediaAlumno = suma / 3;
               System.out.print("\t | la media de " + alumnos[i] + " es " + mediaAlumno);
            System.out.println();
           

        }

        System.out.println("\nLa nota mas alta fue: "+ notaMasAlta);
       

        

    }
}

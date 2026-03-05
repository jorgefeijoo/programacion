package ejercicio12;

import java.util.Random;

public class ejercicio12 {
  public static void main(String[] args) {

    int notillas[][] = new int[10][8];
    Random r = new Random();
    int rango = (9 - 1) + 1;
    int sumaTotal = 0;
    int aprobados = 0;
    int suspensos = 0;
    double mediaAlumnos = 0;
    // la inicializo a false
    boolean tenTodoAprobado = false;

    // bucle para recorrer la matriz
    for (int i = 0; i < notillas.length; i++) {

      System.out.print("Fila " + i + " : ");
      for (int j = 0; j < notillas[i].length; j++) {
        notillas[i][j] = r.nextInt(rango) + 1;
        System.out.print(notillas[i][j] + " ");
      }
      System.out.println();
    }

    int notaMayor = notillas[0][0];
    int notaMenor = notillas[0][0];

    for (int i = 0; i < notillas.length; i++) {
      // inicializo a 0 para que se vaya reiniciando
      int sumaAlumno = 0;
      // inicializo a true asumiendo que tienen todo aprobado
      tenTodoAprobado = true;

      for (int j = 0; j < notillas[i].length; j++) {
        // sumamos todos los numeros de la matriz para hacer despues la media
        sumaTotal += notillas[i][j];
        // condicion para buscar la mejor nota
        if (notillas[i][j] > notaMayor) {
          notaMayor = notillas[i][j];
        }
        // condicion para buscar la peor nota
        if (notillas[i][j] > notaMenor) {
          notaMenor = notillas[i][j];
        }
        // condicion para buscar los aprobados
        if (notillas[i][j] >= 5) {
          aprobados++;
          // condicion para buscar los suspensos
        } else {
          suspensos++;
          tenTodoAprobado = false;
        }
        // creamos las notas de cada alumno
        int notasActual = notillas[i][j];
        sumaAlumno += notasActual;

      }
      // hacemos la media de cada alumno
      mediaAlumnos = sumaAlumno / notillas[i].length;
      System.out.println("\nA media do alumno " + (i + 1) + " es: " + mediaAlumnos);
    }

    double mediaTotal = sumaTotal / (notillas.length * notillas[0].length);
    System.out.println("La media total del curso es: " + mediaTotal);
    System.out.println("EL numero de aprobados es: " + aprobados);
    System.out.println("EL numero de suspensos es: " + suspensos);
    System.out.println("La mejor nota es: " + notaMayor);
    System.out.println("La peor nota es: " + notaMenor);

    if (tenTodoAprobado) {
      System.out.println("Un alumno tiene todo aprobado");
    } else {
      System.out.println("Ningun alumno  tiene todo aprobado");
    }
  }
}

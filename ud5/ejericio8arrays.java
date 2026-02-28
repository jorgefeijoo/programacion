import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ejericio8arrays {

  public static void invertirArray(int[] copia) {
    int i = 0;
    int auxiliar = ' ';
    int ultimo = copia.length - 1;

    for (i = 0; i < copia.length / 2; i++) {
      // creamos a auxiliar en letrillas[i] para que se vaya incrementando en cada
      // vuelta
      auxiliar = copia[i];
      // intercambiamos la primera por la ultima
      copia[i] = copia[ultimo];
      // intercambiamos las ultimas ppor las primeras
      copia[ultimo] = auxiliar;
      // decrementamos o array dende o final para que vaya intercambiando
      ultimo--;

    }

  }

  public static void main(String[] args) {
    int[] a = new int[5];
    int[] copia = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.print("Introduce el valor para rellenar el valor: ");
      a[i] = sc.nextInt();
      copia[i] = a[i];
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + a[i]);
    }
    System.out.println("-------------------------------------");

    for (int i = 0; i < a.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + copia[i]);
    }

    Arrays.sort(a);
    // Arrays.sort(copia,Collections.reverseOrder());
    ejericio8arrays.invertirArray(copia);
    ;

    System.out.println("-------------------------------------");
    for (int i = 0; i < a.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + a[i]);
    }
    System.out.println("-------------------------------------");

    for (int i = 0; i < copia.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + copia[i]);
    }

  }
}

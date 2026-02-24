import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ejericio8arrays {
  public static void main(String[] args) {
    int[] a = new int[5];
    Integer[] copia = new Integer[5];
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
  Arrays.sort(copia,Collections.reverseOrder());

  System.out.println("-------------------------------------");
  for (int i = 0; i < a.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + a[i]);
    }
    System.out.println("-------------------------------------");

    for (int i = 0; i < a.length; i++) {
      System.out.println("El valor del array en la posicion" + i + " es " + copia[i]);
    }



  }
}


import java.util.Scanner;

public class DiasSemana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int meses = sc.nextInt();

    if (meses == 1) {// ponemos las condiciones
      System.out.println("este dia es Lunes");
    } else if (meses == 2) {
      System.out.println("este dia es Martes");
    } else if (meses == 3) {
      System.out.println("este dia es Miercoles");
    } else if (meses == 4) {
      System.out.println("este dia  es Jueves");
    } else if (meses == 5) {
      System.out.println("este dia  es Viernes");
    } else if (meses == 6) {
      System.out.println("este dia  es Sabado");
    } else if (meses == 7) {
      System.out.println("este dia  es Domingo");
      ;
    } else {// si no es ninguna de las condiciones
      System.out.println("prueba un numero del 1 al 7");
    }

  }

}

import java.util.Scanner;

public class MesesCondicionales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int meses = sc.nextInt();

    if (meses == 1) {// ponemos las condiciones
      System.out.println("este mes es enero");
    } else if (meses == 2) {
      System.out.println("este mes es febrero");
    } else if (meses == 3) {
      System.out.println("este mes es marzo");
    } else if (meses == 4) {
      System.out.println("este mes es abril");
    } else if (meses == 5) {
      System.out.println("este mes es mayo");
    } else if (meses == 6) {
      System.out.println("este mes es junio");
    } else if (meses == 7) {
      System.out.println("este mes es julio");
    } else if (meses == 8) {
      System.out.println("este mes es agosto ");
    } else if (meses == 9) {
      System.out.println("este mes es septiembre ");
    } else if (meses == 10) {
      System.out.println("este mes es octubre ");
    } else if (meses == 11) {
      System.out.println("este mes es noviembre ");
    } else if (meses == 12) {
      System.out.println("este mes es diciembre ");
    } else {// si no se cumple ninguna de las condiciones anteriores
      System.out.println("prueba un numero del 1 al 12");
    }

  }

}

import java.util.Scanner;

public class MesesCondicionales2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int mes = sc.nextInt();
    switch (mes) {
      case 1:// ponemos todas las condiciones posibles
        System.out.println(" El mes equivalente es Enero");
        break;
      case 2:
        System.out.println(" El mes equivalente es Febrero");
        break;
      case 3:
        System.out.println(" El mes equivalente es Marzo");
        break;

      case 4:
        System.out.println(" El mes equivalente es Abril");
        break;

      case 5:
        System.out.println(" El mes equivalente es Mayo");
        break;

      case 6:
        System.out.println(" El mes equivalente es Junio");
        break;
      case 7:
        System.out.println(" El mes equivalente es Julio");
        break;

      case 8:
        System.out.println(" El mes equivalente es Agosto");
        break;

      case 9:
        System.out.println("E l mes equivalente es Septiembre");
        break;

      case 10:
        System.out.println(" El mes equivalente es Octubre");
        break;

      case 11:

        System.out.println(" El mes equivalente es Noviembre");
        break;

      case 12:
        System.out.println(" El mes equivalente es Diciembre");
        break;

      default:// si no se cumple ninguna de las condiciones anteriores
        System.out.println("Mes introducido no valido");
        break;
    }
  }
}

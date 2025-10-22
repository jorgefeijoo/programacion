import java.util.Scanner;

public class EjemploFlag {
  public static void main(String[] args) {
    int flag; // Declaramos a bandeira
    for (int numero = 2; numero <= 100; numero++) {
      flag = 0; // Inicializamos a bandeira a 0.
      for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
          flag = 1;
          break; /* XA ATOPAMOS ALGÚN DIVISOR */
        }
      }
      if (flag == 0) {
        System.out.println(numero + " é primo");
      }
    }
  }
}

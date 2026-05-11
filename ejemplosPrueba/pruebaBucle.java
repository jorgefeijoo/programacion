
import java.util.Scanner;

public class pruebaBucle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce o número de vendas: ");
    int numVendas = sc.nextInt();
    /*
     * Declaramos unha variable para sumar as vendas,
     * se o declaramos dentro do bucle, non poderiamos
     * acceder fóra do bucle á suma das vendas.
     */
    int sumaVendas = 0;
    for (int i = 0; i < numVendas; i++) {
      // indico o numero de venda
      System.out.println("Introduce o prezo da venda " + (i + 1));
      int venda = sc.nextInt();
      // Acumulamos o valor da venda
      sumaVendas = sumaVendas + venda;
    }
    System.out.println(sumaVendas);
  }

}

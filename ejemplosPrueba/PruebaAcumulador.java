public class PruebaAcumulador {
  public static void main(String[] args) {
    int acumulador = 0;
    for (int i = 1; i <= 1000; i++) {
      acumulador += i; // Acumula a suma dos números do 1 ao 5
    }
    System.out.println("A suma dos números do 1 ao 1000 é: " + acumulador);

  }
}

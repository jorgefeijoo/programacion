public class pruebaContador {
  public static void main(String[] args) {
    int contador = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 2 == 0) { // Se o número é par
        contador++; // Incrementa o contador
      }
    }
    System.out.println("Hai " + contador + " números pares do 1 ao 1000.");
  }
}

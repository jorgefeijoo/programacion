public class Ejemploanidado {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.println("Número " + i);
      if (i % 2 == 0) {
        for (int j = 1; j <= 2; j++) {
          System.out.println(" Dentro do if, repetición " + j);
        }
      } else {
        System.out.println(" Número impar, non entra no bucle interior");
      }
    }
  }
}

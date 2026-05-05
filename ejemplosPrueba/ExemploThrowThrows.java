import java.io.IOException;

public class ExemploThrowThrows {
  // Declaramos que este método pode lanzar IOException
  public static void comprobarNumero(int numero) throws IOException {
    if (numero <= 0) {
      // Lanzamos a excepción concreta
      throw new IOException("O número non é positivo");
    }
    System.out.println("O número é positivo: " + numero);
  }

  public static void main(String[] args) {
    try {
      comprobarNumero(5); // Todo ben
      comprobarNumero(-3); // Xera excepción
    } catch (IOException e) {
      System.out.println("Capturada a excepción: " + e.getMessage());
    }
  }
}
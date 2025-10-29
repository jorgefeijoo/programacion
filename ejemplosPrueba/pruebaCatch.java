public class pruebaCatch {
  public static void main(String[] args) {
    try {
      int resultado = 10 / 0; // Isto lanza unha excepción
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: non se pode dividir entre cero.");
    }
    System.out.println("Programa continúa...");
  }
}

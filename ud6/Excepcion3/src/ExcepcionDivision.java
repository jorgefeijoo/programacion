public class ExcepcionDivision {
  /*
   * Crear unha clase Java con un método chamado dividir que reciba dous números
   * enteiros a
   * e b e devolva o resultado da división a / b.
   * Se b é 0, o método debe lanzar unha excepción IllegalArgumentException co
   * mensaje
   * "División por cero non permitida". A execepción non será manexada no propio
   * método,
   * senón no método chamante.
   * No método main, chamar ao método dividir cunha división válida e outra
   * inválida (b =
   * 0), e capturar a excepción mostrando a mensaxe.
   */

  public static int dividir(int a, int b) throws IllegalArgumentException {

    if (b == 0) {
      throw new IllegalArgumentException("Division por cero non permitida");
    }
    int resultado = a / b;
    return resultado;

  }

  public static void main(String[] args) {
    try {
      System.out.println("El resultado de la division " + dividir(10, 5));
      System.out.println("El resultado de la division " + dividir(10, 0));
    } catch (IllegalArgumentException e) {
      System.out.println("Excepcion capturada: " + e.getMessage());
    }
  }

}

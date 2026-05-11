public class DemoExcepcionPropia {
  // Método que valida a idade
  public static void validaIdade(int edad) throws DatoNonValidoException {
    if (edad < 18) {
      // Lanzamos a nosa excepción propia con información detallada
      throw new DatoNonValidoException(
          Integer.toString(edad), // valor incorrecto
          101, // código de erro
          "Menor de idade" // mensaxe
      );
    }
    System.out.println("Idade válida: " + edad);
  }

  public static void main(String[] args) {
    try {
      validaIdade(19); // provoca a excepción
    } catch (DatoNonValidoException e) {

      // Catch específico para a nosa excepción
      System.out.println("→ Capturada DatoNonValidoException:");
      System.out.println("Código de erro: " + e.getErrorCode());
      System.out.println("Mensaxe: " + e.getMessage());
      System.out.println("Detalle completo: " + e); // chama a toString()
    } catch (Exception e) {
      // Catch xenérico para calquera outra excepción
      System.out.println("→ Excepción xenérica capturada:");
      System.out.println(e);
    }
    System.out.println("Programa rematado correctamente.");
  }
}

public class DemoExcepcionPropia {
  public static void validaIdade(int edad) {
    try {
      if (edad < 18) {
        // Lanzamos a nosa excepción propia con información detallada
        throw new DatoNonValidoException(
            Integer.toString(edad), // valor incorrecto
            101, // código de erro
            "Menor de idade" // mensaxe
        );
      }
      System.out.println("Idade válida: " + edad);
    } catch (DatoNonValidoException e) {
      System.out.println("Idade non valida: " + e.getMessage());
      System.out.println("→ Capturada DatoNonValidoException:");
      System.out.println("Código de erro: " + e.getErrorCode());
      System.out.println("Mensaxe: " + e.getMessage());
      System.out.println("Detalle completo: " + e); // chama a
    }
  }

  public static void main(String[] args) {
    validaIdade(15);
  }
}

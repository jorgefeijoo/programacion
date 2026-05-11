package operacions;

public class operacionsCadeas {
  public static String invertir(String texto) {
    return new StringBuilder(texto).reverse().toString();
  }
}

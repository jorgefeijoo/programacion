package contarTexto;

public class AppContarTexto {
  public static void main(String[] args) {
    String texto = ("Isto é unha proba. É un "
        + "trozo de texto para probar o método.\nConsta de varios parágrafos. "
        + "Tamén de varias frases e de moitas palabras.\nO resultado debe "
        + "ser 3 parágrafaos, 5 frases, 38 palabras e 210 caracteres.");

    contarTexto.contarCaracteres(texto);
    contarTexto.contarPalabras(texto);
    contarTexto.contarParrafos(texto);
    contarTexto.contarFrases(texto);
  }
}

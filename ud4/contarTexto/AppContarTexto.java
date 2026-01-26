package contarTexto;

public class AppContarTexto {
  public static void main(String[] args) {
    String texto = "El amanecer trae consigo una nueva oportunidad. La luz del sol ilumina los campos verdes y las ciudades despiertan lentamente. /n El tiempo avanza sin detenerse jamás. Es fundamental aprovechar cada minuto para aprender algo nuevo o ayudar a alguien en el camino. /n Finalmente el día termina y llega la calma de la noche. Las estrellas aparecen en el firmamento para guiarnos hacia el descanso merecido.";
    contarTexto.contarCaracteres(texto);
    contarTexto.contarPalabras(texto);
    contarTexto.contarParrafos(texto);
  }
}

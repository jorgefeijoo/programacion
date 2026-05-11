public class Main {
  public static void main(String[] args) {
    Instrumento[] arrayInstrumentos = new Instrumento[4];
    // creamos un objeto de cada tipo
    arrayInstrumentos[0] = new Guitarra("guitarrilla👌", "cuerda");
    arrayInstrumentos[1] = new Piano("pianillo👌", "Corda");
    arrayInstrumentos[2] = new Flauta("flautilla doma Gosendos👌", "viento");
    arrayInstrumentos[3] = new Bateria("Baterilla👌", "Percusion");

    // bucle para recorrer el array y hacemos los instance of de cada metodo
    for (Instrumento instrumento : arrayInstrumentos) {

      instrumento.mostrarDatos();
      instrumento.tocar();

      if (instrumento instanceof Guitarra) {
        ((Guitarra) instrumento).afinarCorda(3);
        System.out.println("------------------------------");
      } else if (instrumento instanceof Piano) {
        ((Piano) instrumento).abrirTapa();
        System.out.println("------------------------------");
      } else if (instrumento instanceof Flauta) {
        ((Flauta) instrumento).limpar();
        System.out.println("------------------------------");
      } else if (instrumento instanceof Bateria) {
        ((Bateria) instrumento).axustarTambores();
        System.out.println("------------------------------");
      }

    }

  }
}

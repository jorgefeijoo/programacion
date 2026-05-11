public class Flauta extends Instrumento {

  // pillamos el constructor de la superclase
  public Flauta(String nome, String familia) {
    super(nome, familia);
  }

  // redefinimos el metodo tocar
  @Override
  public void tocar() {
    System.out.println("Fiu Fiu");
  }

  // creamos metodo nuevo de la propia clase
  public void limpar() {
    System.out.println("Flauta Limpa");
  }

}

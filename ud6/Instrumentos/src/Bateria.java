public class Bateria extends Instrumento {

  // pillamos o constructor de da superclase
  public Bateria(String nome, String familia) {
    super(nome, familia);
  }

  // redefinimos el metodo tocar
  @Override
  public void tocar() {
    System.out.println("Bang Bang");
  }

  // creamos metodo propio
  public void axustarTambores() {
    System.out.println("Tambores axustados");
  }

}

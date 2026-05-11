public class Piano extends Instrumento {

  public Piano(String nome, String familia) {
    super(nome, familia);

  }

  // redefinimos el metodo tocar
  @Override
  public void tocar() {
    System.out.println("Plink plonk");
  }

  // creamos o propio metodo da clase
  public void abrirTapa() {
    System.out.println("La tapa del piano esta abierta");
  }

}

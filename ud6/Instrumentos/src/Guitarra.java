public class Guitarra extends Instrumento {

  // constructor de la superclase
  public Guitarra(String nome, String familia) {
    super(nome, familia);
  }

  // redefinimos el metodo tocar
  @Override
  public void tocar() {
    System.out.println("Strum Strum");
  }

  // creamos metodo afinar corda
  public void afinarCorda(int corda) {
    System.out.println("Se esta afinando la cuerda : " + corda);
  }

}

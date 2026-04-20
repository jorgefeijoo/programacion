public class Operarios extends Empregado {

  public Operarios(String nome) {
    super(nome);
  }

  @Override
  public String toString() {
    return super.toString() + " => Operario";
  }

}

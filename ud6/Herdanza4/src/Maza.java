public final class Maza extends Froita {
  private String cor;

  public Maza(String nome, String cor) {
    super(nome);
    this.cor = cor;
  }

  public Maza(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Maza() {
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("O cor da froita e: " + getCor());
  }

  /*
   * @Override
   * public void comer() {
   * super.comer();
   * }
   */

}

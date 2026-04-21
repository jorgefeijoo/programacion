public abstract class Vehiculo {
  private String marca;
  private String modelo;
  private int velocidadeMaxima;

  public final int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public final void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public abstract void acelerar(int intensidade);

  public abstract void frear(int intensidade);

}

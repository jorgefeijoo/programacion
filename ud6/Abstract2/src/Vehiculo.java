public abstract class Vehiculo {

  private String marca;
  private String modelo;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  private int velocidadeMaxima;

  public Vehiculo(String marca, String modelo, int velocidadeMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  // creamos getter con el modificador final por lo que no se podra redefinir
  public final int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  // creamos setter con el modificador final por lo que no se va a ppoder
  // redefinir
  public final void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  // metodo abstracto acelerar
  public abstract void acelerar(int intensidade);

  // metodo abstracto frear
  public abstract void frear(int intensidade);

}

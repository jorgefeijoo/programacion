public class Bicicleta extends Vehiculo {

  // creamos atributos
  private int numeroMarchas;
  private boolean tenSuspension;

  public int getNumeroMarchas() {
    return numeroMarchas;
  }

  public void setNumeroMarchas(int numeroMarchas) {
    this.numeroMarchas = numeroMarchas;
  }

  public boolean isTenSuspension() {
    return tenSuspension;
  }

  public void setTenSuspension(boolean tenSuspension) {
    this.tenSuspension = tenSuspension;
  }

  // constructor super con los de vehiculo + los propios atributos
  public Bicicleta(String marca, String modelo, int velocidadeMaxima, int numeroMarchas, boolean tenSuspension) {
    super(marca, modelo, velocidadeMaxima);
    this.numeroMarchas = numeroMarchas;
    this.tenSuspension = tenSuspension;
  }

  // redefinimos el metodo acelerar
  @Override
  public void acelerar(int intensidade) {

    System.out.println("La velocidad de la bicicleta esta aumentando en " + intensidade);
  }

  // redefinimos el metodo frear
  @Override
  public void frear(int intensidade) {
    System.out.println("La velocidad de la bicicleta se esta reduciendo en " + intensidade);
  }

  // creamos e metodo pedalear que muestra por pantalla un mensaje
  public void pedalear() {
    System.out.println("A velocidade da bicicleta esta aumentando");
  }

}

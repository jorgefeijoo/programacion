public class Coche extends Vehiculo {

  // constructor de vehiculo
  public Coche(String marca, String modelo, int velocidadeMaxima) {
    super(marca, modelo, velocidadeMaxima);
  }

  // metodo redefinido de acelerar
  @Override
  public void acelerar(int intensidade) {
    System.out.println("El coche esta acelerando con una intensidad de: " + intensidade);
  }

  // metodo redefinido de frear
  @Override
  public void frear(int intensidade) {
    System.out.println("El coche esta frenando con una intensidad de: " + intensidade);
  }
}

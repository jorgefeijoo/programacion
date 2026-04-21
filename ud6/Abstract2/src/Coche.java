public class Coche extends Vehiculo {

  @Override
  public void acelerar(int intensidade) {
    System.out.println("El coche esta acelerando con una intensidad de: " + intensidade);
  }

  @Override
  public void frear(int intensidade) {
    System.out.println("El coche esta frenando con una intensidad de: " + intensidade);
  }
}

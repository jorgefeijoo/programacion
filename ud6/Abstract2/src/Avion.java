public class Avion extends Vehiculo {

  private int numeroMotores;

  public int getNumeroMotores() {
    return numeroMotores;
  }

  public void setNumeroMotores(int numeroMotores) {
    this.numeroMotores = numeroMotores;
  }

  // constructor con los atributos de la clase madre + los de la propia clase
  public Avion(String marca, String modelo, int velocidadeMaxima, int numeroMotores) {
    super(marca, modelo, velocidadeMaxima);
    this.numeroMotores = numeroMotores;

  }

  // redefinimos el metodo acelerar
  @Override
  public void acelerar(int intensidade) {
    System.out.println("El avion esta acelerando con una intensidade de " + intensidade);
  }

  // redefinimos el metodo frear
  @Override
  public void frear(int intensidade) {
    System.out.println("El avion esta frenando con una intensidade de " + intensidade);

  }

  // creamos el metodo voar
  public void voar() {
    System.out.println("La velocidad del avion esta aumentando");
  }

}

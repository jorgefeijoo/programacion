class Circulo extends ObxectoGrafico {
  private int radio;

  public Circulo(int x, int y, int radio) {
    super(x, y); // chamamos ao constructor da supercl
    this.radio = radio;
  }

  // Implementación do método abstracto
  @Override
  public void debuxar() {

  }
}
public class Cadrado extends Figura {

  private double lado;

  public Cadrado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public Cadrado(double area, String cor, double lado) {
    super(area, cor);
    this.lado = lado;
  }

  // metodo calcular area donde se crea una variable donde se calcula el area y le
  // pasa el valor al setter

  @Override
  public double calcularArea() {
    double area = this.lado * this.lado;

    setArea(area);

    return area;
  }

}

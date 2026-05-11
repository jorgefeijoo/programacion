public class Circulo extends Figura {

  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public Circulo(double area, String cor, double radio) {
    super(area, cor);
    this.radio = radio;
  }

  // metodo calcular area donde se crea una variable donde se calcula el area y le
  // pasa el valor al setter

  @Override
  public double calcularArea() {

    double area = Math.PI * (this.radio * this.radio);

    setArea(area);

    return area;
  }

}

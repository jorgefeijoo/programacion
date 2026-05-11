public class Triangulo extends Figura {

  private double base;
  private double altura;

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public Triangulo(double area, String cor, double base, double altura) {
    super(area, cor);
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  // metodo calcular area donde se crea una variable donde se calcula el area y le
  // pasa el valor al setter
  @Override
  public double calcularArea() {

    double area = (this.base * this.altura) / 2;

    setArea(area);

    return area;

  }

}

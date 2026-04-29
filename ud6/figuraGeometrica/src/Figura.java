public abstract class Figura implements Comparable {
  private double area;
  private String cor;

  public Figura(double area, String cor) {
    this.area = area;
    this.cor = cor;
  }

  public Figura() {

  }

  public double getArea() {
    return area;
  }

  public void setArea(double nuevaArea) {
    this.area = nuevaArea;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  // creamos el metodo abstracto calcular area
  public abstract double calcularArea();

  // redefinimos el metodo compare to que extiende de la interfaz Comparable para
  // poder ordenar el array
  @Override
  public int compareTo(Object o) {

    Figura auxiliar = (Figura) o;
    if (this.area < auxiliar.area) {
      return -1;
    }

    if (this.area > auxiliar.area) {
      return 1;
    }

    return 0;

  }

  // redefinimos el metodo to String para poder imprimir el array de figuras
  @Override
  public String toString() {
    return "el area de la figura " + getClass() + " es: " + area + " y su color es : " + cor;
  }

}

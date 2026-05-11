public class circulo {
  /* Atributo */
  private double radio;

  /* Construtor */
  public circulo(double radio) {
    if (radio > 0) {
      this.radio = radio;
    }
  }

  /* Métodos */
  public double área() {
    return Math.PI * Math.pow(radio, 2);
  }

  public double lonxitude() {
    return 2 * Math.PI * radio;
  }

  public void agrandar(double proporcion) {
    radio = radio * proporcion;
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    if (radio > 0) {
      this.radio = radio;
    }
  }

}

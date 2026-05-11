public class Cor {
  // creacion dos atrib
  private double red;
  private double green;
  private double blue;

  // creamos o metodo amosar Informacion para mostrar os valores
  public void amosarInformacion() {
    System.out.println("Red: " + getRed() + " Green: " + getGreen() + " Blue: " + getBlue());
  }

  // creamos o metodo gris para calcular la media de los 3 colores
  public void gris() {
    double RGB = (red + green + blue) / 3;
    red = RGB;
    green = RGB;
    blue = RGB;
  }

  // creamos o metodo filtro e creamos as varibles para introducir los valores
  // tambien creamos la condcion para que solo se pueda meter solo numero entre 0
  // e 1 aparte de multiplicar o filtro polo valor de red
  public boolean filtro(double filtror, double filtrog, double filtrob) {
    if (filtror >= 0 && filtror <= 1 && filtrog >= 0 && filtrog <= 1 && filtrob >= 0 && filtrob <= 1) {
      red = filtror * red;
      green = filtrog * green;
      blue = filtrob * blue;
      return true;

    } else {
      return false;
    }

  }

  // creamos o constructor por defecto
  public Cor() {

  }

  // creamos o constructor
  public Cor(double red, double green, double blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;

    if (red < 0) {
      red = 0;
      this.red = red;
    } else if (red > 1) {
      red = 1;
      this.red = red;
    } else {
      this.red = red;
    }
    if (blue < 0) {
      blue = 0;
      this.blue = blue;
    } else if (blue > 1) {
      blue = 1;
      this.blue = blue;
    } else {
      this.blue = blue;
    }
    if (green < 0) {
      blue = 0;
      this.green = green;
    } else if (green > 1) {
      green = 1;
      this.green = green;
    } else {
      this.green = green;
    }

  }

  // creamos os setters e os getters
  public void setRed(double red) {
    this.red = red;
    if (red < 0) {

      this.red = 0;
    } else if (red > 1) {

      this.red = 1;
    } else {
      this.red = red;
    }
  }

  public void setGreen(double green) {
    this.green = green;
    if (green < 0) {

      this.green = 0;
    } else if (green > 1) {

      this.green = 1;
    } else {
      this.green = green;
    }
  }

  public void setBlue(double blue) {
    this.blue = blue;
    if (blue < 0) {

      this.blue = 0;
    } else if (blue > 1) {

      this.blue = 1;
    } else {
      this.blue = blue;
    }
  }

  public double getRed() {
    return red;
  }

  public double getGreen() {
    return green;
  }

  public double getBlue() {
    return blue;
  }

}
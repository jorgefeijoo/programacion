package autobus;

public class Autobus {
  private String matricula;
  private String marca;
  private String combustible;
  private int potencia;

  public void mantener() {
    System.out.println("Hay que mantelo para que funcione");
  }

  public void arreglar() {
    System.out.println("Estropeouse unha peza hay que arreglarla");
  }

  public void limpiar() {
    System.out.println("Hay que limpialo para que non se queixen");
  }

  Autobus() {
  }

  public Autobus(String matricula, String marca) {
    this.matricula = matricula;
    this.marca = marca;
    this.combustible = "diesel";
    this.potencia = 123;
  }

  public Autobus(String matricula, String marca, String combustible, int potencia) {
    this.matricula = matricula;
    this.marca = marca;
    this.combustible = combustible;
    this.potencia = potencia;
  }

  public void setMatricula(String matricula) throws MatriculaInvalidaException  {
    if (matricula.length() == 0) {
      throw new MatriculaInvalidaException(matricula);
    }
    this.matricula = matricula;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setCombustible(String combustible) {
    this.combustible = combustible;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getMarca() {
    return marca;
  }

  public String getCombustible() {
    return combustible;
  }

  public int getPotencia() {
    return potencia;
  }
}

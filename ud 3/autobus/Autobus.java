package autobus;

public class Autobus {
  public String matricula;
  public String marca;
  public String combustible;
  public int potencia;

  public void mantener() {
    System.out.println("Hay que mantelo para que funcione");
  }

  public void arreglar() {
    System.out.println("Estropeouse unha peza hay que arreglarla");
  }

  public void limpiar() {
    System.out.println("Hay que limpialo para que non se queixen");
  }
}

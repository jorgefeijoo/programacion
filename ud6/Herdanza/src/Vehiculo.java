public class Vehiculo {
  private String marca;
  private int anoFabricacion;

  public Vehiculo(String marca, int anoFabricacion) {
    this.marca = marca;
    this.anoFabricacion = anoFabricacion;
  }

  public Vehiculo() {

  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAnoFabricacion() {
    return anoFabricacion;
  }

  public void setAnoFabricacion(int anoFabricacion) {
    this.anoFabricacion = anoFabricacion;
  }

  // metodo para mostrar la informacion del vehiculo
  public void mostrarInfo() {
    System.out.println("La marca del coche es: " + getMarca() + " el ano de fabricacion es: " + getAnoFabricacion());
  }

}

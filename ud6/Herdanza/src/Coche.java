public class Coche extends Vehiculo {

  private int numeroPortas;

  public int getNumeroPortas() {
    return numeroPortas;
  }

  public void setNumeroPortas(int numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

  public Coche(String marca, int anoFabricacion, int numeroPortas) {
    super(marca, anoFabricacion);
    this.numeroPortas = numeroPortas;
  }

  public Coche() {

  }

  // metodo para mostrar la informacion del coche + vehiculo
  public void mostrarCoche() {
    System.out.println("La marca del coche es: " + getMarca() + " el ano de fabricacion es: " + getAnoFabricacion()
        + " o numero de portas do coche son : " + getNumeroPortas());
  }

}

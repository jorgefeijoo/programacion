public class ProductoConxelado extends Producto {
  private int temperaturaConxelacionRecomendada;

  public ProductoConxelado() {

  }

  // metodo que hereda de producto
  public ProductoConxelado(String dataCaducidade, int numeroLote, int temperaturaConxelacionRecomendada) {
    super(dataCaducidade, numeroLote);
    this.temperaturaConxelacionRecomendada = temperaturaConxelacionRecomendada;
  }

  public int getTemperaturaConxelacionRecomendada() {
    return temperaturaConxelacionRecomendada;
  }

  public void setTemperaturaConxelacionRecomendada(int temperaturaConxelacionRecomendada) {
    this.temperaturaConxelacionRecomendada = temperaturaConxelacionRecomendada;
  }

  // Redefinimos el metodo mostrarInfo
  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("La temperatura de conxelacion recomendada es: " + temperaturaConxelacionRecomendada);
  }

}

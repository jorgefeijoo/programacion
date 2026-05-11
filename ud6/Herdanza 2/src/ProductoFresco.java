public class ProductoFresco extends Producto {
  private String dataEnvasado;
  private String paisOrixe;

  public ProductoFresco() {

  }

  // Constructor que hereda de Producto
  public ProductoFresco(String dataCaducidade, int numeroLote, String dataEnvasado, String paisOrixe) {
    super(dataCaducidade, numeroLote);
    this.dataEnvasado = dataEnvasado;
    this.paisOrixe = paisOrixe;
  }

  public String getDataEnvasado() {
    return dataEnvasado;
  }

  public void setDataEnvasado(String dataEnvasado) {
    this.dataEnvasado = dataEnvasado;
  }

  public String getPaisOrixe() {
    return paisOrixe;
  }

  public void setPaisOrixe(String paisOrixe) {
    this.paisOrixe = paisOrixe;
  }

  // Redefinimos el metodo mostrarInfo
  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("La data de envasado es : " + getDataEnvasado() + " el pais de orixe es: " + getPaisOrixe());
  }
}


public class Producto {
  private String dataCaducidade;
  private int numeroLote;

  public Producto() {
  }

  public Producto(String dataCaducidade, int numeroLote) {
    this.dataCaducidade = dataCaducidade;
    this.numeroLote = numeroLote;
  }

  public String getDataCaducidade() {
    return dataCaducidade;
  }

  public void setDataCaducidade(String dataCaducidade) {
    this.dataCaducidade = dataCaducidade;
  }

  public int getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(int numeroLote) {
    this.numeroLote = numeroLote;
  }

  // creamos o producto mostrarInfo
  public void mostrarInfo() {
    System.out
        .println("La caducidade del producto es: " + getDataCaducidade() + " El numero de lote es: " + getNumeroLote());
  }
}

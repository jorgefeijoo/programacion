public class ProductoRefrixerado extends Producto {
  private int CodigoOrganismoSupervision;

  public ProductoRefrixerado() {

  }

  // constructor que hereda de Producto
  public ProductoRefrixerado(String dataCaducidade, int numeroLote, int codigoOrganismoSupervision) {
    super(dataCaducidade, numeroLote);
    CodigoOrganismoSupervision = codigoOrganismoSupervision;
  }

  public int getCodigoOrganismoSupervision() {
    return CodigoOrganismoSupervision;
  }

  public void setCodigoOrganismoSupervision(int codigoOrganismoSupervision) {
    CodigoOrganismoSupervision = codigoOrganismoSupervision;
  }

  // Redefinimos el metodo mostrarInfo
  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("El codigo del organismo de supervision del producto es: " + getCodigoOrganismoSupervision());
  }

}

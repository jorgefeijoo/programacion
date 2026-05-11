public class GosendoExcepcion extends Exception {
  private String mensaje;

  public GosendoExcepcion(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

}

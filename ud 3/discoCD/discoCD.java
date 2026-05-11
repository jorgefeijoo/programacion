public class discoCD {
  private String artista;
  private String duracion;
  private int canciones;

  public void escuchar() {
    System.out.println("Estoy escuchandolo");
  }

  public void cuidar() {
    System.out.println("Hay que cuidarlo para que non se rompa");
  }

  public void limpiar() {
    System.out.println("Hay que limpiarlo para que no coja polvo");
  }

  discoCD() {

  }

  public discoCD(String artista, String duracion, int canciones) {
    this.artista = artista;
    this.duracion = duracion;
    this.canciones = canciones;
  }

  public void setArtista(String artista) {
    this.artista = artista;

  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public void setCanciones(int canciones) {
    this.canciones = canciones;
  }

  public String getArtista() {
    return artista;
  }

  public String getDuracion() {
    return duracion;
  }

  public int getCanciones() {
    return canciones;
  }
}
public class Ascensor {
  private int piso;// creacion de los atributos
  private int limite;
  public String Situacion;

  // creacion de los metodos
  public void Subir(int pisos) {
    if (piso > limite) {
      System.out.println("Non hai mais pisos");
    } else {
      piso = piso + pisos;
    }
  }

  public void Bajar(int npisos) {
    if (piso > limite) {

    } else {
      piso = piso - npisos;
    }
  }

  public void Situacion() {
    System.out.println(piso);
  }

  // creacion do constructor por defecto
  public Ascensor() {
  }

  public Ascensor(int piso, int limite) {
    this.piso = piso;
    this.limite = limite;
  }

  // creacion dos metodos set e get porque os atributos son privados
  public void setPiso(int piso) {
    this.piso = piso;

  }

  public void setLimite(int limite) {
    this.limite = limite;
  }

  public int getPiso() {
    return piso;
  }

  public int getLimite() {
    return limite;
  }
}

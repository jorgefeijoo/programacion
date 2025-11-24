public class Ascensor {
  private int piso;// creacion de los atributos
  private int limite;
  public String Situacion;

  // creacion de los metodos
  public void Subir(int pisos) {
    if (piso + pisos > limite) {
      System.out.println("Non se pode subir " + pisos + " pisos");
      piso = limite;
    } else {
      piso = piso + pisos;// creamos la operacion para que suba de pisos
    }

  }

  public void Bajar(int npisos) {
    if (piso - npisos < 0) { System.out.println("Non se pode baixar " + npisos + " pisos");
     
      piso = 0;
    } else {
      piso = piso - npisos;// creamos la operacion para que baje de pisos
    }

  }

  public void Situacion() {

    if (piso < 0 || piso > limite) {/*
                                     * creamos la condicion para que si se pasa para arriba o para abajo se muestre
                                     * este mensaje si no que se muestre el siguiente mensaje
                                     */

      System.out.println("");
    } else {
      System.out.println("O piso no que estas é " + piso);// si no se enseñara el piso en el que estas
    }
  }

  // creacion do constructor por defecto
  public Ascensor() {
  }

  // creacion del constructor
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

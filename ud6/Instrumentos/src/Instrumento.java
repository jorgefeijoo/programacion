public abstract class Instrumento {
  private String nome;
  private String familia;

  public Instrumento(String nome, String familia) {
    this.nome = nome;
    this.familia = familia;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFamilia() {
    return familia;
  }

  public void setFamilia(String familia) {
    this.familia = familia;
  }

  // metodo tocar que se redefine despues
  public abstract void tocar();

  // metodo mostrar datos
  public void mostrarDatos() {
    System.out.println("O nome do instrumento es : " + nome + " ,la familia del instrumento es : " + familia);
  }

}

public class Froita {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Froita(String nome) {
    this.nome = nome;
  }

  public Froita() {
  }

  public void mostrarInfo() {
    System.out.println("Esta e unha froita chamada: " + getNome());
  }

  public final void comer() {
    System.out.println("Estas comendo froita");
  }
}

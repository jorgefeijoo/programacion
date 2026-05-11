package ejercicio13;

public class Estudante {
  private String nome;
  private int idade;
  private int notaFinal;

  public Estudante(String nome, int idade, int notaFinal) {
    this.nome = nome;
    this.idade = idade;
    this.notaFinal = notaFinal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getNotaFinal() {
    return notaFinal;
  }

  public void setNotaFinal(int notaFinal) {
    this.notaFinal = notaFinal;
  }

  public void mostrarInfo() {
    System.out.println("Nome: " + getNome() + " idade: " + getIdade() + " nota final: " + getNotaFinal());
  }
}

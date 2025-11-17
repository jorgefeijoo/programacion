public class Persoa {
  /* Atributos da clase */
  private String nome;
  private String dataNacemento;
  private double peso; // peso en kg
  private int altura; // altura en cm

  /* Métodos da clase */
  public void durmir() {
    System.out.println("Vou durmir");
  }

  public void comer() {
    System.out.println("Teño fame, vou comer");
  }

  public void camiñar() {
    System.out.println("Estou camiñando");
  }

  /* Constructor por defecto */
  public Persoa() {

  }

  public Persoa(String nome, String dataNacemento, double peso, int altura) {
    /* Inicialización de atributos */
    this.nome = nome;
    this.dataNacemento = dataNacemento;
    this.peso = peso;
    this.altura = altura;
  }

  /* Métodos da clase */

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public int getAltura() {
    return altura;
  }
}

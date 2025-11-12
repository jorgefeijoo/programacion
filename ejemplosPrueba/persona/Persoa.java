public class Persoa {
  /* Atributos da clase */
  public String nome;
  public String dataNacemento;
  public double peso; // peso en kg
  public int altura; // altura en cm

  /* Métodos da clase */
  public void durmir() {
    System.out.println("Vou durmir");
  }

  public void comer() {
    System.out.println("Teño fame, vou comer");
  }

  public void camiñar() {
    System.out.println("Estou camiñando");
/*Constructor por defecto */
    public Persoa(){

    }

 public Persoa(String nome, String dataNacemento, double peso, int
altura) {
/* Inicialización de atributos */
 this.nome = nome;
 this.dataNacemento = dataNacemento;
 this.peso = peso;
 this.altura = altura;
 }

 /*Métodos da clase*/

}
}

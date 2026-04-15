public class Producto {
  private String nome;
  private double precio;
  private int cantidade;

  @Override
  public String toString() {
    return "nome= " + nome + ", precio= " + precio + ", cantidade= " + cantidade;
  }

  public Producto(String nome, double precio, int cantidade) {
    this.nome = nome;
    this.precio = precio;
    this.cantidade = cantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidade() {
    return cantidade;
  }

  public void setCantidade(int cantidade) {
    this.cantidade = cantidade;
  }

}

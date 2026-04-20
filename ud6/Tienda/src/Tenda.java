import java.util.ArrayList;

public class Tenda {
  private String nome;

  @Override
  public String toString() {
    return nome;
  }

  private ArrayList<Producto> p1;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Tenda(String nome) {
    this.nome = nome;
    this.p1 = new ArrayList<>();
  }

  // metodo para engadir productos
  public void engadirProductos(Producto p) {
    p1.add(p);
  }

  // metodo para calcular el stock total de la tienda
  public double calcularStock() {
    double suma = 0;
    for (Producto p : p1) {
      double stock = p.getCantidade() * p.getPrecio();
      suma += stock;
    }
    return suma;

  }

  // metodo para mostrar la lista
  public void mostrarListaxe() {
    for (Producto p : p1) {
      System.out.println(p);// 👌
    }
  }

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Receta {

  private String nomeReceta;

  @Override
  public String toString() {
    return nomeReceta;
  }

  public Receta(String nomeReceta) {
    this.nomeReceta = nomeReceta;
  }

  public String getNomeReceta() {
    return nomeReceta;
  }

  public void setNomeReceta(String nomeReceta) {
    this.nomeReceta = nomeReceta;
  }

  public static void main(String[] args) {

    ArrayList<Ingredientes> r1 = new ArrayList<>();

    Receta receta1 = new Receta("Huevos rotos con Jamon\n");

    System.out.println("El nombre de la receta es: " + receta1);

    Ingredientes i1 = new Ingredientes(3, "patatas", "medianas");

    r1.add(i1);
    r1.add(new Ingredientes(3, "huevos", "medianos"));
    r1.add(new Ingredientes(100, "jamon serrano", "gramos"));
    r1.add(new Ingredientes(4, "aceite de oliva", "cucharadas"));
    r1.add(new Ingredientes(1, "sal", "cucharada"));

    imprimirListaxe(r1);
  }

  public static void imprimirListaxe(List<Ingredientes> r1) {
    Iterator<Ingredientes> it = r1.iterator();
    while (it.hasNext()) {
      Ingredientes auxiliar = (Ingredientes) it.next();
      System.out.println(auxiliar);
    }

  }

}

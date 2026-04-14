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

    // creamos la lista

    ArrayList<Ingredientes> r1 = new ArrayList<>();

// creamos un objeto para darle el nombre a la receta
    Receta receta1 = new Receta("Huevos rotos con Jamon\n");

    System.out.println("El nombre de la receta es: " + receta1);

    System.out.println("\nLos ingredientes son: ");

    //añado los ingredientes a la lista

    Ingredientes i1 = new Ingredientes(3, "patatas", "medianas");

    r1.add(i1);
    r1.add(new Ingredientes(3, "huevos", "medianos"));
    r1.add(new Ingredientes(100, "jamon serrano", "gramos"));
    r1.add(new Ingredientes(4, "aceite de oliva", "cucharadas"));
    r1.add(new Ingredientes(1, "sal", "cucharada"));
// imprimo la lista usando el metodo
    imprimirListaxe(r1);

    System.out.println("\nPara preparar esta Receta deberas seguir estos pasos:");
// creo el obejto de instrucciones para poder usar el metodo que cree dentro de ella
    Instruccion ins1 = new Instruccion();
    
    ins1.imprimirInstrucciones();

  }

  // metodo para imprimir la lista
  public static void imprimirListaxe(List<Ingredientes> r1) {
    Iterator<Ingredientes> it = r1.iterator();
    while (it.hasNext()) {
      Ingredientes auxiliar = (Ingredientes) it.next();
      System.out.println(auxiliar);
    }

  }

}

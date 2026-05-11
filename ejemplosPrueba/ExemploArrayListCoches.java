
import java.util.ArrayList;
import java.util.Iterator;

import polimorfismo.Coche;

// Clase Coche
class Coche {
  private String marca;
  private String modelo;

  // Constructor
  public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  // Método para mostrar os datos do coche
  public void mostrarInfo() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo);
  }
}

// Clase principal
public class ExemploArrayListCoches {
  public static void main(String[] args) {

    ArrayList<Coche> listaCoches = new ArrayList<>();
    // Engadir obxectos Coche ao ArrayList
    listaCoches.add(new Coche("Toyota", "Corolla"));
    listaCoches.add(new Coche("Ford", "Focus"));
    listaCoches.add(new Coche("Volkswagen", "Golf"));
    // Usar un Iterator para percorrer a lista
    Iterator<Coche> iterador = listaCoches.iterator();
    while (iterador.hasNext()) {
      Coche c = iterador.next();
      c.mostrarInfo();
    }
  }
}

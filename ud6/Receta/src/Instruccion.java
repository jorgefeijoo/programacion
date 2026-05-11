
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instruccion {

  public Instruccion() {
  }

  private int paso;
  private String descripcion;
  ArrayList<Instruccion> instrucciones = new ArrayList<>();

  public Instruccion(int paso, String descripcion) {
    this.paso = paso;
    this.descripcion = descripcion;
    this.instrucciones = new ArrayList<>();
  }

  public int getPaso() {
    return paso;
  }

  public void setPaso(int paso) {
    this.paso = paso;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "paso: " + paso + " descripcion: " + descripcion;
  }

  public static void imprimirInstrucciones() {

    // creo la lista y le añado los elementos
    ArrayList<Instruccion> instrucciones = new ArrayList<>();
    instrucciones.add(new Instruccion(1, "Pelar las patatas y cortarlas"));
    instrucciones.add(new Instruccion(2, "Freir las patatatas"));
    instrucciones.add(new Instruccion(3, "Freir los huevos"));
    instrucciones.add(new Instruccion(4, "Montar la base con las patatas "));
    instrucciones.add(new Instruccion(5, "Añadir los huevos y el jamon encima"));
    // imprimo la lista usando le metodo
    imprimirListaxe(instrucciones);
  }

  // metodo para imprimir la lista
  public static void imprimirListaxe(List<Instruccion> instrucciones) {
    Iterator<Instruccion> it = instrucciones.iterator();
    while (it.hasNext()) {
      Instruccion auxiliar = it.next();
      System.out.println(auxiliar);
    }

  }

}

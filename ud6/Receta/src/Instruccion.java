
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instruccion {
  public static void imprimirInstrucciones(){

    // creo la lista y le añado los elementos
        ArrayList<String> instrucciones= new ArrayList<>();
        instrucciones.add("Pelar las patatas y cortarlas");
        instrucciones.add("Freir las patatatas");
        instrucciones.add("Freir los huevos");
        instrucciones.add("Montar la base con las patatas ");
        instrucciones.add("Añadir los huevos y el jamon encima");
// imprimo la lista usando le metodo
        imprimirListaxe(instrucciones);
  }
// metodo para imprimir la lista
  public static void imprimirListaxe(List<String> instrucciones) {
    Iterator<String> it = instrucciones.iterator();
    while (it.hasNext()) {
      String auxiliar = it.next();
      System.out.println(auxiliar);
    }

  }
    
}

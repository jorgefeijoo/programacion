import java.util.HashSet;

public class AppPelicula {
  public static void main(String[] args) {
    HashSet<Pelicula> set = new HashSet<>();
    HashSet<Pelicula> set1 = new HashSet<>();

    // creamos los objetos de las peliculas
    Pelicula p1 = new Pelicula("Las aventuras de Eli por Ribeira", 2000);
    Pelicula p2 = new Pelicula("Spiderman", 2010);
    Pelicula p3 = new Pelicula("Anxito y gosendo", 2026);

    Pelicula p4 = new Pelicula("Avatar", 2011);
    Pelicula p5 = new Pelicula("El padrino", 1972);
    // metemos las peliculas en el primer conjunto
    set.add(p1);
    set.add(p2);
    set.add(p3);

    set1.add(p4);
    set1.add(p5);
    set1.add(p3);
    // creamos otro conjunto para poner uno dentro de otro
    HashSet<Pelicula> union = new HashSet<>(set);
    // metemos los conjuntos en uno aparte
    union.addAll(set1);

    System.out.println(union);

    HashSet<Pelicula> interseccion = new HashSet<>(set);
    interseccion.retainAll(set1);

    System.out.println("\n" + interseccion);

    HashSet<Pelicula> diferencia = new HashSet<>(set);
    diferencia.removeAll(set1);

    System.out.println("\n" + diferencia);

    HashSet<Pelicula> diferencia1 = new HashSet<>(set1);
    diferencia.removeAll(set);

    System.out.println("\n" + diferencia1);

  }
}

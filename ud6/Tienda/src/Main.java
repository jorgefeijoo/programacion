public class Main {
  public static void main(String[] args) {
    // creo el objeto de la tienda
    Tenda t1 = new Tenda("------La tienda de Gosendo------");

    // engado los productos a la lista usando el metodo creado para engadir
    // productos
    t1.engadirProductos(new Producto("cadelo", 100.00, 1));
    t1.engadirProductos(new Producto("Pacrama", 1000, 1));
    t1.engadirProductos(new Producto("huevos de avestruz", 67, 7));
    t1.engadirProductos(new Producto("copito", 9999, 1));

    System.out.println(t1 + "\n");

    // mostro la lista con el metodo que cree para mostrar la lista
    t1.mostrarListaxe();

    System.out.println("\nEl resultado total del stock de la tienda es: " + t1.calcularStock());

  }
}

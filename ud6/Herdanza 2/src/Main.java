
public class Main {
  public static void main(String[] args) {
    // creamos los objetos y le damos valores
    Producto p1 = new Producto("19/12/2026", 67);
    ProductoFresco pf1 = new ProductoFresco("19/12/2026", 69, "17/12/2026", "Kazahistan");
    ProductoRefrixerado pr1 = new ProductoRefrixerado("19/12/2026", 13, 67);
    ProductoConxelado pc1 = new ProductoConxelado("19/12/2007", 25, -10);

    // usamos los metodos mostrarInfo
    System.out.println("Mostramos el metodo de Producto:\n ");
    p1.mostrarInfo();
    System.out.println("-------------------------------");
    System.out.println("Mostramos el metodo de ProductoFresco:\n ");
    pf1.mostrarInfo();
    System.out.println("-------------------------------");
    System.out.println("Mostramos el metodo de ProductoRefrixerado:\n ");
    pr1.mostrarInfo();
    System.out.println("-------------------------------");
    System.out.println("Mostramos el metodo de ProductoConxelado:\n ");
    pc1.mostrarInfo();
  }
}

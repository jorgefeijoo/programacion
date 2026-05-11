public class Main {
  public static void main(String[] args) {
    // creamos un objeto coche e damoslle valores
    Coche c1 = new Coche();

    c1.setMarca("BMW");
    c1.setAnoFabricacion(2018);
    c1.setNumeroPortas(4);

    c1.mostrarCoche();
    System.out.println("-----------------------------------");
    c1.mostrarInfo();
  }
}

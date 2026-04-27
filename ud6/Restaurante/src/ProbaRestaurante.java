public class ProbaRestaurante {
  public static void main(String[] args) {
    // instancio los objetos
    Pizzeria p1 = new Pizzeria();
    Hamburgueseria h1 = new Hamburgueseria();
    Kebab k1 = new Kebab();

    System.out.println("Metodos de Pizerria \n");
    p1.prepararPedido("Margarita Grande 👌");
    System.out.println("El precio del pedido es: " + p1.calcularPrezo("Margarita Grande "));

    System.out.println("------------------------");

    System.out.println("Metodos de Hamburgueseria");
    h1.calcularPrezo("doble queixo");
    System.out.println("El precio del pedido es: " + h1.calcularPrezo("doble queixo gosendo"));

    System.out.println("-------------------------");

    System.out.println("Metodos de Kebab");
    k1.prepararPedido("Kebab extra Carne");
    System.out.println("El precio del pedido es: " + k1.calcularPrezo("Kebab extra Carne"));
  }
}

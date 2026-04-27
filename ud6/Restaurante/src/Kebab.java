public class Kebab implements Restaurante {
  // redefino el metodo para Kebab

  @Override
  public void prepararPedido(String pedido) {
    System.out.println("El pedido " + pedido + " esta siendo preparado por Hamza");

  }

  // redefino el metodo calcular precio para calcular el precio del pedido
  @Override
  public double calcularPrezo(String pedido) {

    double precioBase = 5.00;
    double precioExtra = 1;

    // si contiene la palabra
    if (pedido.toLowerCase().contains("extra")) {

      precioBase = precioBase + precioExtra;
    }

    return precioBase;
  }

}

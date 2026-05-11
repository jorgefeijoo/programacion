public class Pizzeria implements Restaurante {

  // redefino el metodo para Pizzeria
  @Override
  public void prepararPedido(String pedido) {
    System.out.println("El pedido " + pedido + " esta siendo preparado en la pizzeria");
  }

  // redefino el metodo para calcular el precio
  @Override
  public double calcularPrezo(String pedido) {
    double precioBase = 7.00;
    double precioExtra = 2;
    double precioGrande = 5;

    // si contiene extra se le añade el suplemento
    if (pedido.toLowerCase().contains("extra")) {
      precioBase = precioBase + precioExtra;
    }

    if (pedido.toLowerCase().contains("grande")) {
      precioBase = precioBase + precioGrande;
    }

    return precioBase;
  }

}

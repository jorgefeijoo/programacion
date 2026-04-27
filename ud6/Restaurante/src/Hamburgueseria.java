public class Hamburgueseria implements Restaurante {

  // redefino el metodo para Hamburgueseria

  @Override
  public void prepararPedido(String pedido) {
    System.out.println("El pedido " + pedido + " esta siendo preparado en la Hambuergueseria");

  }

  // redifino el metodo calcular precio para calcular el precio de las
  // hamburguesas
  @Override
  public double calcularPrezo(String pedido) {

    double precioBase = 5;
    double precioExtra = 1.50;
    double precioQueixo = 2;

    // si contiene la palabra doble se le añade el suplemento
    if (pedido.toLowerCase().contains("doble")) {

      precioBase = precioBase + precioExtra;
    }

    // si tiene queso tambien se le añade suplemento
    if (pedido.toLowerCase().contains("queixo")) {

      precioBase = precioBase + precioQueixo;
    }

    return precioBase;
  }
}

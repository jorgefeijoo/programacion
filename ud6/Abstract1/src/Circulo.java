public class Circulo extends Forma {
  // creamos el atributo radio
  public double radio;

  @Override
  public void calcularArea() {

    // damoslle o valor ao radio e calculamos o area
    radio = 4.2;

    double area = Math.PI * (radio * radio);

    System.out.println("El area del circulo es: " + area);
  }

}

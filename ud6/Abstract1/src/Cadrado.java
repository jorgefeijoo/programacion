public class Cadrado extends Forma {
  // creamos el atributo lado
  public double lado;

  @Override
  // redefinimos el metodo calcular area donde le damos valor al atributo
  // calculamos e imprimimos
  public void calcularArea() {
    lado = 6.7;

    double area = lado * lado;

    System.out.println("El area del cuadrado es: " + area);
  }

}

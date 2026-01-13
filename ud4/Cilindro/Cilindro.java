package Cilindro;

public class Cilindro {

  // creamos los atributos privados
  private static double radio;
  private static double altura;

  // creamos os setters e getter
  public static double getRadio() {
    return radio;
  }

  public static void setRadio(double radio) {
    Cilindro.radio = radio;
  }

  public static double getAltura() {
    return altura;
  }

  public static void setAltura(double altura) {
    Cilindro.altura = altura;
  }

  // creamos o metodo area para hacer el calculo del area
  public void area() {
    double area = 2 * Math.PI * getRadio() * (getRadio() + getAltura());
    System.out.println("El resultado del area es: " + area);
  }

  // creamos o metodo volumen para hacer el calculo del volumen
  public void volumen() {
    double volumen = Math.PI * (getRadio() * getRadio()) * getAltura();
    System.out.println("El resultado del volumen es: " + volumen);
  }

  // volvemos a crear los metodos pero con el static
  public static void area(double radio, double altura) {
    double area = 2 * Math.PI * radio * (radio + altura);
    System.out.println("El resultado del area es: " + area);
  }

  public static void volumen(double radio, double altura) {
    double volumen = Math.PI * (radio * radio) * altura;
    System.out.println("El resultado del volumen es: " + volumen);
  }

}

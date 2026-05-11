import java.util.Arrays;

public class AppFigura {
  public static void main(String[] args) {

    // creo un array de objetos y le doy los valores a cada objeto

    Figura[] arrayFiguras = new Figura[9];

    System.out.println("\n-----TRIANGULOS------- \n");

    arrayFiguras[0] = new Triangulo(2.2, 3.6);

    arrayFiguras[0].setCor("verde");

    arrayFiguras[0].calcularArea();

    System.out.println(
        "El area del primer triangulo es: " + arrayFiguras[0].getArea() + " y su color es " + arrayFiguras[0].getCor());

    arrayFiguras[1] = new Triangulo(2.4, 2.6);

    arrayFiguras[1].setCor("azul");

    arrayFiguras[1].calcularArea();

    System.out.println("El area del segundo triangulo es: " + arrayFiguras[1].getArea() + " y su color es "
        + arrayFiguras[1].getCor());

    arrayFiguras[2] = new Triangulo(3.2, 4.6);

    arrayFiguras[2].setCor("amarillo");

    arrayFiguras[2].calcularArea();

    System.out.println(
        "El area del tercer triangulo es: " + arrayFiguras[2].getArea() + " y su color es " + arrayFiguras[2].getCor());

    System.out.println("\n-----CUADRADOS------- \n");

    arrayFiguras[3] = new Cadrado(3);

    arrayFiguras[3].setCor("rojo");

    arrayFiguras[3].calcularArea();

    System.out.println(
        "El area del primer cuadrado es: " + arrayFiguras[3].getArea() + " y su color es " + arrayFiguras[3].getCor());

    arrayFiguras[4] = new Cadrado(2);

    arrayFiguras[4].setCor("rosa");

    arrayFiguras[4].calcularArea();

    System.out.println(
        "El area del segundo cuadrado es: " + arrayFiguras[4].getArea() + " y su color es " + arrayFiguras[4].getCor());

    arrayFiguras[5] = new Cadrado(4);

    arrayFiguras[5].setCor("naranja");

    arrayFiguras[5].calcularArea();

    System.out.println(
        "El area del tercer cuadrado es: " + arrayFiguras[5].getArea() + " y su color es " + arrayFiguras[5].getCor());

    System.out.println("\n-----CIRCULOS------- \n");

    arrayFiguras[6] = new Circulo(3.4);

    arrayFiguras[6].setCor("violeta");

    arrayFiguras[6].calcularArea();

    System.out.println(
        "El area del primer circulo es: " + arrayFiguras[6].getArea() + " y su color es " + arrayFiguras[6].getCor());

    arrayFiguras[7] = new Circulo(3.7);

    arrayFiguras[7].setCor("lila");

    arrayFiguras[7].calcularArea();

    System.out.println(
        "El area del segundo circulo es: " + arrayFiguras[7].getArea() + " y su color es " + arrayFiguras[7].getCor());

    arrayFiguras[8] = new Circulo(2.6);

    arrayFiguras[8].setCor("granate");

    arrayFiguras[8].calcularArea();

    System.out.println(
        "El area del primer tercer es: " + arrayFiguras[8].getArea() + " y su color es " + arrayFiguras[8].getCor());

    // ordeno el array utilizando el compareTo por areas
    Arrays.sort(arrayFiguras);

    System.out.println("----------------------------------");
    System.out.println("\nArray ordenado por areas: \n");

    // bucle para imprimir el array ordenado por areas
    for (Figura figura : arrayFiguras) {
      System.out.println(figura);
    }

  }
}

package Calculadora;

public class Calculadora {

  // creamos o metodo sumar para realizar la operacion de la suma
  public static void sumar(int a, int b) {

    int sumar = a + b;
    System.out.println("la suma de " + a + "+" + b + " es: " + sumar);
  }

  // creamos o metodo restar para realizar la operacion de la resta
  public static void restar(int a, int b) {

    int restar = a - b;
    System.out.println("la resta de " + a + " - " + b + " es: " + restar);
  }

  // creamos o metodo multiplicar para realizar la operacion de la multiplicacion
  public static void multiplicar(int a, int b) {

    int multiplicar = a * b;
    System.out.println("la multiplicacion de " + a + " * " + b + " es: " + multiplicar);

  }

  // creamos o metodo dividir para realizar la operacion de la division
  public static void dividir(int a, int b) {

    // creamos la condicion para que no se pueda introducir un 0 en el segundo
    // numero

    if (b == 0) {
      System.out.println("Non se pode dividir entre 0");
    } else {
      int dividir = a / b;
      System.out.println("La division de " + a + "/" + b + " es: " + dividir);
    }

  }

}

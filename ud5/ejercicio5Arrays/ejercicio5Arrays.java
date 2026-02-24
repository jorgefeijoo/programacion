package ejercicio5Arrays;

public class ejercicio5Arrays {

  public static void desplazarIzquierda(int[] numeros) {
    int auxiliar = numeros[0];
    int i = 0;

    for (i = 0; i < numeros.length - 1; i++) {
      numeros[i] = numeros[i + 1];

    }
    numeros[numeros.length - 1] = auxiliar;

    for (i = 0; i < numeros.length; i++) {
      System.out.println("el valor del array en la posicion: " + i + " es: " + numeros[i]);
    }

  }

  public static void main(String[] args) {
    int[] numeros = { 1, 3, 5, 7, 9, 11, 13, 15 };
    ejercicio5Arrays.desplazarIzquierda(numeros);

  }
}

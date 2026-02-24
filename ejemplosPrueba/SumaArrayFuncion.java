public class SumaArrayFuncion {

  // Función que recibe un array e devolve a súa suma
  public static int sumarElementos(int[] array) {
    int suma = 0;
    for (int n : array) {
      suma += n;
    }
    return suma;
  }

  public static void main(String[] args) {
    int[] numeros = { 2, 4, 6, 8, 10 };
    int resultado = sumarElementos(numeros);
    System.out.println("A suma dos elementos é: " + resultado);
  }
}

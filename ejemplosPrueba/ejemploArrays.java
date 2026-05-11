public class ejemploArrays {
  public static void main(String[] args) {

    // Creación e inicialización do array notas
    double[] notas = { 2.4, 5.6, 7.8, 9.0, 3.4, 2.0 };
    // Recorrido incremental do array
    for (double valor : notas) {
      // Accédese a cada elemento do array e imprímese
      System.out.print(valor + " ");

    }
    System.out.println();
    System.out.println("Numero de notas: " + notas.length);

  }
}

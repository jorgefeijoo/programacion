public class arrayUnidimensional {
  public static void main(String[] args) {
    // creamos o array
    int[] numeros = { 1, 2, 3, 4, 5 };
    int i = 0;
    int suma = 0;
    // bucle para recorrer el array y metemos la suma para hacer la suma de los
    // valores
    for (i = 0; i < numeros.length; i++) {
      System.out.println("Valor en la posicion " + i + " = " + numeros[i]);
      suma = suma + numeros[i];
    }

    System.out.print("la suma de los numeros es: " + suma);

  }
}

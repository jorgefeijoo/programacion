public class EjemploContinue {

  public static void main(String[] args) {
    // Declaración de variables
    int contador;
    System.out.println("Imprimindo os números pares do 1 ao 10...");
    // Procesamento e saída de información
    for (contador = 1; contador <= 10; contador++) {
      if (contador % 2 != 0)
        continue;
      System.out.print(contador + " ");
    }
    System.out.println("\nFin do programa");
    /*
     * As iteracións do bucle que xeren a impresión de cada un
     * dos números pares serán aquelas nas que o resultado de
     * calcular o resto da división entre 2 de cada valor da variable
     * contador sexa igual a 0.
     */
  }
}

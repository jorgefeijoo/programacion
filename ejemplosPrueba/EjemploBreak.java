public class EjemploBreak {
  public static void main(String[] args) {
    // Declaración de variables
    int contador;
    // Procesamento e saída de información
    for (contador = 1; contador <= 10; contador++) {
      // if (contador == 7)
      // break;
      System.out.println("Valor: " + contador);
    }
    System.out.println("Fin do programa");
    /*
     * O bucle só se executará en 6 ocasións, xa que cando
     * a variable contador sexa igual a 7 atoparase un break que
     * romperá o fluxo do bucle, transferíndonos á sentenza que
     * imprime a mensaxe de fin do programa.
     */
  }
}

public class PruebaRetorno {

  public static int sumar(int a, int b) {
    return a + b;
  }

  public static void saudar() {
    System.out.println("Ola mundo!");
  }

  public static void main(String[] args) {
    System.out.println("Empeza o main");
    int resultado = sumar(5, 3); // Chamada a un método con retorno
    System.out.println("O resultado da suma é " + resultado);
    saudar();
    System.out.println("remata o main");
  }
}

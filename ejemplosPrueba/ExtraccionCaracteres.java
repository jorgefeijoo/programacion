public class ExtraccionCaracteres {
  public static void main(String[] args) {

    String texto = " Ola mundo ";
    System.out.println("'" + texto.trim() + "'"); // 'Ola mundo'
    System.out.println(texto.trim().substring(4)); // "mundo"
    System.out.println(texto.trim().substring(0, 3)); // "Ola"

  }
}

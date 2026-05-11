package anxoPacrama;

import bailaComoPuede.bailaComoPuede;

public class Principal2 {
  public static void main(String[] args) {

    bailaComoPuede bcp = new bailaComoPuede();

    // el 1 y el dos no deja porque el primero es privado y el segundo es a nivel de
    // paquetes por lo que al estar fuera del paquete no deja
    System.out.println(bcp.atributo3);

    bcp.metodo3();

  }
}

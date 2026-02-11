package bailaComoPuede;

public class Principal {
  public static void main(String[] args) {
    bailaComoPuede bcp = new bailaComoPuede();

    // el atributo uno no deja acceder porque es privado
    // System.out.println(atributo1);
    // no deja acceder al atributo2
    System.out.println(bcp.atributo2);
    // el atributo 3 si que deja
    System.out.println(bcp.atributo3);

    // el 1 no se puede porque es privado
    bcp.metodo2();
    bcp.metodo3();

  }
}

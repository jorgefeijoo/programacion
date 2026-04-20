public class Main {
  public static void main(String[] args) {
    Empregado e1 = new Empregado("Gosendo");
    Directivos d1 = new Directivos("FOGASA");
    Operarios op1 = new Operarios("Anso");
    Oficiais o1 = new Oficiais("Pacrama");
    Tecnicos t1 = new Tecnicos("MariGosenda");

    System.out.println(e1.toString());
    System.out.println("--------------------------");
    System.out.println(d1.toString());
    System.out.println("--------------------------");
    System.out.println(op1.toString());
    System.out.println("--------------------------");
    System.out.println(o1.toString());
    System.out.println("--------------------------");
    System.out.println(t1.toString());

  }
}

public class DemoGosendoExcepcion {
  public static void main(String[] args) {
    try {
      throw new GosendoExcepcion("Gosendo");
    } catch (GosendoExcepcion e) {
      System.out.println(e.getMensaje());
    }
  }
}

package autobus;

public class appAutobus {
  public static void main(String[] args) {
    Autobus autobus = new Autobus();
    autobus.setMatricula("1111 ABC");
    autobus.setMarca("Paraninfo");
    autobus.setCombustible("gasolina");
    autobus.setPotencia(125);
    System.out.println("A matricula do autobus es : " + autobus.getMatricula());
    System.out.println("A marca do autobus es: " + autobus.getMarca());
    System.out.println("O tipo de combustible do autobus es: " + autobus.getCombustible());
    System.out.println("O autobus ten: " + autobus.getPotencia() + " cv");

    autobus.mantener();
    autobus.arreglar();
    autobus.limpiar();

    Autobus autobus2 = new Autobus("2222 DEF", "Mercedes", "diesel", 200);
    System.out.println("A matricula do autobus es : " + autobus2.getMatricula());
    System.out.println("A marca do autobus es: " + autobus2.getMarca());
    System.out.println("O tipo de combustible do autobus es: " + autobus2.getCombustible());
    System.out.println("O autobus ten: " + autobus2.getPotencia() + " cv");

  }
}

package autobus;

public class appAutobus {
  public static void main(String[] args) {
    Autobus autobus = new Autobus();
    autobus.matricula = "1111 ABC";
    autobus.marca = "Paraninfo";
    autobus.combustible = "gasolina";
    autobus.potencia = 125;
    System.out.println("A matricula do autobus es : " + autobus.matricula);
    System.out.println("A marca do autobus es: " + autobus.marca);
    System.out.println("O tipo de combustible do autobus es: " + autobus.combustible);
    System.out.println("O autobus ten: " + autobus.potencia + " cv");

    autobus.mantener();
    autobus.arreglar();
    autobus.limpiar();
  }
}

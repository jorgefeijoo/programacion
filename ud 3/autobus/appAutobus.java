package autobus;

import java.util.Scanner;

public class appAutobus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Autobus autobus = new Autobus();
    System.out.println(autobus);
    System.out.print("Introduce la matrícula: ");
    String temp_matricula = scanner.nextLine();
    try {
      autobus.setMatricula(temp_matricula);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      try {
        autobus.setMatricula("Desconocida");
      } catch (Exception ex) {
        System.out.println("Error desconocido fijando matricula");
        return;
      }
    }
    autobus.setMarca("Paraninfo");
    autobus.setCombustible("gasolina");
    autobus.setPotencia(125);
    System.out.println("A matricula do autobus es : " + autobus.getMatricula());
    System.out.println("A marca do autobus es: " + autobus.getMarca().contains("in"));
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

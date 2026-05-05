package Excepcion1;

public class Excepcion1 {
  public static void main(String[] args) {
    try {
      throw new Exception("Prueba capturar excepcion");
    } catch (Exception e) {
      System.out.println("Se produjo una excepcion : " + e.getMessage());
    } finally {
      System.out.println("Mensaje del finally que se imprimira siempre");
    }
  }
}

package aplicacion;

import matematicas.Operacions;

public class Principal {
  public static void main(String[] args) {
    Operacions op = new Operacions();
    System.out.println("El resultado de la suma es: " + op.sumar(33, 34));
    System.out.println("El resultado de la resta es: " + op.restar(100, 33));
    System.out.println("El resultado de la multiplicacion es: " + op.multiplicar(5, 5));
    System.out.println("El resultado de la division es: " + op.dividir(10, 5));
    try {
      System.out.println(op.dividir(10, 0));

    } catch (Exception e) {
      System.err.println("No se puede dividir entre 0");
    }
  }
}

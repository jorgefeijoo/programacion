package Empregado;

public class Empregado {
  // creamos os atributos privados
  private String nome;
  private int antiguedad;
  private static double salarioBase = 900;

  // creacion dos metodos setters y getters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(int antiguedad) {
    this.antiguedad = antiguedad;
  }

  public static double getSalarioBase() {
    return salarioBase;
  }

  public static void setSalarioBase(double salarioBase) {
    Empregado.salarioBase = salarioBase;
  }

  // creamos o metodo porcentajeSalario para hacer la cuenta del porcentaje para
  // subirle al salario
  public static void porcentajeSalario(double porcentaje) {
    salarioBase = salarioBase + (porcentaje * getSalarioBase()) / 100;

    System.out.println("El salario con el " + porcentaje + " % " + "subido es: " + salarioBase);
  }

  // creamos el metodo salarioAntiguedade para multiplicar la antiguedad *10 que
  // le sube el salario y se lo sumas al salario
  public double salarioAntiguedade() {
    double salarioAntiguedade = getAntiguedad() * 10;
    double subidaSalario = getSalarioBase() + salarioAntiguedade;
    return subidaSalario;
  }

}

package Empregado;

public class appEmpregado {
  public static void main(String[] args) {
    // le damos el valor al porcentaje con la clase ya que es un metodo estatico
    System.out.println("El salario base de los empleados es: " + Empregado.getSalarioBase());
    Empregado.porcentajeSalario(35.00);
    System.out.println("El salario base de los empleados es: " + Empregado.getSalarioBase());

    // creamos o obxeto damoslle os valores cos setters por ser privado y mostramos
    // o valor
    Empregado e1 = new Empregado();
    e1.setAntiguedad(5);
    e1.setNome("Jose");
    e1.setSalarioBase(900);
    System.out.println("El salario con los años de antiguedad de " + e1.getNome() + " es: " + e1.salarioAntiguedade());
  }

}

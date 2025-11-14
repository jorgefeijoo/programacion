public class Alumno {
  public String nome;
  public String apelidos;
  public String dni;
  public int edad;

  public void estudar() {
    System.out.println("Estou estudando");
  }

  public void comer() {
    System.out.println("Estou comendo na clase");

  }

  public void atender() {
    System.out.println("Estoy atentendendo a clase ");
  }
Alumno(){
  
}
public Alumno(String nome, String apelidos, String dni, int edad){
  this.nome=nome;
  this.apelidos=apelidos;
  this.dni=dni;
  this.edad=edad;
}


}

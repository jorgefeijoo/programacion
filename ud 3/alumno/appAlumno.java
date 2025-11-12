
public class appAlumno {
  public static void main(String[] args) {
    Alumno jorge = new Alumno();
    jorge.nome = "Jorge";
    jorge.apelidos = "Feijoo";
    jorge.dni = "11111111J";
    jorge.edad = 17;
    System.out.println(jorge.nome);
    System.out.println(jorge.apelidos);
    System.out.println(jorge.dni);
    System.out.println(jorge.edad);
    jorge.estudar();
    jorge.comer();
    jorge.atender();

  }
}

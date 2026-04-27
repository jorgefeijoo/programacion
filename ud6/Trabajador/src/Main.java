public class Main {
  public static void main(String[] args) {

    Trabajador t1 = new Trabajador("Sulio");
    System.out.println("El empregado que es jefe y trabajador es: " + t1.getNombre() + "\n");

    System.out.println("Los metodos de Xefe son: \n");
    t1.planificarProxecto();
    t1.darOrdes();
    System.out.println("-------------------");
    System.out.println("Los metodos de Trabajador son: \n");
    t1.informar();
    t1.executarTarefas();
  }
}
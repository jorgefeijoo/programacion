public class Trabajador implements Xefe, Subordinado {

  private String nombre;

  public Trabajador(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void executarTarefas() {
    System.out.println("Deja de ordenarme gosendo");
  }

  @Override
  public void informar() {
    System.out.println("Teño que informar de que eu non lle pejin chaval");
  }

  @Override
  public void darOrdes() {
    System.out.println("Ponte a trabajar vago");
  }

  @Override
  public void planificarProxecto() {
    System.out.println("Planificando el proyecto a mi me lo hace el propio Visual");
  }

}

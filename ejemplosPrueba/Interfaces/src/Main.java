public class Main {
  public static void main(String[] args) {
    Conectable pc = new Ordenador();
    Conectable mobil = new Smartphone();
    pc.conectar();
    mobil.conectar();
    System.out.println("O ordenador está conectado? " +
        pc.estaConectado());
    System.out.println("O smartphone está conectado? " +
        mobil.estaConectado());
    mobil.desconectar();
    pc.desconectar();
  }
}

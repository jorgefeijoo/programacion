public class appascensor {
  public static void main(String[] args) {
    Ascensor ascensor = new Ascensor(0, 4);// creamos o obxeto ascensor
    ascensor.Subir(3);
    ascensor.Bajar(2);
    System.out.println("O piso no que estas e " + ascensor.Situacion);
  }
}

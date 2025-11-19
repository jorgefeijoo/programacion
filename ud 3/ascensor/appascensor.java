public class appascensor {
  public static void main(String[] args) {
    Ascensor ascensor = new Ascensor(0, 10);// creamos o obxeto ascensor
    ascensor.Situacion();
    ascensor.Subir(14);// indicamos o numero de pisos que suben
    ascensor.Situacion();
    ascensor.Bajar(2);// idndicamos o numero de pisos que baixan
    ascensor.Situacion();
  }
}

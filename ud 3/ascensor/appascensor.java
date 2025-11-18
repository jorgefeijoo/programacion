public class appascensor {
  public static void main(String[] args) {
    Ascensor ascensor = new Ascensor(0, 4);// creamos o obxeto ascensor
    ascensor.Subir(3);//indicamos o numero de pisos que suben 
   
    ascensor.Bajar(2);//idndicamos o numero de pisos que baixan
    ascensor.Situacion();
  }
}

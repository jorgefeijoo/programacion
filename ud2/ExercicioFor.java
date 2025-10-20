package ud2;

public class ExercicioFor {
  public static void main(String[] args) {
    int producto = 1;
    int numproduct = 10;// creamos variable para que se pare en 10
    int contador = 0;
    for (int i = 1; i <= numproduct; i++) {// ponemos las condiciones
      if (i % 2 != 0) {
        producto = producto * 1;
        contador = contador + i;
      }
      System.out.println();
    }
  }
}

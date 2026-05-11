import java.util.Arrays;
import java.util.Collections;

public class OrdenacionArrays {
  public static void main(String[] args) {

    String[] nomes = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego",
        "Paula" };
    Arrays.sort(nomes, 0, 6);
    System.out.println("Nomes ordenados ascendentemente:" + Arrays.toString(nomes));
    Arrays.sort(nomes, 0, 4, Collections.reverseOrder());
    System.out.println("Nomes ordenados descendentemente:" + Arrays.toString(nomes));

  }
}

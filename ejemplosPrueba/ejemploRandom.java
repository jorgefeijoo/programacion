import java.util.Random;

public class ejemploRandom {
  public static void main(String[] args) {
    Random numeroAleatorio = new Random();
    for (int i = 0; i < 10; i++) {
      System.out.println(numeroAleatorio.nextInt());

    }
  }
}

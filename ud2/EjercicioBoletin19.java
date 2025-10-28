package ud2;

public class EjercicioBoletin19 {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {// creamos un bucle para que se muestren los numeros del 1 al 10
      if (i == 5)// si llega a 5 que se vuelva a repetir el bucle
        continue;
      if (i == 8)// cuando llegue a 8 para
        break;
      System.out.println(i + "");
    }
  }

}

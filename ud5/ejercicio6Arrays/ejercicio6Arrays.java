package ejercicio6Arrays;

public class ejercicio6Arrays {

  public static void invertirArray(char[] letrillas) {
    int i = 0;
    char auxiliar = ' ';
    int ultimo = letrillas.length - 1;

    for (i = 0; i < letrillas.length / 2; i++) {
      // creamos a auxiliar en letrillas[i] para que se vaya incrementando en cada
      // vuelta
      auxiliar = letrillas[i];
      // intercambiamos la primera por la ultima
      letrillas[i] = letrillas[ultimo];
      // intercambiamos las ultimas ppor las primeras
      letrillas[ultimo] = auxiliar;
      // decrementamos o array dende o final para que vaya intercambiando
      ultimo--;

    }

  }

  public static void main(String[] args) {
    char[] letrillas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
    ejercicio6Arrays.invertirArray(letrillas);

    for (int j = 0; j < letrillas.length; j++) {
      System.out.println("El valor del array en la posicion " + j + " es " + letrillas[j]);
    }

  }
}

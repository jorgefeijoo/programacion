package ud2;

public class ExercicioWhile3 {
  public static void main(String[] args) {
    int i = 1;
    int contador = 0;
    int producto = 1;
    System.out.print("El productode los  10 primeros numeros impares son: ");
    while (contador < 10) {
      producto *= i;
      i += 2;
      contador++;

    }
    System.out.println(producto);
  }
}

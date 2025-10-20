package ud2;

public class EjercicioDoWhileImpares {
  public static void main(String[] args) {
    int contador = 0;// iniciamos a variable contador a 0
    int i = 1;// iniciamos a variable i en 1 porque é o primeiro numero impar
    int producto = 1;// iniciamos o producto
    do {
      producto *= i;// multiplicamos el producto por el primer numero impar
      i += 2;// le sumamos 2 numeros para que sean impares
      contador++;
    } while (contador < 10);// ponemos la condicion donde queremos que pare
    System.out.print("El numero de los 10 primeros numeros impares es: " + producto);
  }
}

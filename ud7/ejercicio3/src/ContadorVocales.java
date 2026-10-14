import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContadorVocales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombreFicheiro = "";
    int dato = 0;
    int contador = 0;

    try {
      // pido el nombre del ficheiro por teclado
      System.out.print("Introduce o nombre do ficheiro que queres leer: ");
      nombreFicheiro = sc.nextLine();

      // creo el fileReader para leer por caracteres
      FileReader fr = new FileReader(nombreFicheiro);

      // creo un bucle para ir recorriendo el fichero
      while (dato != -1) {
        // lee y comprueba si es vocal
        dato = fr.read();
        if (dato == 'a' || dato == 'e' || dato == 'i' || dato == 'o' || dato == 'u') {
          contador++;
        }
      }
      fr.close();
      System.out.println("El numero de vocales en el fichero es de " + contador);
      sc.close();
      // capturamos posibles excepciones
    } catch (FileNotFoundException e) {
      System.out.println("No se encontro el fichero");
    } catch (IOException e) {
      System.out.println("Error de entrada e salida");
    }

  }
}

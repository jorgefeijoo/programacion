import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContadorCaracterLiñas {
  public static void main(String[] args) {
    try {

      Scanner sc = new Scanner(System.in);
      String nombreFicheiro;
      String nombreFicheiro2;
      int dato = 0;
      int contador = 0;
      int numeroCaracteres = 0;

      System.out.print("Introduce el nombre del fichero que quieres leer: ");
      nombreFicheiro = sc.nextLine();

      System.out.print("Introduce el nombre del fichero que quieres crear: ");
      nombreFicheiro2 = sc.nextLine();

      File f1 = new File(nombreFicheiro2);
      BufferedReader br = new BufferedReader(new FileReader(nombreFicheiro));
      PrintWriter pw = new PrintWriter(f1);
      String linea;
      while ((linea = br.readLine()) != null) {
        numeroCaracteres = numeroCaracteres + linea.length();
        contador++;
      }

      pw.println(numeroCaracteres);
      pw.println(contador);

    } catch (FileNotFoundException e) {
      System.out.println("No encontro el fichero");
    } catch (IOException e) {
      System.out.println("Error de entrada y salida");
    }
  }
}

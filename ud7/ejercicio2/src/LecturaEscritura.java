import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LecturaEscritura {
  public static void main(String[] args) {
    try {
      // creo o ficheiro de escritura
      String nomeFicheiro = "";
      String nomeFicheiro2 = "";

      // creamos los scanner para pedir los nombres de los ficheros
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce o nombre de ficheiro que queres crear: ");
      nomeFicheiro = sc.nextLine();
      System.out.print("Introduce o nombre de ficheiro que queres leer: ");
      nomeFicheiro2 = sc.nextLine();

      File f1 = new File(nomeFicheiro);
      // creo el buffered reader para ir leyendo el fichiero
      BufferedReader bf = new BufferedReader(new FileReader(nomeFicheiro2));
      // creo el printWritter
      PrintWriter pw = new PrintWriter(new FileWriter(f1));
      String linea;
      // creo un bucle que vaya leyendo hasta que no tenga nada mas que leer y que
      // vaya escribiendo
      while ((linea = bf.readLine()) != null) {
        pw.println(linea);
      }
      bf.close();
      pw.close();

    } catch (FileNotFoundException e) {
      System.out.println("No se encontro el ficheiro");
    } catch (IOException e) {
      System.out.println("Error de entrada y salida");
    }

  }
}

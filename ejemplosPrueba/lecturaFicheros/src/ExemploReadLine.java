import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExemploReadLine {
  public static void main(String[] args) {
    try {
      File fic = new File("verguica.txt"); // declara ficheiro
      BufferedReader fichero = new BufferedReader(
          new InputStreamReader(new FileInputStream(fic), "UTF-8"));
      String linea;

      while ((linea = fichero.readLine()) != null)
        System.out.println(linea);
      fichero.close();
    } catch (FileNotFoundException fn) {
      System.out.println("No se encuentra el fichero");
    } catch (IOException io) {
      System.out.println("Error de E/S");
    }
  }
}

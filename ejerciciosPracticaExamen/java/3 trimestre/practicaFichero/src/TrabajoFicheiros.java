import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TrabajoFicheiros {
    public static void main(String[] args) {
            String nombreFichero = " ";
        try {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el nombre del nuevo fichero: ");
            nombreFichero=sc.nextLine();
            File f1 = new File(nombreFichero);
            try (BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))) {
                try (PrintWriter pw = new PrintWriter(f1)) {
                    String linea;
                    while ((linea=br.readLine())!=null) {
                        if (linea.toLowerCase().contains("ana")) {
                            pw.println("Enhorabuena Ana por el 8,5");
                        }
                        else if (linea.toLowerCase().contains("luis")) {
                            pw.println("Luis  tienes que ir a la recuperacion");
                        }
                        else if (linea.toLowerCase().contains("marta")) {
                            pw.println("Enhorabuena marta por el 6.0");
                        }else if (linea.toLowerCase().contains("pedro")) {
                            pw.println("Pedro tienes que ir a la recuperacion");
                        }else if (linea.toLowerCase().contains("elena")) {
                            pw.println("Enhorabuena por la mejor nota Helena 9,2");
                        }
                    }
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
           System.out.println("Error no se encontro el fichero");
        } catch (IOException e) {
        System.out.println("Error de entrada y salida");
        }
    }
}

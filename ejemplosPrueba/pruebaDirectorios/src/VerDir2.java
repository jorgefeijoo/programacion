import java.io.*;

public class VerDir2 {
  public static void main(String[] args) {
    String dir = ".";
    File f = new File(dir); // Creamos o File que representa ao directorio
    File[] archivos = f.listFiles(); // Lístase o directorio
    System.out.printf("Ficheros en el directorio actual: %d %n",
        archivos.length);
    for (int i = 0; i < archivos.length; i++) {
      System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f.isFile(),
          f.isDirectory());
    }

    if (f.exists()) {
      System.out.println("Nombre del fichero : " + f.getName());
      System.out.println("Ruta : " + f.getPath());
      System.out.println("Ruta absoluta : " + f.getAbsolutePath());
      System.out.println("Se puede leer : " + f.canRead());
      System.out.println("Se puede escribir : " + f.canWrite());
      System.out.println("Tamaño : " + f.length());
      System.out.println("Es un directorio : " + f.isDirectory());
      System.out.println("Es un fichero : " + f.isFile());
      System.out.println("Nombre del directorio padre: " + f.getParent());
    }
  }
}

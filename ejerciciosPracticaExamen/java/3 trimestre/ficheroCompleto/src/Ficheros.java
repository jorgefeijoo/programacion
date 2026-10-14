
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nombreFichero;
            System.out.print("Introduce el nombre del fichero: ");
            nombreFichero = sc.nextLine();
            File f1 = new File(nombreFichero);
            int menu = 0;
            int contador=0;
            String nombreFichero2 = "";
            String nombreFicheiro3="";

            if (f1.isDirectory()) {
                while (menu != 6) {

                    System.out.println("1. Listar archivos");
                    System.out.println("2. Leer y analizar archivo");
                    System.out.println("3. Crear archivo y sobreescribir");
                    System.out.println("4. Añadir texto a un archivo");
                    System.out.println("5. Generar Informe del directorio");
                    System.out.println("6.Cambiar de directorio de trabajo");
                    System.out.println("7 Salir");
                    menu=sc.nextInt();
                    sc.nextLine();

                    switch (menu) {
                        case 1:
                       String[] ficheiro = f1.list();
                       for (String listarFicheiros : ficheiro) {
                        if (listarFicheiros.endsWith(".txt")) {
                        contador++;
                        }
                       }
                          System.out.println("tamaño en bytes: " + ficheiro.length); 
                       System.out.println("El numero de ficheros con la extension txt es " + contador);
                            break;

                        case 2:
                        System.out.print("Introduce el nombre del fichero que quieres leer: ");
                        nombreFichero2=sc.nextLine();
                            try {
                                BufferedReader br = new BufferedReader(new FileReader(nombreFichero2));
                                String linea;
                                while ((linea=br.readLine())!=null) {
                                    System.out.println(linea);
                                }
                            } catch (FileNotFoundException e) {
                                System.out.println("No se encontro ficheiro");
                            } catch (IOException e) {
                                System.out.println("Error de entrada y salida");
                            }

                            break;

                        case 3:
                            System.out.println("Introduce el nombre del nuevo fichero que quieres escribir");
                            nombreFicheiro3 =sc.nextLine();
                            File f2 = new File(nombreFicheiro3);
                            try {
                                String contido;
                                PrintWriter pw = new PrintWriter(new FileWriter(f2));
                                System.out.print("Introduce lo que quieres introducir en el fichero: ");
                                contido=sc.nextLine();
                                pw.println(contido);
                            } catch (IOException e) {
                              System.out.println("Error de entrada y salida");
                            }
                            break;

                        case 4:
                            String nombreFichero4;
                            String contido;
                            System.out.println("Introduce el nombre del fichero que quieres sobreescribir");
                            nombreFichero4=sc.nextLine();
                            System.out.println("Introduce la siguiente linea: ");
                            contido=sc.nextLine();
                            try {
                                try (PrintWriter pw = new PrintWriter(nombreFichero4)) {
                                    pw.append(contido);
                                }
                            } catch (FileNotFoundException e) {
                              System.out.println("No se encontro fichero");
                            }
                            
                            break;

                        case 5:
                            String nuevaRuta;
                            System.out.println("Introduce la nueva ruta: ");
                            nuevaRuta=sc.nextLine();
                            f1=new File(nuevaRuta);
                            break;

                        case 6:
                            System.out.println("Saliendo del programa...");
                            return;

                        default:
                            break;
                    }
                }
            }
        }
    }

}

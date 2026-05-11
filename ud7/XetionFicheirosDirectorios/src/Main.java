import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directorio = " ";
        int menu = 0;
        String nuevoDirectorio = "";
        String borrarDirectorio = "";
        String ruta = "";

        // pedimos los el directorio que quiere trabajar y creamos uno con ese nombre
        System.out.print("Introduce el directorio del que quieres partir: ");
        directorio= sc.nextLine();
        File f1 = new File(directorio);
       
        // compruebo si el directorio existe y meto el bucle con el menu si existe si no muestra un mensaje de error
        if (f1.isDirectory()) {
             while (menu != 6) {
            System.out.println("---MENU DIRECTORIOS---");
            System.out.println("1.Listar Contenido");
            System.out.println("2.Crear un directorio");
            System.out.println("3.Borrar Directorio");
            System.out.println("4.Renomear Ficheiro");
            System.out.println("5.Introducir nueva ruta ");
            System.out.println("6. Sair");
            System.out.print("La opcion que estas introduciendo es: ");
            menu = sc.nextInt();

             switch (menu) {
                case 1:
                    // creo un array de ficheros para listar los ficheros
                    String[] ficheiros = f1.list();
                    //bucle para imprimir los ficheros
                    for (String ficheirillos : ficheiros) {
                        System.out.println(ficheirillos);
                        System.out.println("O tamaño do ficheiro " + ficheirillos + " es " + ficheirillos.length());
                    }
                    System.out.println("El numero de ficheros del directorio es : " + ficheiros.length);
                    break;

                case 2:
                    // pido nuevo nombre del directorio 
                    System.out.println("Introduce el nombre del nuevo directorio");
                    sc.nextLine();
                    directorio = sc.nextLine();
                    // creo directorio con el nuevo nombre 
                    File f2 = new File(directorio);
                    f2.mkdir();
                    // miro si existe y muestro un mensaje
                    boolean creado = f2.exists();
                    if (creado) {
                        System.out.println("El directorio " + f2 + " fue creado correctamente");
                    } else {
                        System.out.println("No se pudo crear el directorio");
                    }

                    break;

                case 3:

                // pido si se desea borrar el directorio si es si lo borro y muestro mensaje
                    System.out.print("Deseas Borrar el directorio (S/N): ");
                    sc.nextLine();
                    borrarDirectorio= sc.nextLine();
                    if (borrarDirectorio.equals("S")) {
                        if ( f1.delete()) {
                            System.out.println("Carpeta borrada con exito");
                        }else{
                            System.out.println("No se borro la carpeta");
                        }
                        
                    }else{
                        System.out.println("No se puede borrar el directorio: ");
                    }

                    break;
    
                case 4:
                    // pido nombre del nuevo directorio y lo renombro
                    System.out.print("Introduce el nombre del nuevo directorio: ");
                    sc.nextLine();
                    nuevoDirectorio = sc.nextLine();
                    f1.renameTo(new File(nuevoDirectorio));

                    break;

                case 5:
                    //pido la ruta y la cambio 
                    System.out.print("Introduce una nueva ruta: ");
                    sc.nextLine();
                    ruta = sc.nextLine();
                    f1 = new File(ruta);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    break;
            }
        }
        }else{
            System.out.println("No existe el directorio");
        }

       

           
        }

    }



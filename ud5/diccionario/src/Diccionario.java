import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int menu = 0;
    int nTermos = 0;
    String termoGallego = " ";
    String terminoCastellano = " ";
    String buscarTermino = " ";
    String inicioPalabra = " ";
    String traduccion = " ";

    // creamos el mapa
    HashMap<String, String> diccionario = new HashMap<>();

    // creamos un menu que se repita mientras no se muestre la opcion de salir
    while (menu < 5) {
      System.out.println("1. Engadir un nuevo termo");
      System.out.println("2. Buscar un termo de forma exacta");
      System.out.println("3. Buscar termos que comecen por un texto");
      System.out.println("4.Modificar un termo");
      System.out.println("5. Salir");
      System.out.print("La opcion que estas introduciendo es: ");
      menu = sc.nextInt();
      sc.nextLine();

      switch (menu) {
        // engadir nuevos terminos
        case 1:
          // pedimos la cantidad de terminos que se quiere añadir
          System.out.print("Introduce cuantos terminos quieres añadir en el diccionario: ");
          nTermos = sc.nextInt();
          sc.nextLine();
          // pedimos el termino en castellano y en gallego el numero de veces que puso
          // arriba y lo añadimos
          for (int i = 0; i < nTermos; i++) {
            System.out.print("Introduce el termino en gallego: ");
            termoGallego = sc.nextLine();
            System.out.print("Introduce el termino en castellano: ");
            terminoCastellano = sc.nextLine();
            diccionario.put(termoGallego, terminoCastellano);
          }

          break;
        // pido por teclado el termino que quiere buscar y lo busca en el diccionario
        case 2:
          System.out.print("Introduce el termino que quieres buscar: ");
          buscarTermino = sc.nextLine();
          // si lo encuentra lo imprime si no pues muestra un mensaje de error
          if (diccionario.containsKey(buscarTermino)) {
            System.out.println(termoGallego + ": " + terminoCastellano);
          } else {
            System.out.println("No existe ese termino en el diccionario");
          }

          break;
        // pedimos que introduzca el inicio de la palabra
        case 3:
          System.out.print("Buscar palabra: ");
          inicioPalabra = sc.nextLine();
          // si empieza por esa palabra lo imprime si no muestra mensaje de que no existe
          if (termoGallego.startsWith(inicioPalabra)) {
            System.out.println(termoGallego + ": " + terminoCastellano);
          } else {
            System.out.println("Ningun valor comienza por esa coindidencia");
          }

          break;
        // Pedimos que introduzca el termino que quiere modificar
        case 4:
          System.out.print("Introduce el termino que quieres cambiar: ");
          terminoCastellano = sc.nextLine();
          // si existe que lo traduzca
          if (diccionario.containsKey(termoGallego)) {
            System.out.print("Introduce la traduccion de la palabra: ");
            traduccion = sc.nextLine();
            diccionario.put(terminoCastellano, traduccion);
            System.out.println(diccionario);
            // si no decimos que no existe
          } else {
            System.out.println("No existe ese termino en el diccionario");
          }

          break;
        case 5:
          System.out.println("Cerrando el menu...");
          return;

        default:
          System.out.println("Prueba numeros entre 1 y 5");
          break;

      }
    }

  }
}

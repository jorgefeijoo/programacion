
import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = -1;
        int menu = 0;
        // si el numero introducido no esta entre 0 y 20 que lo vuelva a pedir
        // me pedia tambien que lanzara una excepcion para que solo se pudieran meter numeros pero aun no se lanzar excepciones personalizadas
        while (numeroIntroducido < 0 || numeroIntroducido > 20) {
            System.out.print("introduce la cantidad de codigos que quieres procesar entre 1 y 20: ");
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido == 0) {
                System.out.println("Cerrando sistema...");
               return;
            }
        }

        // creo el menu que se repita todo el rato salvo que se pulse la opcion 5
        while (menu != 5) {

            System.out.println("--- MENU DE PROCESAMIENTO ---");
            System.out.println("1. Comrpobar fortaleza");
            System.out.println("2. Formatear códigos");
            System.out.println("3. Censurar códigos");
            System.out.println("4. Análisis de vocales");
            System.out.println("5. Salir");
            System.out.print("Selecciona la opcion que quieres: ");

            menu = sc.nextInt();
            sc.nextLine();// no entiendo porque puse esta linea para que me lo pida 1 vez me lo dijo chatGPT porque si no me lo pedia dos veces de primeras

            // aqui creo la condicion de si pulsas el 5 porque cree despues un bucle para no tener que andar copiando codigo para cada caso para pedir la cadena
            if (menu == 5) {
                System.out.println("Saliendo del programa");
                return;
            }
            //bucle para crear la cadena
            for (int i = 0; i < numeroIntroducido; i++) {
                System.out.print("Introduce la contraseña que quieres comprobar: ");
                String cadenaComprobar = sc.nextLine();

                switch (menu) {
                    case 1:
                        Procesador.fortaleza(cadenaComprobar);
                        break;
                    case 2:
                        System.out.println(Procesador.Formatear(cadenaComprobar));

                        break;
                    case 3:

                        System.out.println(Procesador.Censurar(cadenaComprobar));

                        break;
                    case 4:
                        System.out.println("El numero de vocales de la contraseña es: " + Procesador.Vocales(cadenaComprobar));

                        break;

                }

            }

        }
    }

}

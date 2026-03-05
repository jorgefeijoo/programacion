
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Libro libro;
        int menu = 0;
        ArrayList<Libro> listaxe = new ArrayList<>();

        while (menu != 5) {

            System.out.println("Engadir un nuevo libro");
            System.out.println("Borrar o libro que teña algunha asignatura");
            System.out.println("Modificar algun campo dun libro que teña unha signatura determinada");
            System.out.println("Buscar os libros cuxo titulo empece polo texto introducido por usuario");
            System.out.println("Salir");
            System.out.println("La opcion que estas introducindo es: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    listaxe.add(new Libro("Isaac Asimov", "Real academia", "123458901", 2500, "LIT-CER-02", "Minotauro"));
                    break;

                case 2:
                    System.out.print("Introduce la signatura: ");
                    String Signatura = sc.nextLine();
                    Libro.setSignatura()Signatura=;
                    if (listaxe.contains(Signatura)) {


                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    return;

            }
        }

        listaxe.add(new Libro("Miguel de Cervantes", "Real academia", "123456789", 1376, "LIT-CER-01", "Don Quijote"));

    }
}

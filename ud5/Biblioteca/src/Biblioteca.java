
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {

    public static Libro leerLibros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Introduce el autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Introduce el editorial del libro: ");
        String editorial = sc.nextLine();
        System.out.print("Introduce el ISBN del libro: ");
        String ISBN = sc.nextLine();
        System.out.print("Introduce el paxinas del libro: ");
        int paginas = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce la Signatura del libro: ");
        String signatura = sc.nextLine();

        Libro lib1 = new Libro(autor, editorial, ISBN, paginas, signatura, titulo);

        return lib1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<Libro> listaxe = new ArrayList<>();

        
        
        Iterator it = listaxe.iterator();
         listaxe.add(new Libro("Miguel de Cervantes", "Real academia", "123456789", 1376, "LIT-CER-01", "Don Quijote"));
        

        while (menu != 5) {

            System.out.println("\n\n1.Engadir un nuevo libro");
            System.out.println("2. Borrar o libro que teña algunha asignatura");
            System.out.println("3.Modificar algun campo dun libro que teña unha signatura determinada");
            System.out.println("4.Buscar os libros cuxo titulo empece polo texto introducido por usuario");
            System.out.println("5.Salir");
            System.out.print("\nLa opcion que estas introducindo es: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    Libro lib1 = Biblioteca.leerLibros();
                    listaxe.add(lib1);
                    it = listaxe.iterator();
                    while (it.hasNext()) {
                        Libro aux = (Libro) it.next();
                       System.out.println(aux.getTitulo() + " " + aux.getAutor() + " " + aux.getEditorial() + " " + aux.getISBN() + " " + aux.getSignatura()+ " "+ aux.getPaxinas());
                    }
                    break;

                case 2:
                    System.out.print("Introduce la signatura: ");
                    sc.nextLine();
                     String BorrarLibro = sc.nextLine();

                    if (listaxe.contains(BorrarLibro)) {
                        listaxe.remove(6);
                    }
                    while (it.hasNext()) {
                        Libro aux = (Libro) it.next();
                       System.out.println(aux.getTitulo() + " " + aux.getAutor() + " " + aux.getEditorial() + " " + aux.getISBN() + " " + aux.getSignatura()+ " "+ aux.getPaxinas());
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

       

    }
}

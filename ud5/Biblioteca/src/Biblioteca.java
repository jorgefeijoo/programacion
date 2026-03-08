
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
//pide libro por teclado

    public static Libro escanearLibro(Scanner sc) {
        System.out.print("Introduce el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Introduce el autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Introduce el editorial del libro: ");
        String editorial = sc.nextLine();
        System.out.print("Introduce el ISBN del libro: ");
        long ISBN = sc.nextLong();
        sc.nextLine();
        System.out.print("Introduce el paxinas del libro: ");
        int paginas = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce la Signatura del libro: ");
        String signatura = sc.nextLine();

        Libro lib1 = new Libro(autor, editorial, ISBN, paginas, signatura, titulo);

        return lib1;

    }
// imprime la listaxe 

    public static void imprimirListaxe(List<Libro> listaxe) {
        Iterator<Libro> it = listaxe.iterator();
        while (it.hasNext()) {
            Libro aux = (Libro) it.next();
            System.out.println(aux.toString());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;
        //creo la lista de tipo libro
        ArrayList<Libro> listaxe = new ArrayList<>();
        

        while (menu != 5) {

            System.out.println("\n\n1.Engadir un nuevo libro");
            System.out.println("2. Borrar o libro que teña algunha asignatura");
            System.out.println("3.Modificar algun campo dun libro que teña unha signatura determinada");
            System.out.println("4.Buscar os libros cuxo titulo empece polo texto introducido por usuario");
            System.out.println("5.Salir");
            System.out.print("\nLa opcion que estas introducindo es: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: // Engadir un libro
                    // creo variable para pedir los valores del libro por teclado   
                    Libro lib1 = escanearLibro(sc);
                    // añado ese libro a la lista
                    listaxe.add(lib1);

                    imprimirListaxe(listaxe);
                    break;

                case 2://eliminar o libro con una asignatura determinada

                    System.out.print("Introduce a signatura: ");
                    String signaturaABorrar = sc.nextLine();
                    // creo un libro auxiliar que solo tiene la signatura
                    Libro aux = new Libro(signaturaABorrar);
                    // si listaxe contiene un libro con esa signatura
                    if (listaxe.contains(aux)) {
                        listaxe.remove(aux);
                        System.out.println("Libro borrado correctamente");
                    } else {
                        System.out.println("O libro no aparece na listaxe");
                    }
                    imprimirListaxe(listaxe);
                    break;
                case 3:
                    System.out.print("Introduce a signatura: ");
                    String signaturaAModificar = sc.nextLine();
                    // creo un libro con esa signatura
                    Libro libroAuxi = new Libro(signaturaAModificar);
                    // creo la variable con la posicion del libro que tiene la misma signatura
                    int index = listaxe.indexOf(libroAuxi);
                    // si existe un libro con esa signatura
                    if (index != -1) {
// guardamos en la variable libroauxi la referencia al objeto que esta en listaxe en esa posicion
                        libroAuxi = listaxe.get(index);

                        System.out.println("Introduce que quieres cambiar: ");
                        String tipoCambio = sc.nextLine();

// creamos un menu para segun la opcion que del usuario se cambie esa parte del libro
                        switch (tipoCambio.toLowerCase()) {
                            case "titulo":
                                System.out.println("Introduce el valor del elemento que quieres cambiar");
                                String titulo = sc.nextLine();
                                libroAuxi.setTitulo(titulo);

                                break;

                                case "signatura":
                                System.out.println("Introduce el valor del elemento que quieres cambiar");
                                String Signatura = sc.nextLine();
                                libroAuxi.setTitulo(Signatura);

                                break;

                                case "autor":
                                System.out.println("Introduce el valor del elemento que quieres cambiar");
                                String autor = sc.nextLine();
                                libroAuxi.setTitulo(autor);

                                break;

                                case "isbn":
                                System.out.println("Introduce el valor del elemento que quieres cambiar");
                                String isbn = sc.nextLine();
                                libroAuxi.setTitulo(isbn);

                                break;

                                case "paxinas":
                                System.out.println("Introduce el valor del elemento que quieres cambiar");
                                String paxinas = sc.nextLine();
                                libroAuxi.setTitulo(paxinas);

                                break;

                            default:
                                break;
                        }

                    }

                    break;

                case 4:
                    // creo scanner para ver si coincide el titulo que pone    
                    System.out.print("Introduce o titulo: ");
                    String tituloABuscar = sc.nextLine();

                    //creo iterador para recorrer la lista
                    Iterator<Libro> it = listaxe.iterator();
                    // bucle para ver si tiene mas elementos
                    System.out.println("Resultados: ");
                    while (it.hasNext()) {
                        // creo libro aux para coger el elemento del iterador
                        Libro libroAux = it.next();
                        // miro haber si empieza por eso y lo imprimo
                        if (libroAux.getTitulo().startsWith(tituloABuscar)) {
                            System.out.println(libroAux.toString());
                        }
                    }

                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opcion no valida.Vuelva a intentarlo...");

            }
        }
    }
}

/* desenvolver un programa en java que permita xestionar una lista de enteiros usanso array list
 . Devera crear a lista de obxetos do tipo Integer que debe permitir engadir numeros amosar por pantalla o seu contenido e o seu tamaño e se podera eliminar por posicion e valor e mostrala de novo */

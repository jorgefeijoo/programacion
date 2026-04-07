
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* desenvolver un programa en java que permita xestionar una lista de enteiros usanso array list
 . Devera crear a lista de obxetos do tipo Integer que debe permitir engadir numeros amosar por pantalla o seu contenido e o seu tamaño e se podera eliminar por posicion e valor e mostrala de novo */
public class listaEnteros {

    public static void main(String[] args) {
        // creo la lista de tipo integer
        ArrayList<Integer> listaxeNumeros = new ArrayList<>();
        int numeros = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres meter?: ");
        int cantidadNumeros = sc.nextInt();

        // creamos un bucle que de el numero de vueltas que longitud de la lista que decidio introducir el usuario
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduce los numeros con los que quieres rellenar la lista: ");
            numeros = sc.nextInt();
            //añadimos los elementos a la lista
            listaxeNumeros.add(numeros);
        }

        // aqui creamos el iterador que lo que hace es que te muestre los elementos de la lista OJO!! hay que ponerlo despues de rellenar la lista porque si no no nos lo va a imprimir
        Iterator<Integer> it = listaxeNumeros.iterator();

        // creamos bucle para saber si hay algun elemento mas 
        while (it.hasNext()) {
            // creamos una variable con el valor de la lista 
            Integer numeroAux = it.next();
            System.out.print(" " + numeroAux);
        }
        System.out.println("\n La longitud del arrayList es: " + listaxeNumeros.size());

        // pedimos la posicion del numero que queremos borrar
        System.out.print("Introduce la posicion de la que quieres borrar el elemento: ");
        int posicion = sc.nextInt();

        // ponemos esta condicion para que el numero que pide eliminar este dentro del rango que se puede
        if (posicion >= 0 && posicion < listaxeNumeros.size()) {
            listaxeNumeros.remove(posicion);
        }
        System.out.println(listaxeNumeros);

        // pedimos el valor que quiere borrar pero cogemos el dato Integer para que no nos pille despues la posicion si no que pille el valor
        System.out.print("\nIntroduce el valor que quieres borrar: ");
        Integer valorBorrar = sc.nextInt();

//le ponemos una condicion para que si contiene ese valor lo borre si no lo contiene manda el mensaje de error 
        if (listaxeNumeros.contains(valorBorrar)) {
            listaxeNumeros.remove(valorBorrar);
        } else {
            System.out.println("No existe ese valor dentro de la lista");
        }

        

        System.out.println(listaxeNumeros);

    }

}


import java.util.HashSet;

public class Pasaporte {

    public static void main(String[] args) {
        // creamos las litas
        HashSet<Destino> pas1 = new HashSet<>();
        HashSet<Destino> pas2 = new HashSet<>();
// creamos los destinos 
        Destino d1 = new Destino("Roma", "Italia");
        Destino d2 = new Destino("Paris", "Francia");
        Destino d3 = new Destino("Kioto", "Japon");
        Destino d4 = new Destino("Londres", "Reino Unido");
        Destino d5 = new Destino("Nueva York", "EEUU");
        Destino d6 = new Destino("Berlín", "Alemania");
// metemos los destinos en el primer pasaporte
        pas1.add(d1);
        pas1.add(d2);
        pas1.add(d3);
        pas1.add(d4);
// metemos los destinos en el segundo pasaporte
        pas2.add(d3);
        pas2.add(d5);
        pas2.add(d2);
        pas2.add(d6);

        //miramos cuales coinciden y los metemos en un nuevo conjunto
        HashSet<Destino> interseccion = new HashSet<>(pas1);
        interseccion.retainAll(pas2);
        System.out.println("Los destinos que coinciden son: " + interseccion);

        System.out.println("-------------------------------------\n");

        // unimos todos pero sin repetir y los guardamos en un nuevo conjunto
        HashSet<Destino> union = new HashSet<>(pas1);
        union.addAll(pas2);
        System.out.println("Los destinos totales son: " + union);

        System.out.println("-------------------------------------\n");

        // guadamos en un nuevo conjunto los destinos que solo se visitaron con el primer pasaporte
        HashSet<Destino> diferencia1 = new HashSet<>(pas1);
        diferencia1.removeAll(pas2);
        System.out.println("Los destinos que solo se visitaron con el primer pasaporte son: "+ diferencia1);

        System.out.println("-------------------------------------\n");

        // guardamos en un nuevo conjunto los destinos qwue solo se visitaron con el segundo pasaporte
        HashSet<Destino> diferencia2 = new HashSet<>(pas2);
        diferencia2.removeAll(pas1);
        System.out.println("Los destinos que solo se visitaron con el segundo pasaporte son: "+ diferencia2);

    }
}

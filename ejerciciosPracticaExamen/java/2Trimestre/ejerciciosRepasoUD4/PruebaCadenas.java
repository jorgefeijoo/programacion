
import java.util.Scanner;

public class PruebaCadenas {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o texto: ");
        String textoLeido=sc.nextLine();
        System.out.println("Introduce una palabra para insertar en la posicion 3");
        String posicionTres=sc.nextLine();

        StringBuilder sb = new StringBuilder(textoLeido);
        String vocales="aeiouAEIOU";
        System.out.println( "Cadena del reves"+sb.reverse());
        System.out.println(sb.replace(vocales, ''));
        System.out.println(sb.insert(3, posicionTres));

        
    }
}

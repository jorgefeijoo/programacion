
import java.util.Scanner;



public class CambiarTexto {
    public static String CambiarTexto(String texto, String palabra,String reemplazo){
        
        String textoMinusculas=texto.toLowerCase();
        String palabraMinusculas=palabra.toLowerCase();

        String textoCambiado=textoMinusculas.replace(palabraMinusculas, reemplazo);
        
        
        return textoCambiado;
    
}
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o texto: ");
    String texto=sc.nextLine();
    System.out.print("Introduce por la palabra que quieres cambiar: ");
    String palabra=sc.nextLine();
    System.out.print("Introduce la palabra por la que quieres reemplazar: ");
    String reemplazo=sc.nextLine();

    System.out.println("EL texto con la palabra cambiada es: " + CambiarTexto(texto, palabra, reemplazo));



    
}
}

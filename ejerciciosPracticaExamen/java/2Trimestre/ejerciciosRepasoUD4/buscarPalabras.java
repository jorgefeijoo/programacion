import java.util.Scanner;

public class buscarPalabras {
    public static int aparicionsPalabra(String texto, String palabra){
       int coincidencias=0;
       int posicion=0;
       //pasamos el texto a minusculas
       String textoMinusculas=texto.toLowerCase();
       //pasamos la palabra a minusculas
       String palabraMinusculas=palabra.toLowerCase();

       for (int i = 0; i < textoMinusculas.lastIndexOf(palabraMinusculas); i++) {
           if (textoMinusculas.contains(palabraMinusculas)) {
            coincidencias++;
            posicion=textoMinusculas.indexOf(palabraMinusculas,i);
            i=posicion;
           }
       }
      

       return coincidencias;
   
   
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el texto: ");
        String texto = sc.nextLine();
        System.out.print("Introduce la palabra: ");
        String palabra=sc.nextLine();
        System.out.println("El numero de ocorrencias es: "+ buscarPalabras.aparicionsPalabra(texto, palabra));
    }
}

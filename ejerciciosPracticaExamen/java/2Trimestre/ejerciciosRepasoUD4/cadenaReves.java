
import java.util.Scanner;

public class cadenaReves {

    public static String Reves(String cadena) {

        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracteres = cadena.charAt(i);
            cadenaInvertida = cadenaInvertida + caracteres;
        }

        return cadenaInvertida;

    }


    public static String quitarEspazos(String cadena){
        String cadenaNoEspacios=" ";
       for(int i=0;i<cadena.length();i++){
    cadenaNoEspacios= cadena.replace(" ", "");
        
       }
       
        return cadenaNoEspacios;
        
    }

    public static void polindromo(String cadena,String cadenaInvertida){
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("Esta cadena es un polindromo");
        }else{
            System.out.println("Esta cadena no es un polindromo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
         String cadenaInvertida=Reves(cadena);
        System.out.println("Cadena al reves: "+Reves(cadena));
        System.out.println("Cadena sin espacios: " +quitarEspazos(cadena));
        cadenaReves.polindromo(cadena, cadenaInvertida);
    }
}




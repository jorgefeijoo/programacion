import java.util.Scanner;

public class OperacionsCadenas {

   // creamos o metodo para ver que esta del reves
   public static String Reves(String cadena1) {
      // creamos o bucle para que o lea do reves
      String cadenaInvertida = "";
      for (int i = cadena1.length() - 1; i >= 0; i--) {

         cadenaInvertida += cadena1.charAt(i);

      }
      return cadenaInvertida;
   }

   // creamos o metodo para poner la cadena sin espacios
   public static void sinEspazos(String cadena1) {
      // creamos un bucle para contar los caracteres y una condicion donde si un
      // caracter es vacio que lo imprima los caracteres
      for (int i = 0; i < cadena1.length(); i++) {
         if (cadena1.charAt(i) != ' ') {
            System.out.print(cadena1.charAt(i));
         }
      }
   }

   // creamos o metodo para ver que las cadenas no sean iguales del reves que del
   // derecho
   public static boolean palindroma(String cadena1, String cadenaInvertida) {
      if (cadena1.equalsIgnoreCase(cadenaInvertida)) {
         return true;
      } else {
         return false;
      }
   }
}

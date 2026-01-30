package ud4.CadenasExpresionRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadenasExpresionsRegular {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una Expresion Regular: ");
    String ExpresionRegular = sc.nextLine();
    System.out.print("Introduce una cadena: ");
    String cadea =sc.nextLine();
    Pattern pat = Pattern.compile(ExpresionRegular);
    Matcher mat = pat.matcher(cadea);

    
   
    


if (mat.matches()) {
 System.out.println("Válido");
 } else {
 System.out.println("No Válido");
 }

    }
}

package codigosSeguridad;

import java.util.Scanner;

public class codigosSeguridad {

    public static int comprobacionCadenas() {

        Scanner sc = new Scanner(System.in);
        String codigo1=" ";
        String codigo2=" ";
       do {
    System.out.print("Introduce la cadena: ");
    codigo1 = sc.nextLine().trim();
    
    if (codigo1.isBlank()) {
        System.out.println("Error: La cadena no puede estar vacía.");
    }
} while (codigo1.isBlank());

// 2. Pedir y validar la confirmación (solo llega aquí si el código 1 ya es válido)
do {
    System.out.print("Confirmacion de la cadena: ");
    codigo2 = sc.nextLine().trim();
    
    if (codigo2.isBlank()) {
        System.out.println("Error: La confirmacion no puede estar vacía.");
    }
} while (codigo2.isBlank());
        


        if (codigo1.length()!=codigo2.length()) {
            return -1;
        }
        else if(codigo1.equals(codigo2)){
            return 1;
        }else if(codigo1.equalsIgnoreCase(codigo2)&&codigo1.length()<8){
            return 2 ;
        }else if (codigo1.equalsIgnoreCase(codigo2)&&codigo1.length()>8) {
            return 3;
        }else{
            return 0;
        }  

    }
}

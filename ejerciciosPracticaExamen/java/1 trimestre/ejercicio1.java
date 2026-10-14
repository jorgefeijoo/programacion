
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        //2.1 Bucle for: Suma de cuadradosCrea el código en Java que calcule y muestre la suma de los cuadrados de los primeros n números naturales, donde n es un valor introducido por teclado.Ejemplo: Si n=4, el cálculo sería $1^2 + 2^2 + 3^2 + 4^2 = 30$
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        int suma=0;
       
     

        for (int i = 1; i <= numero; i++) {
            int exponente = i * i;
            int resultado = exponente;
            suma+=resultado;// metes na variable suma os resultados suma=resultado+suma
         
        }
         System.out.println("O resultado da suma: "+suma);
    }

}

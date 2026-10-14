
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        //2.2 Bucle while: Invertir númeroEmpleando el bucle while, codificar un programa en Java que pida un número entero positivo y muestre el mismo número con las cifras al revés.Ejemplo: Si el usuario introduce 1234, el programa debe mostrar 4321.(Pista: Usa el operador módulo % 10 para sacar el último dígito y la división / 10 para eliminarlo). 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o numero: ");
        int numeroI = sc.nextInt();
        int resto;
        if (numeroI < 0 || numeroI > 10000) {
            System.out.println("Proba un numero entre 0 e 10000");
        }
        while (numeroI != 0) {
            resto = numeroI % 10;// facemos o modulo para imprimir o resto da division
            numeroI = numeroI / 10;// facemos a division para ir reducindo o numero
            System.out.print(resto);
        }
    }
}

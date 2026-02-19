package arraysPedidosTeclados;

import java.util.Scanner;

public class arrayspedidosTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
       

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();

        }
  

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero introducido en la posicion " + i + " es " + numeros[i]);
        }

        int auxiliar = numeros[0];
        numeros[0]=numeros[9];
        numeros[9]=auxiliar;



        System.out.println("----------------------------------");
      
          for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero introducido en la posicion " + i + " es " + numeros[i]);
        }

    }
}

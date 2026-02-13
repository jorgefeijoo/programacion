package arraysPedidosTeclados;

import java.util.Scanner;

public class arrayspedidosTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroTeclado = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero: ");
            numeroTeclado = sc.nextInt();

        }
        numeros[0] = numeroTeclado;
        numeros[1] = numeroTeclado;
        numeros[2] = numeroTeclado;
        numeros[3] = numeroTeclado;
        numeros[4] = numeroTeclado;
        numeros[5] = numeroTeclado;
        numeros[6] = numeroTeclado;
        numeros[7] = numeroTeclado;
        numeros[8] = numeroTeclado;
        numeros[9] = numeroTeclado;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero introducido en la posicion " + i + " es " + numeros[i]);
        }

    }
}

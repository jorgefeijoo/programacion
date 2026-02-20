package arraysPedidosTeclados;

import java.util.Scanner;

public class arrayspedidosTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //declaramos el array de 10 elementos que este vacio
        int[] numeros = new int[10];
       
//creamos o bucle que pida el numero por teclado 10 veces y lo introducimos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();

        }
  
// bucle para imprimir o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero introducido en la posicion " + i + " es " + numeros[i]);
        }

        //creamos a variable auxiliar para cambiar el orden del primero por el ultimo
        int auxiliar = numeros[0];
        numeros[0]=numeros[9];
        numeros[9]=auxiliar;



        System.out.println("----------------------------------");
      //mostramos o array de nuevo
          for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero introducido en la posicion " + i + " es " + numeros[i]);
        }

    }
}

package ejercicio4Arrays;

import java.util.Scanner;

public class ejercicio4Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] decimal = new double[12];
        int menu = 0;
        int i = 0;

        while (menu != 8) {
            System.out.println("=== MENU DE OPCIONES ===");
            System.out.println("a) Introducir os 12 numeros do array");
            System.out.println("b) Mostrar os 12 numeros");
            System.out.println("c) Se mostrara un 0 en la posicion que elijas");
            System.out.println("d) Se introduce nesa posicion o valor introducido por teclado");
            System.out.println("e) Intercambio dos 2 primeiros valores do array");
            System.out.println("f) Intercambiar el valor 3 por el 4");
            System.out.println("g) Intercambiar los valores de 2 en 2");
            System.out.println("h) Salir");
            System.out.print("La opcion que estas introduciendo es: ");
            menu = sc.nextInt();

            if (menu==8) {
                System.out.println("cerrando el menu ...");
                return;
            }

            switch (menu) {
                case 1:
                     for (i = 0; i < decimal.length; i++) {
                System.out.print("Introduce el valor con el que quieres rellenar el array: ");
                    decimal[i] = sc.nextDouble();
                     }

                    break;
                case 2:
                    for ( i = 0; i < decimal.length; i++) {
                        System.out.println("El valor del array en la posicion " + i+ " es " + decimal[i]);
                    }

                    break;
                case 3:
                    System.out.println("Introduce la posicion que quieres que sea 0: ");
                    int posicion=sc.nextInt();
                    decimal[posicion]=0;



                    break;
                case 4:
                    System.out.println("Introduce la posicion que quieres cambiar ");
                    int posicion2=sc.nextInt();
                    
                     System.out.println("Introduce el numero por el que lo quieres cambiar: ");
                     double numero= sc.nextDouble();
                    

                    decimal[posicion2]=numero;

                    break;
                case 5:
                    double auxiliar=decimal[0];
                    decimal[1]=decimal[0];
                    decimal[0]=auxiliar;


                    break;
                case 6:
                    double auxiliar2=decimal[2];
                    decimal[2]=decimal[3];
                    decimal[3]=auxiliar2;

                    break;
                case 7:

                    break;
                
            }

        }

    }

}

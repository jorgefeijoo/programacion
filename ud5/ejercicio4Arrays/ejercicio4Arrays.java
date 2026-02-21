package ejercicio4Arrays;

import java.util.Scanner;

public class ejercicio4Arrays {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        double[] decimal = new double[12];
        // creamos la variable menu para que se escoga la opcion
        char menu = ' ';
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
            menu = sc.next().toLowerCase().charAt(0);
// ponemos la condicion donde si la opcion que se marca es la h que se muestre el mensaje y acabe el programa
            if (menu=='h') {
                System.out.println("cerrando el menu ...");
                return;
            }
// creamos el switch case para el menu
            switch (menu) {
               // creamos un bucle para que pida los valores del array
                case 'a':
                     for (i = 0; i < decimal.length; i++) {
                System.out.print("Introduce el valor con el que quieres rellenar el array: ");
                    decimal[i] = sc.nextDouble();
                     }

                    break;
                    // creamos el bucle para mostrar los valores del array
                case 'b':
                    for ( i = 0; i < decimal.length; i++) {
                        System.out.println("El valor del array en la posicion " + i+ " es " + decimal[i]);
                    }

                    break;
                    // pedimos por teclado  la posicion que queremos que sea 0 y lo guardamos en la posi del array
                case 'c':
                    System.out.print("Introduce la posicion que quieres que sea 0: ");
                    int posicion=sc.nextInt();
                    decimal[posicion]=0;
                    break;
                    // pedimos la posicion y el numero por el que queremos cambiar el valor y lo guardamos en la posicion
                case 'd':
                    System.out.println("Introduce la posicion que quieres cambiar ");
                    int posicion2=sc.nextInt();
                    
                     System.out.println("Introduce el numero por el que lo quieres cambiar: ");
                     double numero= sc.nextDouble();
                    

                    decimal[posicion2]=numero;

                    break;
                    //creamos la variable auxiliar para guardar el valor de la primera posi y despues se hace el cambio de valor
                case 'e':
                    double auxiliar=decimal[0];
                    decimal[0]=decimal[1];
                    decimal[1]=auxiliar;


                    break;
                    // igual que el anterior pero con el valor 3 y 4
                case 'f':
                    double auxiliar2=decimal[3];
                    decimal[3]=decimal[4];
                    decimal[4]=auxiliar2;

                    break;
                    // igual que los 2 anteriores pero con todos de 2 en 2 para que se vayan intercambiando 
                case 'g':
                     double auxiliar3=decimal[0];
                    decimal[0]=decimal[1];
                    decimal[1]=auxiliar3;
                    
                    double auxiliar4=decimal[2];
                    decimal[2]=decimal[3];
                    decimal[3]=auxiliar4;
                  
                    double auxiliar5=decimal[4];
                    decimal[4]=decimal[5];
                    decimal[5]=auxiliar5;
                    
                    double auxiliar6=decimal[6];
                    decimal[6]=decimal[7];
                    decimal[7]=auxiliar6;

                    double auxiliar7=decimal[8];
                    decimal[8]=decimal[9];
                    decimal[9]=auxiliar7;

                    double auxiliar8=decimal[10];
                    decimal[10]=decimal[11];
                    decimal[11]=auxiliar8;

                    

                    break;
                
            }

        }

    }

}

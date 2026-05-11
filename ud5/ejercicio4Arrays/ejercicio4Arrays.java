package ejercicio4Arrays;

import java.util.Scanner;

public class ejercicio4Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] decimal = new double[12];
        // creamos la variable menu para que se escoga la opcion
        char menu = ' ';
        int i = 0;
        int posicion2 = -1;
        int posicion = -1;
        // todo este menu se repite mientras sea distinto de la opcion h
        while (menu != 'h') {
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
            // ponemos la condicion donde si la opcion que se marca es la h que se muestre
            // el mensaje y acabe el programa
            if (menu == 'h') {
                System.out.println("Cerrando el menu ...");
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
                    for (i = 0; i < decimal.length; i++) {
                        System.out.println("El valor del array en la posicion " + i + " es " + decimal[i]);
                    }

                    break;
                // pedimos por teclado la posicion que queremos que sea 0 y lo guardamos en la
                // posi del array
                case 'c':
                    while (posicion < 0 || posicion > decimal.length) {
                        System.out.print("Introduce la posicion que quieres que sea 0: ");
                        posicion = sc.nextInt();
                        if (posicion < 0 || posicion > decimal.length) {
                            System.out.println("Esa posicion es incorrecta");
                        }
                    }
                    decimal[posicion] = 0;

                    break;
                // pedimos la posicion y el numero por el que queremos cambiar el valor y lo
                // guardamos en la posicion
                case 'd':
                    while (posicion2 < 0 || posicion2 > decimal.length) {
                        System.out.print("Introduce la posicion que quieres cambiar: ");
                        posicion2 = sc.nextInt();
                        if (posicion2 < 0 || posicion2 > decimal.length) {
                            System.out.println("Esa posicion es incorrecta");

                        }
                    }

                    System.out.println("Introduce el numero por el que lo quieres cambiar: ");
                    double numero = sc.nextDouble();

                    decimal[posicion2] = numero;

                    break;
                // creamos la variable auxiliar para guardar el valor de la primera posi y
                // despues se hace el cambio de valor
                case 'e':
                    double auxiliar = decimal[0];
                    decimal[0] = decimal[1];
                    decimal[1] = auxiliar;

                    break;
                // igual que el anterior pero con el valor 3 y 4
                case 'f':
                    double auxiliar2 = decimal[2];
                    decimal[2] = decimal[3];
                    decimal[3] = auxiliar2;

                    break;
                // igual que los 2 anteriores pero con todos de 2 en 2 para que se vayan
                // intercambiando
                case 'g':
                    // creamos un bucle que vaya de 2 en 2 y dentro guardamos el primer numero en
                    // una auxiliar y le decimos que en el primer valor ponga el del el 1 +1 y en el
                    // 1+1 metemos el primer valor
                    for (int j = 0; j < decimal.length; j += 2) {
                        double auxiliar3 = decimal[j];
                        decimal[j] = decimal[j + 1];
                        decimal[j + 1] = auxiliar3;
                    }

                    break;

            }

        }

    }

}


import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        // creamos las variables
        Scanner sc = new Scanner(System.in);
        // declaro las variables
        int valor = 0;
        int menu = 0;
        int numero = 0;
        int cuenta = 0;

        // creo el bucle para comprobar que el numero que que introduzca sea entre 1 y
        // 50 si no que se guarde en la variable valor
        do {
            System.out.print("Introduce de cuantos numeros quieres saber el valor: ");
            valor = sc.nextInt();
        } while (valor < 0 || valor > 50);

        // creamos la condicion donde si el valor es = 0 que se acabe el programa
        if (valor == 0) {
            System.out.println("No se puede introducir este numero. Finalizando...");
            return; // salimos del programa
        }

        // Creamos el bucle para el switch donde si se mete un valor distinto a 5 que se
        // vuelva a preguntar el menu y si es 5 que se acabe
        while (true) {
            System.out.println("1. Indicar cantas letras  hai.");
            System.out.println("2. Indicar cantos dixitos hai.");
            System.out.println("3. Indicar cantos son maiúsculas.");
            System.out.println("4. Transformalo a maiúsculas. ");
            System.out.println("5. Saír");

            System.out.print("Numero del menu: ");
            menu = sc.nextInt();

            if (menu < 1 || menu > 5) {
                continue;
            }
            if (menu == 5) {
                System.out.println("El programa finalizo");
                return;
            }

            cuenta = 0;

            // creo los bucles para que me pida el numero el numero de veces que le puse arriba
            for (int i = 0; i < valor; i++) {
                System.out.print("Introduce un numero: ");
                numero = sc.nextInt();
                // aqui me da el valor unicode 
                char car = (char) numero;
                System.out.println("Valor Unicode " + numero);
                System.out.println("Representacion " + car);
                /*   System.out.println(Character.isLetter(car));
                System.out.println(Character.isDigit(car));
                System.out.println(Character.isUpperCase(car));
                System.out.println(Character.toUpperCase(car));*/
                // creo el switch para el menu que se muestre la opcion escogida

                switch (menu) {
                    case 1 -> {
                        if (Character.isLetter(car)) {
                            cuenta++;
                        }
                    }
                    case 2 -> {
                        if (Character.isDigit(car)) {
                            cuenta++;
                        }
                    }

                    case 3 -> {
                        if (Character.isUpperCase(car)) {
                            cuenta++;
                        }
                    }

                    case 4 -> System.out.println(Character.toUpperCase(car));
                }
            }

            System.out.println("La cuenta es " + cuenta);

        }
    }

}

/*
 * char car = (char) valor;
 * System.out.println("Valor Unicode " + valor);
 * System.out.println("Representacion " + car);
 */

// Character.isLetter(car);

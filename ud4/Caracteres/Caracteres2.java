import java.util.Scanner;

public class Caracteres2 {
     public static void main(String[] args) {
        // creamos las variables
        Scanner sc = new Scanner(System.in);
        // declaro las variables
        int valor = 0;
        int menu = 0;
        int numero = 0;
        int i = 1;
        int cuenta=0;

        // creo el bucle para comprobar que el numero que que introduzca sea entre 1 y
        // 50 si no que se guarde en la variable valor
        do {
            System.out.print("Introduce de cuantos numeros quieres saber el valor: ");
            valor = sc.nextInt();
        } while (valor < 0 || valor > 50);

        // creamos la condicion donde si el valor es = 0 que se acabe el programa
        if (valor == 0) {
            System.out.println("No se puede introducir este numero el programa finalizo");
            // si no que vaya al menu
        } else {
            // Creamos el bucle para el switch donde si se mete un valor distinto a 5 que se
            // vuelva a preguntar el menu y si es 5 que se acabe

            do {
                System.out.println("1. Indicar cantas letras  hai.");
                System.out.println("2. Indicar cantos dixitos hai.");
                System.out.println("3. Indicar cantos son maiúsculas.");
                System.out.println("4. Transformalo a maiúsculas. ");
                System.out.println("5. Saír");

                System.out.print("El numero que estas introduciendo es: ");
                menu = sc.nextInt();
                // creo el switch para el menu que se muestre la opcion escogida
                switch (menu) {
                    case 1:
                        // creo los bucles para que me pida el numero el numero de veces que le puse arriba
                    do {
                            System.out.print("Introduce un numero: ");
                            numero = sc.nextInt();
                            i++;
                           // aqui me da el valor unicode 
                            char car = (char) numero;
                            System.out.println("Valor Unicode " + numero);
                            System.out.println("Representacion " + car);
                            if(Character.isLetter(car)==true){
                                cuenta++;
                            }
                             
                        } while (i <= valor);

                        break;
                    case 2:
                        
                    do {

                            System.out.print("Introduce un numero: ");
                            numero = sc.nextInt();
                            i++;
                            char car = (char) numero;
                            System.out.println("Valor Unicode " + numero);
                            System.out.println("Representacion " + car);
                            if(Character.isDigit(car)==true){
                                cuenta++;
                               
                            }
                        } while (i <= valor);
                        break;

                    case 3:
                        do {

                            System.out.print("Introduce un numero: ");
                            numero = sc.nextInt();
                            i++;
                            char car = (char) numero;
                            System.out.println("Valor Unicode " + numero);
                            System.out.println("Representacion " + car);
                            if(Character.isUpperCase(car)==true){
                                cuenta++;
                                
                            }
                        } while (i <= valor);
                        break;

                    case 4:
                        do {

                            System.out.print("Introduce un numero: ");
                            numero = sc.nextInt();
                            i++;
                            char car = (char) numero;
                            System.out.println("Valor Unicode " + numero);
                            System.out.println("Representacion " + car);
                             System.out.println(Character.toUpperCase(car));
                        } while (i <= valor);
                       
                        break;

                    case 5:
                        System.out.println("El programa finalizo");
                        break;

                   
                }
                System.out.println("La cuenta es: " + cuenta);
                // condicion para que solo abandone si se pulsa el 5
            } while (menu != 5);

           

        }
    }

}


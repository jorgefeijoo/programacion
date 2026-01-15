
import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        //creamos las variables
        Scanner sc = new Scanner(System.in);
        //declaro las variables
        int valor = 0;
        int menu=0;

       
//bucle principal
do{
// creo el bucle para comprobar que el numero que que introduzca sea entre 1 y 50 si no que se guarde en la variable valor
do {
            System.out.print("Introduce el numero del cual quieres saber el valor: ");
            valor = sc.nextInt();
        } while ((valor < 1 || valor > 50)&& valor!=0);
   
        //creamos la condicion donde si el valor es = 0 que se acabe el programa
   if (valor == 0) {
            System.out.println("No se puede introducir este numero porfavor pruebe con otro");
            break;
        }

       
    
    
        //Creamos el bucle para el switch donde si se mete un valor distinto a 5 que se vuelva a preguntar el menu y si es 5 que se acabe
        
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
                    System.out.println("Estas escogiendo el valor 1");
                    break;
                case 2:
                    System.out.println("Estas escogiendo el valor 2");
                    break;

                case 3:
                    System.out.println("Estas escogiendo el valor 3");
                    break;

                case 4:
                    System.out.println("Estas escogiendo el valor 4");
                    break;

                case 5:
                    System.out.println("El programa finalizo");
                    break;

                default:
                    
                    break;
            }
        //condicion para que solo abandone si se pulsa el 5
        } while (menu!=5);
    //NO TENGO NI IDEA 
    }while(valor!=0);
    }


}


import java.util.InputMismatchException;
import java.util.Scanner;

public class menuCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solicitarNumero = -1;
        int menu = 0;
        int numerosUnicode = 0;
        char car = ' ';
         int contadorNumerico=0;
         int contadorEspazos=0;
        while (solicitarNumero < 0 || solicitarNumero > 30) {
            System.out.print("Introduce cantos numeros queres procesar: ");
            solicitarNumero = sc.nextInt();
        }
        if (solicitarNumero == 0) {
            System.out.println("Cerrando programa ...");
            return;
        }
try {
    

        while (menu != 5) {
            System.out.println("=== MENU ===");
            System.out.println("Contar cantos caracteres son letras mayusculas");
            System.out.println("Contar cantos caracteres son dixitos numericos");
            System.out.println("Contar cantos son espazos en branco");
            System.out.println("Convertirlo a mayusculas");
            System.out.print("La opcion que estas introduciendo es: ");
            menu = sc.nextInt();

            if (menu==5) {
                System.out.println("Cerrando programa ...");
                return;
            }
            if (menu<1||menu>4){
                System.out.println("Opcion no valida porfavor introduzca una opcion entre 1 y 4");
                continue;
            }

            for(int i=0;i<solicitarNumero;i++) {
                System.out.print("Introduce o valor en unicode: ");-
                numerosUnicode = sc.nextInt();
                 car =   (char) numerosUnicode; // Converter a carácter
                System.out.println("Valor Unicode " + numerosUnicode);
                System.out.println("Representación " + car);
                 if (numerosUnicode>=0&&numerosUnicode<=31) {
                    System.out.println("Este caracter no es imprimible");
                   
                }
            }

               
                

                switch (menu) {

                    case 1:
                        int contador=0;
                       for(int i=0;i<solicitarNumero;i++){
                        if (Character.isUpperCase(car)) {
                            contador++;
                        }
                    }
                        System.out.println("El numero de caracteres mayusculas es: "+ contador );

                        break;
                    case 2:
                          contadorNumerico=0;
                         for(int i=0;i<solicitarNumero;i++){
                        if (Character.isDigit(car)) {
                            contadorNumerico++;
                        }
                    }
                        System.out.println("El numero de caracteres numericos es : " +contadorNumerico);

                        break;
                    case 3:
                         contadorEspazos=0;
                         for(int i=0;i<solicitarNumero;i++){
                        if (Character.isWhitespace(car)) {
                            contadorEspazos++;
                        }
                    }
                        System.out.println("El numero de espacios en blanco es: "+contadorEspazos);

                        break;
                    case 4:
                        for(int i=0;i<solicitarNumero;i++){
                        char caracterMayusculas=Character.toUpperCase(car);
                        System.out.println("El caracter en mayusculas es: " + caracterMayusculas );
                        }

                        break;
                    

                }
            
            

        }
        } catch (InputMismatchException e) {
    System.out.println("Solo se puede introducir caracteres numericos");
}
    }
}

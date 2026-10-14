/*3. El método main(), varios catch y finally
En el método main(), inicializa una variable entradasTotales con un valor de 10.
Crea un bucle que le pida al usuario por teclado cuántas entradas desea comprar. El programa debe seguir preguntando hasta que la compra se realice correctamente.
Debes capturar y gestionar los siguientes errores mostrando un mensaje descriptivo por pantalla:

Que el usuario introduzca letras en lugar de un número (capturando InputMismatchException o NumberFormatException, según cómo uses el Scanner).

La excepción IllegalArgumentException.

La excepción AforoCompletoException.

Añade un bloque finally para imprimir el mensaje "--- Intento de transacción registrado ---" sin importar si hubo error o si la compra fue exitosa. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int entradasTotales = 10;
            // booleana para controlar el bucle
            boolean operacionCorrecta = false;
            int numeroEntradas = 0;
            //WHILE FUERA DEL TRY PARA QUE SE REPITA TODO EL RATO Y SE CAPTUREN LAS EXCEPCIONES
            while (operacionCorrecta == false) {
                try {
                    System.out.println("Quedan " + entradasTotales + " entradas ");
                    
                    System.out.print("Introduce el numero de entradas que quieres comprar: ");
                    numeroEntradas = sc.nextInt();
                    //imprimo para ver las entradas restantes porque devolvi antes el valor
                    System.out.println(Taquilla.venderEntradas(entradasTotales, numeroEntradas) +" entradas restantes"); 
                    //ponemos la booleana a true para que se acabe el bucle porque ya se hizo lo anterior 
                    operacionCorrecta = true;
                  
                    //captura la excepcion de que no metan letra y las que yo habia hecho en la clase taquilla
                } catch (InputMismatchException i) {
                    System.out.println("Solo puedes meter numeros");
                    sc.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (AforoCompletoExcepcion e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("---Intento de transaccion registrado---");
                }
            }
        }

    }
}


import java.util.Scanner;

public class Caracteres3 {

    Scanner sc;

    public Caracteres3() {
        sc = new Scanner(System.in);
    }

    public void correr() {
        if (sc == null) {
            System.out.println("La instancia ya se cerró");
            return;
        }
        int longitudCadena = pedirLongitudCadena();
        if (longitudCadena == 0) {
            System.out.println("El 0 es valor de salida. Finalizando...");
            return;
        }

        while (true) {
            int menu = pedirMenu();
            if (menu == 5) {
                System.out.println("El programa finalizó");
                return;
            }
            String cadena = escanearCadena(longitudCadena);
            switch (menu) {
                case 1 ->
                    System.out.printf("En la cadena \"%s\" hay %d letras\n", cadena, contarLetras(cadena));
                case 2 ->
                    System.out.printf("En la cadena \"%s\" hay %d digitos\n", cadena, contarNumeros(cadena));
                case 3 ->
                    System.out.printf("En la cadena \"%s\" hay %d digitos\n", cadena, contarMayusculas(cadena));
                case 4 ->
                    System.out.printf("La cadena \"%s\" en mayusculas es \"%s\"\n", cadena, cadena.toUpperCase());
            }
        }
    }

    // 
    public void cerrar() {
        sc.close();
        sc = null;
    }

    private int pedirLongitudCadena() {
        int longitudCadena = -1;
        while (longitudCadena < 0 || longitudCadena > 50) {
            System.out.print("Introduce de cuantos numeros quieres saber el valor (0=salir, valores de 1 a 50): ");
            longitudCadena = sc.nextInt();
        }
        return longitudCadena;
    }

    private int pedirMenu() {
        while (true) {
            System.out.println("1. Indicar cantas letras  hai.");
            System.out.println("2. Indicar cantos dixitos hai.");
            System.out.println("3. Indicar cantos son maiúsculas.");
            System.out.println("4. Transformalo a maiúsculas. ");
            System.out.println("5. Saír");

            System.out.print("Numero del menu: ");
            int menu = sc.nextInt();

            if (menu > -1 && menu < 6) {
                return menu;
            }
            System.out.println("Opción no válida");
        }
    }

    // 
    private String escanearCadena(int longitudCadena) {
        String salida = "";
        for (int i = 0; i < longitudCadena; i++) {
            System.out.print("Introduce un numero: ");
            char car = (char) sc.nextInt();
            salida += car;
            System.out.printf("Valor Unicode %d, Representacion %c\n", (int) car, car);
        }
        return salida;
    }

    private static int contarLetras(String entrada) {
        int salida = 0;
        for (char car : entrada.toCharArray()) {
            if (Character.isLetter(car)) {
                salida++;
            }
        }
        return salida;
    }

    private static int contarNumeros(String entrada) {
        int salida = 0;
        for (char car : entrada.toCharArray()) {
            if (Character.isDigit(car)) {
                salida++;
            }
        }
        return salida;
    }

    private static int contarMayusculas(String entrada) {
        int salida = 0;
        for (char car : entrada.toCharArray()) {
            if (Character.isUpperCase(car)) {
                salida++;
            }
        }
        return salida;
    }

}

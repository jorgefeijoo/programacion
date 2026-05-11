package ejercicio10Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10Arrays {

    public static void main(String[] args) {
        // creamos un array con 10 espacios
        double[] beneficios = new double[10];
        int menu = 0;
        double cantidade = 0;

        Scanner sc = new Scanner(System.in);
        // creamos un bucle para pedir los beneficios
        for (int i = 0; i < beneficios.length; i++) {
            System.out.print("Introduce los beneficios: ");
            beneficios[i] = sc.nextDouble();
        }
        //pedimos la cantidad por teclado
        System.out.print("\nIntroduce a cantidade: ");
        cantidade = sc.nextDouble();
// creamos un menu que mientras no  se escoja la opcion 3 de salir se repita
        while (menu != 3) {
            System.out.println("\n1. Maior e menor beneficio");
            System.out.println("2. Beneficios superiores a una cantidade");
            System.out.println("3. Sair");
            System.out.print("La opcion que estas introduciendo es: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    double beneficioMayor = beneficios[0];
                    double beneficioMenor = beneficios[0];
// bucle donnde el si es mayor a la varible que se vaya guardando
                    for (int i = 0; i < beneficios.length; i++) {
                        if (beneficios[i] > beneficioMayor) {
                            beneficioMayor = beneficios[i];
                        }
                        if (beneficios[i] < beneficioMenor) {
                            beneficioMenor = beneficios[i];
                        }
                    }
                    System.out.println("\nEl mayor beneficio en los 10 años fue: " + beneficioMayor);
                    System.out.println("El menor beneficio en los 10 años fue: " + beneficioMenor);
                    break;

                case 2:
                    // creamos una variable para guardar los numeros mayores a la cantidad
                    int numerosMayores = 0;
// creamos un bucle donde si hay un numero mayor se incremente 
                    for (int i = 0; i < beneficios.length; i++) {
                        if (cantidade < beneficios[i]) {
                            numerosMayores++;
                        }
                    }
                    //creamos un array con el tamaño de los numeros mayores a la cantidad
                    double[] mayoresCantidad = new double[numerosMayores];
                    // creamos la variable para que se empieze a guardar en la primera posicion y se va incrementando despues
                    int indice = 0;
// bucle con la condicion donde si los beneficios son mayores a la cantidad que se guarden en el nuevo bucle
                    for (int i = 0; i < beneficios.length; i++) {
                        if (cantidade < beneficios[i]) {
                            mayoresCantidad[indice] = beneficios[i];
                            indice++;
                        }
                    }

                    System.out.println("beneficios mayores que la cantidade " + Arrays.toString(mayoresCantidad));

                    break;

                case 3:
                    System.out.println("Cerrando el programa...");
                    return;

            }
        }
    }
}

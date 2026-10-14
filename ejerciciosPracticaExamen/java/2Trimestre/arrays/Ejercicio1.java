
public class Ejercicio1 {

    /*Suma y recorrido básico:
Crea un programa en Java que declare un array de números enteros con 5 valores (por ejemplo: 8, 3, 5, 2, 9). Recorre el array usando un bucle for
 y muestra por pantalla cada uno de los valores. Calcula y muestra al final la suma total y también la media aritmética de esos números. */
    public static void main(String[] args) {

        int[] numeros = {8, 3, 5, 2, 9};
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor del array en la posicion " + i + " es " + numeros[i]);
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los valores del array es: " + suma);
        double media=suma/numeros.length;
        System.out.println("El resultado de la media aritmetica es: "+ media);

    }

}

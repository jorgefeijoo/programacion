public class Ejercicio2 {
    /*Resetear a cero ("vaciar" el array):
Crea un programa con un array de 6 números enteros. Primero, imprime el array original usando un bucle. Luego, crea otro bucle que recorra el array y "vacíe" sus posiciones, es decir, que asigne el valor 0 a cada uno de los elementos. Finalmente, vuelve a imprimir el array para comprobar que ahora todos sus elementos son ceros.
 */

public static void main(String[] args) {
    int[] numeros ={ 1,2,3,4,5};
int i=0;
    for( i= 0; i<numeros.length;i++){
        System.out.println("El valor del array en la posicion "+ i + " es "+ numeros[i]);
    }

System.out.println("-------------------------------");

    for(int j=0; j<numeros.length;j++){
      numeros[j]=0;
        System.out.println("El valor del array en la posicion "+ j + " es "+ numeros[j]);

    }
}
}

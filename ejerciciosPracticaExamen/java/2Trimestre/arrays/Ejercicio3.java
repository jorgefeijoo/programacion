public class Ejercicio3 {
    /*Pares e impares:
Declara un array de 8 números enteros. Recórrelo y haz que el programa multiplique por 2 todos los números que estén en las posiciones (índices) pares del array, dejando los de las posiciones impares tal como están. Muestra el resultado final. */

public static void main(String[] args) {
    int[]numeros={10, 15, 20, 25, 30, 35, 40, 45};
    int i=0;
    int multiplicacionDoble=numeros[0];
    
    for(i=0;i<numeros.length;i++){
        if(i%2==0){
         multiplicacionDoble= numeros[i]*2;
        }
        else if(i%2!=0){
            multiplicacionDoble=numeros[i];
        }
        System.out.println( "El valor del array en la posicion "+ i+ " es "+ multiplicacionDoble);
    }
}

}



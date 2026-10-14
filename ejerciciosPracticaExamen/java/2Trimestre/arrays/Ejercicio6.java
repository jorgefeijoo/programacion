public class Ejercicio6 {
    /*Rotación hacia la derecha:
Declara un array numérico de 5 elementos (ej: 10, 20, 30, 40, 50). Haz un programa que desplace todos los elementos una posición hacia la derecha.
El elemento de la posición 0 debe pasar a la 1, el de la 1 a la 2... y el último elemento debe "dar la vuelta" y colocarse en la primera posición (índice 0).
Resultado esperado: 50, 10, 20, 30, 40. */


public static void main(String[] args) {
    int[] numeros={10,20,30,40,50};
int auxiliar=numeros[4];
    
    // 1. Guardamos el ÚLTIMO elemento a salvo
    // (numeros.length - 1 es siempre la última posición, en este caso la 4)
  
    
    // 2. Movemos los demás hacia la derecha, empezando por el final
    // Fíjate que el bucle va hacia atrás: i--
    for(int i = numeros.length - 1; i > 0; i--) {
        // Al de la posición actual, le metemos el valor de su vecino de la izquierda
       // numeros[i] = numeros[i - 1]; 
         System.out.println("Posición " + i + ": " + numeros[i]);
    }
    
  
    
}
    
}



public class Ejercicio5 {
    /*Invertir el array completo:
Crea un array de 6 números enteros. Escribe un programa que invierta el orden de todos los elementos del array sin crear un array nuevo. El primero debe intercambiarse con el último, el segundo con el penúltimo, etc. Imprime el array original y el array una vez invertido. */
public static void main(String[] args) {
    int[] numeros={1,2,3,4,5,6};
    int auxiliar=numeros[0];
    int auxiliar2=numeros[1];
    int auxiliar3= numeros[2];
    numeros[0]=numeros[5];
    numeros[1]=numeros[4];
    numeros[2]=numeros[3];
    numeros[3]=auxiliar3;
    numeros[4]=auxiliar2;
    numeros[5]=auxiliar;
    
    for(int i=0;i<numeros.length;i++){
        System.out.println("El valor del array en la posicion "+i+" es "+ numeros[i]);
    }
}
}

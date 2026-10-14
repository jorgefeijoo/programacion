
import java.util.Scanner;

public class ejercicio4 {
    //2.5 Estructuras repetitivas: Adivina el númeroCrear un programa Java que genere un número aleatorio entre 1 y 100 (puedes usar Math.random()). El usuario debe intentar adivinarlo. El programa seguirá pidiendo números y en cada intento dirá si el número a adivinar es "Mayor" o "Menor" que el introducido.
public static void main(String[] args) {
    int numeroAdivinar=56;
   Scanner sc =new Scanner(System.in);
   System.out.print("Intenta adivinar el numero: ");
   int numero =sc.nextInt();
    do{
        System.out.print("intenta seguir adivinando el numero: ");
        numero=sc.nextInt();
      
        if(numero==numeroAdivinar){
        System.out.println("Felicidades!! o numero introducido e o correcto");
    }else{
        if(numero<numeroAdivinar){
            System.out.println("El numero introducido e menor que o correcto");
        }
        else{
            System.out.println("o numero introducido e maior que o correcto");
        }
    }
    }while(numero!=(numeroAdivinar));
    
    }
}




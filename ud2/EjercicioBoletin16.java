package ud2;

import java.util.Scanner;

public class EjercicioBoletin16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero : ");// creamos e leemos o scanner para introducir el numero
    int num1 = sc.nextInt();
    boolean primo = true;// declaramos la bandera porque ne principio todos los numeros son primos
    if (num1 < 0) {// creamos la condicion para que no se introduzcan un numero negativo
      System.out.println("O numero é negativo");
    } else {
      for (int i = 2; ((i <= num1 / 2) && (primo == true)); i++) {
        if (num1 % i == 0) {
          primo = false;// si encontramos un divisor cambiamos la variable a false
        }
      }
      if (primo == true) {// si no se encontro ningun divisor por lo que la variable sigue siendo la misma
                          // se imprime que es primo
        System.out.println("O número é un numero primo");
      } else {
        System.out.println("El numero no é primo");// si no se imprime que no es primo ya
      }
    }
  }
}
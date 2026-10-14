import java.util.Scanner;

public class ejercicio5 {
    //2.6 Estructuras repetitivas: Máximo Común Divisor (MCD)(Contraparte del ejercicio 1.8)El Máximo Común Divisor de dos números es el número más grande que divide a ambos exactamente. Implementa un programa que pida dos números positivos y calcule su MCD utilizando el Algoritmo de Euclides (que se basa en ir restando o haciendo el módulo repetidamente).Ejemplo: MCD(12, 18) = 6
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Introduce o primeiro numero: ");
    int num1 =sc.nextInt();
    System.out.print("Introduce o segundo numero: ");
    int num2 =sc.nextInt();
   int i=2;
    
   do{
    i++;
    if(i%num1==0&&i%num2==0){
        break;
    }
   }while(i==num1&&i==num2);
   System.out.println(i);
        
  
}
}

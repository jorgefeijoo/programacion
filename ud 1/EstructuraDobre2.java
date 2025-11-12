import java.util.Scanner;

public class EstructuraDobre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o primeiro numero: ");
        int num1 = sc.nextInt();// para introducir o numero 
        if (num1 > 0) {// creamos a condicion
            System.out.println(num1 + " é un numero positivo");// si se cumple la condicion se imprime esto
        }
        else if (num1==0){
             System.out.println("O numero é " + num1);
        }
        else{
              System.out.println(num1 + " é un numero negativo");//si no se cumple la condicion se imprimira esto
        }
        sc.close();
       
    }

}

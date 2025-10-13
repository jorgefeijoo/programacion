import java.util.Scanner;

public class EstructuraDobre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce o segundo numero: ");
        int num2 = sc.nextInt();
        if (num1 < num2) {//creamos a condicion
            System.out.println("O menor dos dous e : " + num1);
        }
        else if (num1==num2){// creamos otra condicion para comprobar si son iguales
           System.out.println(num1+ "é igual" +  num2);
        }
        else{// si no es ninguna de las otras dos se imprimira esto
              System.out.println("O"+ num2 + " e mayor que " + num1);
        }
        sc.close();
       
    }

}

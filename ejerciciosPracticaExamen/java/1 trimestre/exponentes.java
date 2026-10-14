import java.util.Scanner;

public class exponentes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la base del numero: ");
        int base =sc.nextInt();
         System.out.print("Introduce el exponente del numero: ");
         int exponente=sc.nextInt();
         int i;
         int resultado=1;
        if(base<=0||exponente<=0){
            System.out.println("El numero introducido no es valido prueba a poner un numero positivo");
        }else{
            for(i=1;i<=exponente;i++){
resultado=resultado*base;
            }
        }
        System.out.println("el resultado del exponente es: "+ resultado);
       
        
    }
}

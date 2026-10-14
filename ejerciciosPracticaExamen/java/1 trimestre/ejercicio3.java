import java.util.Scanner;

public class ejercicio3 {
    //2.3 Bucle do-while: Validación de rangoRealizar el código en Java que pida al usuario una nota (valor entero) entre 0 y 10. Si el usuario introduce un número fuera de ese rango, el programa debe volver a pedirlo insistentemente hasta que sea válido. Una vez validado, mostrará "Sobresaliente" si es 9 o 10, "Notable" si es 7 u 8, "Bien" si es 6, "Suficiente" si es 5 y "Suspenso" si es menor a 5.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a nota: ");
    int nota =sc.nextInt();
       do{
        System.out.print("Introduce a nota: ");
        nota =sc.nextInt();
        
        }while(!(nota>=0&&nota<=10));

    switch (nota) {
        case 9:
        case 10:
            System.out.println("A tua nota e sobresaliente");
            break;
        case 8:
        case 7:
            System.out.println("A tua nota e notable");
            break;
        case 6:
            System.out.println("A tua nota e un ben");
            break;
        case 5:
            System.out.println("A tua nota e un sufieciente");
            break;
        default:
            System.out.println("A tua nota e suspenso");
            break;
    }

    }

}



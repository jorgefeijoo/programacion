
import java.util.Scanner;

public class Rectangulo {

    public static double calcularArea(double base , double altura){
       
        double area= base * altura;
       
        return area;

    }

    public static double calcularPerimetro(double base, double altura){
        double perimetro= 2*(base* altura);
        return perimetro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a base do rectangulo:");
        double base = sc.nextDouble();
        System.out.print("Introduce a altura: ");
        double altura=sc.nextDouble();

        System.out.println("El resultado del area es: " + Rectangulo.calcularArea(base, altura));
        System.out.println("El resultado del perimetro es: "+Rectangulo.calcularPerimetro(base, altura));

    }
    
    
}

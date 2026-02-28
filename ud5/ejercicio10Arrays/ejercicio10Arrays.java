package ejercicio10Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10Arrays {
    public static void main(String[] args) {
        double[] beneficios=new double [10];
        int menu=0;
        double beneficioMayor=0;
        double beneficioMenor=0;
        double cantidade=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<beneficios.length;i++){
        System.out.print("Introduce los beneficios: ");
        beneficios[i]=sc.nextDouble();
        }
        System.out.print("Introduce a cantidade: ");
        cantidade=sc.nextDouble();

while (menu!=3) {
    System.out.println("1. Maior e menor beneficio");
    System.out.println("2. Beneficios superiores a una cantidade");
    System.out.println("3. Sair");
    System.out.print("La opcion que estas introduciendo es: ");
    menu=sc.nextInt();
    switch (menu) {
        case 1:
            for(int i=0;i<beneficios.length;i++){
                if (beneficioMayor>=beneficios[i]) {
                    beneficioMayor=beneficios[i];
                }
                else if(beneficioMenor<=beneficios[i]){
                    beneficioMenor=beneficios[i];
                }
            }
            System.out.println("El mayor beneficio en los 10 años fue: "+ beneficioMayor);
            System.out.println("\nEl menor beneficio en los 10 años fue: "+ beneficioMenor);
            break;

            case 2:
                int numerosMayores=0;
                for(int i=0;i<beneficios.length;i++){
                if (cantidade<=beneficios[i]) {
                   numerosMayores++;
                }
            }
            
                double[] mayoresCantidad=new double[numerosMayores];
                for(int i=0;i<beneficios.length;i++){
                if (cantidade<=beneficios[i]) {
                    mayoresCantidad[i]=beneficios[i];
                }
            }
            
            System.out.println("beneficios mayores que la cantidade "+Arrays.toString(mayoresCantidad));
            
            break;

            case 3:
            System.out.println("Cerrando el programa...");
            return;
           
    
       
    }
}
    }
}

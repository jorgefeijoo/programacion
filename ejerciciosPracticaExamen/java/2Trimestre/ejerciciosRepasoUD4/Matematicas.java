
public class Matematicas {

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
      public static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }

      public static int multiplicacion(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }

    public static int division(int a, int b) {  
      
        int division = a / b;
       return division;
      
    }




    public static void main(String[] args) {
        
    System.out.println("El resultado de la suma es: " + Matematicas.sumar(7, 4));
    System.out.println("El resultado de la resta es: " + Matematicas.restar(15, 6));
    System.out.println("El resultado de la multiplicacion es: " + Matematicas.multiplicacion(8, 5));
    System.out.println("El resultado de la division es: " + Matematicas.division(10, 2));
    
    try {
        System.out.println("El resultado de la division es: " + Matematicas.division(10, 0));
      } catch (Exception e) {
        System.out.println("No se puede dividir entre 0");
      }
    }

}

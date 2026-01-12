package matematicas;

public class MatematicasStatic {
    
 // Método static
 public int sumar(int a, int b) {
 return a + b;
 }
 public static void main(String[] args) {
    Matematicas m1 =new Matematicas();
 int resultado = m1.sumar(3, 4);
 System.out.println("Resultado: " + resultado);
 }
}



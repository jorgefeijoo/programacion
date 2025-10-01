public class conversionsimple {
 public static void main(String[] args) {
 int num = 10;
 // Conversión automática: int → double
 double numDouble = num; // Java converte automaticamente
 System.out.println("Automática: " + numDouble); // Mostra 10.0
 double outro = 9.75;
 // Conversión explícita (cast): double → int
 int outroInt = (int) outro; // Perde a parte decimal
 System.out.println("Explícita: " + outroInt); // Mostra 9
 }
}

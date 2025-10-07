import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EntradaBuffered {
 public static void main(String[] args) {
 // Paso 1: Crear o BufferedReader usando System.in
 BufferedReader reader = new BufferedReader(new
InputStreamReader(System.in));
 try {
 // Paso 2: Pedir datos ao usuario
 System.out.print("Escribe o teu nome:");
 // Paso 3: Ler unha liña completa de texto
 String nome = reader.readLine();
 // Paso 4: Mostrar o resultado
 System.out.println("Ola, " + nome + "!");
 } catch (IOException e) {
 System.out.println("Erro ao ler a entrada: " + e.getMessage());
 
}
 }
}
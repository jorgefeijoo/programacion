import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear o obxecto Scanner
        // Entrada de texto
        System.out.print("Introduce o teu nome: ");
        String nome = sc.nextLine();
        // Entrada de número enteiro
        System.out.print("Introduce a túa idade: ");
        int idade = sc.nextInt();

        // Entrada de número con decimais (con coma, non vale punto)
        System.out.print("Introduce a túa altura (en centimetros): ");
        double altura = sc.nextDouble();
        // Saída dos datos introducidos
        System.out.println("Ola " + nome + ", tes " + idade + " anos e mides " + altura + " centimetros.");
        sc.close(); // Pechar o Scanner
    }
}
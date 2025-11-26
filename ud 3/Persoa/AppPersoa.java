import java.util.Scanner;

public class AppPersoa {
  public static void main(String[] args) {
    // creamos o Scanner e o leemos para intriducir los datos por teclado
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o teu nome: ");
    String nome = sc.nextLine();
    System.out.print("Introduce a tua idade: ");
    int idade = sc.nextInt();
    sc.nextLine();// Limpar scanner
    System.out.print("Introduce o teu DNI: ");
    String dni = sc.nextLine();
    System.out.print("Introduce o teu sexo: ");
    char sexo = sc.nextLine().charAt(0);
    System.out.print("Introduce o teu peso: ");
    double peso = sc.nextDouble();
    System.out.print("Introduce a tua altura: ");
    double altura = sc.nextDouble();
    System.out.println(" ");
    Persoa persona = new Persoa(nome, idade, dni, sexo, peso, altura);
    persona.amosarInformacion();
    System.out.println(" ");
    persona.setSexo('H');
    persona.setIdade(18);
    System.out.println(" ");
    persona.amosarInformacion();
    System.out.println(" ");
    if (persona.eMaiorIdade() == true) {
      System.out.println("A persoa e maior de idade");
    } else {
      System.out.println("A persoa e menor de idade ");
    }
    System.out.println(" ");
    System.out.println("O indice de masa corporal de " + persona.getNome() + " e " + persona.calcularIMC());

  }
}

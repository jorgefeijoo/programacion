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
    System.out.println("O nome da persoa e: "+persona.getNome());
    //System.out.println("A idade da persoa e: " + persona.getidade());
    System.out.println("O DNI da persoa e: " + persona.getDNI());

   // System.out.println("O sexo da persoa e: " + persona.getSexo());
    System.out.println("O peso da persoa e: " + persona.getPeso());
    System.out.println("A altura da persoa e: " + persona.getAltura());
    

  }
}

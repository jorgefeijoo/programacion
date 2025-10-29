package ud2;

import java.util.Scanner;

public class EjercicioBoletin17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia, mes, ano;
    do {
      System.out.print("Introduce o teu dia de nacemento: ");// creamos o scanner para que pongan el dia
      dia = sc.nextInt();// creamos y leemos la variable dia
      System.out.print("Introduce o teu mes de nacemento: ");// creamos el scanner para que ponga el mes
      mes = sc.nextInt();// creamos y leemos la variable mes
      System.out.print("Introduce o teu ano de nacemento: ");// creamos el scanner para que ponga el año
      ano = sc.nextInt();// creamos y leemos la variable ano
      if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano > 2025) {
        System.out.println("Data incorrecta, introduce de novo a data de nacemento");
      }
    } while (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano > 2025);
    System.out.println("A tua data de nacemento é: " + dia + "/" + mes + "/" + ano);// le decimos su fecha de

    System.out.println("A tua data de nacemento é: " + dia + "/" + mes + "/" + ano);// le decimos su fecha de //
                                                                                    // nacimiento
    int resultado = dia + mes + ano;// creamos la variable resultado para conseguir el resultado de sumar su fecha
                                    // de nacemento
    System.out.println("El resultado de la suma de tu fecha de nacimiento es de: " + resultado);

    int cont = 0;
    while (resultado > 0) {
      cont = resultado += cont % 10;// sumammos o ultimo dixito
      resultado = resultado / 10;// eliminamos o ultimo dixito
    }
    System.out.println("El numero de la suerte es " + cont);

  }
}

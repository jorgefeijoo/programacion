import java.util.Scanner;

public class AppAscensor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// creamos o Scanner
    System.out.print("Introduce o piso no que estas: ");// pedimos e lemos o numero de piso no que esta
    int actual = sc.nextInt();
    System.out.print("Introduce o numero de pisos que hay: ");// pedimos e lemos o maximo de pisos que temos
    int maxpisos = sc.nextInt();
    Ascensor ascensor = new Ascensor(actual, maxpisos);// creamos o obxeto ascensor
    int opcion;
    do {// creamos un bucle para que se repita esto mientras no se cumple lo del while
      System.out.println("Elige una opcion");// pedimos que elija la opcion y la leemos
      System.out.println("1. Subir");
      System.out.println("2. Bajar");
      System.out.println("3. Mostrar");
      System.out.println("4. Sair");
      opcion = sc.nextInt();
      System.out.println("A opcion que estas introducindo e: " + opcion);
      switch (opcion) {// creamos un switch para que segun la opcion que marcamos se ha el caso
        case 1:
          System.out.print("Introduce os pisos que queres subir: ");// preguntamos por teclado o numero de pisos que
                                                                    // quere subir

          int subir = sc.nextInt();// leemos o numero introducido por teclado
          ascensor.Subir(subir);// suben o numero de pisos que indicamos por pantalla
          break;
        case 2:
          System.out.print("Introduce os pisos que queres bajar: ");// leemos por teclado o numero de pisos que queren
                                                                    // baixar

          int bajar = sc.nextInt();// leemos por teclado o numero de pisos que queren baixar
          ascensor.Bajar(bajar);// baixan o numero de pisos que mostramos por teclado
          break;
        case 3:
          ascensor.Situacion();// mostramos a situacion onde estamos
          break;
        case 4:
          System.out.println("O programa finalizou");// remata o programa
          break;
        default:
          System.out.println();
      }
    } while (opcion != 4);// pedimos que se repita el bucle mientras que no la opcion escogida sea
                          // distinta de 4

  }
}

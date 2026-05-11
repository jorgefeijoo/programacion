package polimorfismo;

import java.util.Scanner;

class Vehiculo {
  void mover() {
    System.out.println("O vehículo está a moverse");
  }
}

class Coche extends Vehiculo {

  @Override
  void mover() {
    System.out.println("O coche está a conducir na estrada");
  }

  void tocarBocina() {
    System.out.println("O coche fai bip bip");
  }

}

class Barco extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O barco está a navegar no mar");
  }

}

class Avion extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O avión está a voar nos ceos");
  }
}

public class Main {
  public static void main(String[] args) {

    int menu = 0;
    Vehiculo v1;

    try (Scanner sc = new Scanner(System.in)) {
      while (menu < 4) {

        System.out.println("----MENU DE VEHICULOS ---");
        System.out.println("1. El vehiculo que vas a crear e un coche");
        System.out.println("2. El vehiculo que vas a crear e un barco");
        System.out.println("3. El vehiculo que vas a crear e un avion");
        System.out.println("Salir del menu");
        System.out.print("La opcion que estas introduciendo es: ");
        menu = sc.nextInt();

        switch (menu) {
          case 1:
            v1 = new Coche();
            v1.mover();
            ((Coche) v1).tocarBocina();

            break;

          case 2:
            v1 = new Barco();
            v1.mover();
            break;

          case 3:
            v1 = new Avion();
            v1.mover();
            break;

          case 4:
            System.out.println("Cerrando el menu...");
            return;

        }
      }
    }

  }
}

public class VehiculoAbstracto {
  public static void main(String[] args) {
    // creamos los objetos y le damos los valores
    Bicicleta b1 = new Bicicleta("Trek", "Fuel Fx", 60, 5, true);
    Coche c1 = new Coche("BMW", "M4 competition", 360);
    Avion a1 = new Avion("Boeing", "747-8i", 1062, 4);

    // Uso de los metodos de vehiculo + los propios de cada clase
    System.out.println("== Metodos de Bicicleta  ==\n");
    b1.acelerar(3);
    b1.frear(2);
    b1.pedalear();

    System.out.println("---------------------------");

    System.out.println("== Metodos de Coche ==\n");

    c1.acelerar(6);
    c1.frear(2);

    System.out.println("---------------------------");

    System.out.println("== Metodos de Avion  ==\n");

    a1.acelerar(12);
    a1.frear(0);
    a1.voar();

  }
}

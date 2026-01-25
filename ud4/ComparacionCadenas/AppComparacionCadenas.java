package ComparacionCadenas;

public class AppComparacionCadenas {
  public static void main(String[] args) {

    switch (ComparacionCadenas.pedirCadenas()) {
      case 0:
        System.out.println("No son iguales");
        break;
      case -1:
        System.out.println("Tienen distinta longitud");
        break;
      case 2:
        System.out.println("Son exactamente iguales");
        break;
      case 1:
        System.out.println("Son iguais lexicograficamente");
        break;

    }
  }
}

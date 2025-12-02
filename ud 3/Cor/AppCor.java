public class AppCor {
  public static void main(String[] args) {
    // creamos o obxeto co constrctor por defecto
    Cor c1 = new Cor();
    c1.setRed(0.6);
    c1.setGreen(0.4);
    c1.setBlue(0.9);

    // creamos o obxeto co constructor

    Cor c2 = new Cor(0.8, 0.8, 1.5);
    c1.amosarInformacion();
    // c1.gris();
    // c1.amosarInformacion();
    c1.filtro(0.5, 0.8, 0.7);
    c1.amosarInformacion();
    System.out.println("-----------------------------");
    c2.amosarInformacion();
    // c2.gris();
    // c2.amosarInformacion();
    c2.filtro(0.7, 0.9, 0.2);

    c2.amosarInformacion();
    System.out.println("---------------------------------");

  }
}
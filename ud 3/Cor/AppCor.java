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
    //c1.gris();
   // c1.amosarInformacion();
    System.out.println("-----------------------------");
    c2.amosarInformacion();
   // c2.gris();
    //c2.amosarInformacion();
System.out.println("---------------------------------");
System.out.print("el filtro del color 1 es: ");c1.filtro();
System.out.println("-----------------------------------");
System.out.println("el filtro del color 2 es: ");c2.filtro();;


  }
}
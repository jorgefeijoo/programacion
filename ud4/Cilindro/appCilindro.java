package Cilindro;

public class appCilindro {
  public static void main(String[] args) {
    // creamos o obxeto
    Cilindro c1 = new Cilindro();
    // introducimos os valores co constructor por defecto
    c1.setAltura(1);
    c1.setRadio(2);
    // chamamos aos metodos mediante o obxeto
    c1.area();
    c1.volumen();

    System.out.println("------------------------------------------------------");
    // damos os valores e chamamos ao area e volumen co static
    Cilindro.area(2, 1);
    Cilindro.volumen(2, 1);
  }
}

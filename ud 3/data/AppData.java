
public class AppData {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.setDia(4);
    d1.setMes(enumMes.enero);
    d1.setAno(2004);
    System.out.println(d1);
    System.out.println("-------------------------------");

    Data d2 = new Data(enumMes.diciembre);
    System.out.println(d2);
    Data d3 = new Data(19, enumMes.septiembre, 2007);

    System.out.println("------------------------------");

    System.out.println(d3);

    if (d3.isSummer() == true) {
      System.out.println("E verano");
    } else {
      System.out.println("non e verano");
    }

  }
}
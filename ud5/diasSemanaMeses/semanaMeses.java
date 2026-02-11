package diasSemanaMeses;

public class semanaMeses {
  public static void main(String[] args) {
    String[] diasSemana = new String[7];

    diasSemana[0] = "Lunes";
    diasSemana[1] = "Martes";
    diasSemana[2] = "Miercoles";
    diasSemana[3] = "Jueves";
    diasSemana[4] = "Viernes";
    diasSemana[5] = "Sabado";
    diasSemana[6] = "Domingo";

    String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
        "octubre", "noviembre", "diciembre" };

    for (int i = 0; i < (diasSemana.length); i++) {
      System.out.println("el dia de la semana es: " + diasSemana[i]);
    }
    System.out.println("---------------------------------------");

    for (int i = 0; i < (diasSemana.length); i++) {
      diasSemana[i] = diasSemana[i].toUpperCase();
      System.out.println("el dia de la semana es: " + diasSemana[i]);
    }

    System.out.println("---------------------------------------");
    for (String valor : diasSemana) {

      System.out.println(valor + " ");
    }
    System.out.println("---------------------------------------");

    for (int j = 0; j < (meses.length); j++) {
      System.out.println("El mes es: " + meses[j]);
    }
    System.out.println("---------------------------------------");

    for (int j = 0; j < (meses.length); j++) {
      meses[j] = meses[j].toUpperCase();
      System.out.println("El mes es: " + meses[j]);
    }
    System.out.println("---------------------------------------");

    for (String valorM : meses) {

      System.out.println(valorM + " ");
    }

  }

}
enum enumMes {
  enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre
}

public class Data {

  private int dia;
  private enumMes mes;
  private int ano;

  public Data() {
  }

  public Data(enumMes mes) {

  }

  public Data(int dia, enumMes mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

}

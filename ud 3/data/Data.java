// creamos os enum
enum enumMes {
  enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre
}

// creamos a clase Data
public class Data {

  private int dia;
  private enumMes mes;
  private int ano;

  // creamos o metodo is summer para saber si la data es verano o no // 21/6 hasta
  // el 23/9
  public boolean isSummer() {
    if (dia >= 21 && mes == enumMes.junio || mes == enumMes.julio || mes == enumMes.agosto
        || dia <= 23 && mes == enumMes.septiembre) {
      return true;
    } else {
      return false;
    }
  }

  // creamos o metodo tostring para que chame ao valor
  public String toString() {

    return (dia + " de " + mes + " de " + ano);

  }

  // creamos o constructor por defecto
  public Data() {
  }

  // creamos o construtor para enum mes
  public Data(enumMes mes) {
    this.mes = mes;
  }

  // creamos un constructor para dia mes e ano
  public Data(int dia, enumMes mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(enumMes mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getDia() {
    return dia;
  }

  public enumMes getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

}

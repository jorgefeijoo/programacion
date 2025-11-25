public class Persoa {
  // creamos os atributos
  private String nome;
  private int idade;
  private String DNI;
  private char sexo;
  private double peso;
  private double altura;

  // creamos os metodos
  private boolean eCorrectaIdade(int idade) {
    if (idade >= 0 && idade <= 150) {
      return true;
    } else
      return false;

  }

  // creamos o constructor por defecto
  public Persoa() {

  }

  // creamos o constructor
  public Persoa(String nome, int idade, String DNI, char sexo, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    if (eCorrectaIdade(idade)) {
System.out.println("A idade da persoa e: "+idade);
    } else {
      System.out.println("A idade que estas introducindo non e correcta");
    }
    this.DNI = DNI;
    this.sexo = sexo;
    if (sexo == 'H' || sexo == 'M') {
      System.out.println("O  sexo da persoa e : " + sexo);
    } else {
      System.out.println("No es posible introducir ese sexo");
    }
    this.peso = peso;
    this.altura = altura;
  }

  // creamos os set e os get
  public void setNombre(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setALtura(double altura) {
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public int getidade() {
    return idade;
  }

  public String getDNI() {
    return DNI;
  }

  public char getSexo() {
    return sexo;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }
}
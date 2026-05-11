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

  public void amosarInformacion() {// creamos o metodo para amosar informacion
    System.out.println("O nome da persoa e: " + getNome());
    System.out.println("A idade da persoa e: " + getidade());
    System.out.println("O DNI da persoa e: " + getDNI());

    System.out.println("O sexo da persoa e: " + getSexo());
    System.out.println("O peso da persoa e: " + getPeso());
    System.out.println("A altura da persoa e: " + getAltura());
  }

  public boolean eMaiorIdade() {// creamos un metodo con una condicion para comprobar si tiene mas de 18 o no
    if (idade >= 18) {
      return true;
    } else {
      return false;
    }

  }

  public double calcularIMC() {// creamos un metodo para calcular el IMC
    double IMC = peso / (altura * altura);
    return IMC;

  }

  // creamos o constructor por defecto
  public Persoa() {

  }

  // creamos o constructor
  public Persoa(String nome, int idade, String DNI, char sexo, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    if (eCorrectaIdade(idade) == true) {// creamos a condicion para que la idade solo sea entre 1y 150
      this.idade = idade;
    } else {
      System.out.println("Non e posible introducir esa idade");
    }

    this.DNI = DNI;
    this.sexo = sexo;
    if (sexo == 'H' || sexo == 'M') {// creamos a condicion para introducir solo o sexo M o H
      this.sexo = sexo;
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
    if (idade >= 0 && idade <= 150) {
      System.out.println("A idade da persoa e: " + idade);
    } else {
      System.out.println("Non se pode introducir a idade ");
    }

    this.idade = idade;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

  public void setSexo(char sexo) {
    if (sexo == 'H' || sexo == 'M') {// creamos a condicion para introducir solo o sexo M o H
      System.out.println("O  sexo da persoa e : " + sexo);
    } else {
      System.out.println("No es posible introducir ese sexo");
    }

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
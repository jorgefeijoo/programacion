package ejercicio13;

public class Arrays {
  public static void main(String[] args) {
    // creamos o array
    Estudante[] estudante = new Estudante[3];
    // damoslle valores a cada posicion do array
    estudante[0] = new Estudante("Elisa", 36, 4);
    estudante[1] = new Estudante("Anjo", 18, 9);
    estudante[2] = new Estudante("Gorge", 67, 8);
    // creamos os bucle para recorrer el array
    for (int i = 0; i < estudante.length; i++) {
      estudante[i].mostrarInfo();
    }
  }
}

public class BucleDoWhile {

  public static void main(String[] args) {
    int Suma = 0;// iniciamos a variable contador
    int i = 0;// iniciamos variable a 0
    do {
      i++;
      Suma = Suma + i;
    } while (Suma < 100000);
    System.out.println(i);// muestra el ultimo numero que necesitamos
  }
}

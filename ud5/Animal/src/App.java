public class App {
  public static void main(String[] args) {

    Animal[] animais = new Animal[3];
    animais[0] = new Gato();
    animais[1] = new Can();
    animais[2] = new Vaca();
    animais[0].facerSon();
    animais[1].facerSon();
    animais[2].facerSon();
  }
}

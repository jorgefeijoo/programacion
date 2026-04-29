interface Animal {

  public String fala();
}

class Gato implements Animal {
  public Gato() {
    System.out.println("> construtor de Gato");
  }

  public String fala() {
    return "Miau!!";
  }

  public void arañar() {
    System.out.println("El gato araña ");
  }
}

class Can implements Animal {
  public Can() {
    System.out.println("> construtor de Perro");
  }

  public String fala() {
    return "Guau!!";
  }
}

public class Fauna {
  public static void main(String[] args) {
    Animal[] lista = new Animal[2]; // referencias á superclase
    lista[0] = new Gato();
    lista[1] = new Can();

    for (Animal a : lista) {
      System.out.println(a.fala());
    }
    ((Gato) lista[0]).arañar();
    lista[0].fala();
  }

}

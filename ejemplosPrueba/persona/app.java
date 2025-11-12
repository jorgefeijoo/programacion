public class app {
  public static void main(String[] args) {
    Persoa manuel = new Persoa();// creamos un obxeto manuel da clase persoa
    // chamamos ao membros de manuel
    manuel.nome = "Manuel";
    manuel.altura = 187;
    System.out.println(manuel.nome);
    System.out.println(manuel.altura);
    manuel.camiñar();
    manuel.comer();
    manuel.durmir();
    Persoa maria=new Persoa(nome "Maria");
  }
}

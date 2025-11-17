public class app {
  public static void main(String[] args) {
    Persoa manuel = new Persoa();// creamos un obxeto manuel da clase persoa
    // chamamos ao membros de manuel
    manuel.setNome("Manuel");
    manuel.setAltura(187);
    System.out.println(manuel.getNome());
    System.out.println(manuel.getAltura());
    manuel.camiñar();
    manuel.comer();
    manuel.durmir();
    Persoa maria = new Persoa("Maria", "19/12/2007", 50.9, 187);
    System.out.println(maria.getNome());
    System.out.println(maria.getAltura());
  }
}

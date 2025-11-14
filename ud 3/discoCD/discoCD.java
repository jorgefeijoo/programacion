public class discoCD{
  public String artista;
  public String duracion;
  public int canciones;

  public void escuchar(){
    System.out.println("Estoy escuchandolo");
  }
  
  public void cuidar(){
    System.out.println("Hay que cuidarlo para que non se rompa");
  }
  
  public void limpiar(){
    System.out.println("Hay que limpiarlo para que no coja polvo");
  }
  discoCD(){

  }
  public discoCD(String a, String d , int c){
artista=a;
duracion=d;
canciones=c;
  }
}
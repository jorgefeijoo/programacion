public class AppConta {
    public static void main(String[] args) {//para que o programa sexa executable 
        Conta personal = new Conta("ABC123","Jorge",5400.53);    // creamos o obxeto conta coa variable persoal 
   
  
  
  
        //definimos os valores aos atributos
     
   /*personal.idConta="ABC123";
    personal.titular="Jorge";
    personal.saldo=5400.53;*/
   
    //mostramos os valores 
   
  
      System.out.println("O id da conta e: "+ personal.idConta);
  System.out.println("O titular  da conta e: "+personal.titular);
    System.out.println("O saldo da conta e: "+personal.saldo);


    
    }
}

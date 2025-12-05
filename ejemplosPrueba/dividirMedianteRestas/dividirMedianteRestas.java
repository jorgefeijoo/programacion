package dividirMedianteRestas;

public class dividirMedianteRestas{
public static void main(String[] args) {
   
   int dividendo = 100;
   int divisor=20;
  int resto;
  int cociente=5;
  int incremento=0;
  

  
   
    do{
 resto= dividendo - divisor;
 dividendo=resto;
 System.out.println("o resto e: " +resto);
 incremento = incremento +1;
 System.out.println("se repite o numero de veces"+ incremento);
 
        
    }while(resto!=0);
   
    
}
}
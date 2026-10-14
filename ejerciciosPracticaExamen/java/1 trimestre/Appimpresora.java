public class Appimpresora {
    public static void main(String[] args) {
        Impresora i1=new Impresora("HP",40,100);

         Impresora i2=new Impresora();
         i2.setModelo("impresoraJorge");
         i2.setFolios(30);
         i2.setTinta(20);
    
    
    i1.situacion();
    i1.imprimir(4);
    i1.situacion();
    System.out.println("-------------------------------------");

    i2.situacion();
    i2.imprimir(10);
    i2.situacion();
    
    
    
    
    
    
        }
}

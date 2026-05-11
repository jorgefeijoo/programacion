public class multilicarMedianteSumas{
    public static void main(String[] args) {
        int multiplicando =100;
        int multiplicador=20;
        int producto;
        int contador=0;

        do{
producto=multiplicando+multiplicador;
System.out.println("el multiplicando es: "+multiplicando);
multiplicando=producto;
contador= contador+1;
System.out.println("se repite " +contador+"veces");
System.out.println("el producto es: "+ producto);
        }while (producto!=2000);
        

    }
}
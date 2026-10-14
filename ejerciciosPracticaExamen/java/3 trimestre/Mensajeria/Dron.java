public class Dron implements Mensajeria{

    @Override
    public void procesarEnvio(String paquete) {
        System.out.println("Tu pedido " + paquete + " se esta enviando en dron");
    }

    @Override
    public double calcularTarifa(String paquete) {
        double precioBase=10.00;
       double precioPedido=0.00;

       if (paquete.toLowerCase().contains("larga distancia")) {
        precioPedido=precioBase*2;
       }
       return precioPedido;
    }
    
}

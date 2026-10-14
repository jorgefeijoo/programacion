public class Bicicleta implements Mensajeria {

    @Override
    public void procesarEnvio(String paquete) {
        System.out.println("Tu pedido " + paquete+" se esta realizando en bicicleta");
    }

    @Override
    public double calcularTarifa(String paquete) {
       double precioBase=3.00;
       double precioPedido=0.00;

       if (paquete.toLowerCase().contains("urgente")) {
        precioPedido=precioBase+2.00;
       }
       return precioPedido;
    }
    
}

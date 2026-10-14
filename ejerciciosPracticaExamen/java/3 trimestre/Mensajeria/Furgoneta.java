public class Furgoneta implements Mensajeria {

    @Override
    public void procesarEnvio(String paquete) {
        System.out.println("tu pedido "+paquete+" se esta realizando en furgoneta");
    }

    @Override
    public double calcularTarifa(String paquete) {
        double precioBase=8.00;
       double precioPedido=0.00;

       if (paquete.toLowerCase().contains("fragil")||paquete.contains("voluminoso")) {
        precioPedido=precioBase+5.00;
       }
       return precioPedido;
    }
    
}

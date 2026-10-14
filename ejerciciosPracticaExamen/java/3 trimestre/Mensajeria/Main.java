public class Main {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        Furgoneta fragoneta=new Furgoneta();
        Dron d1= new Dron();

        System.out.println("Metodos de Bicicleta: \n");
        b1.procesarEnvio("Contrato legal urgente");
       System.out.println("El precio de tu pedido es: " + b1.calcularTarifa("Contrato legal urgente"));

        System.out.println("-------------------------------");

        System.out.println("Metodos de Fragoneta: \n");

        fragoneta.procesarEnvio("Vajilla de cristal fragil");
        System.out.println("El precio de tu pedido es: " +fragoneta.calcularTarifa("Vajilla de cristal fragil"));


         System.out.println("-------------------------------");

         System.out.println("Metodos dron: \n");

         d1.procesarEnvio("Medicamentos para larga distancia");
         System.out.println("El precio de tu pedido es: " +d1.calcularTarifa("Medicamentos para larga distancia"));


    }
}

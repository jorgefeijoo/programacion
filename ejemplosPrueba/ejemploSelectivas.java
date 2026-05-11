public class ejemploSelectivas {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double radio = -7.5;
        if (radio > 0) {
            double lonxitude = 2 * PI * radio;
            System.out.println("A lonxitude da circunferencia é: " + lonxitude);
        } // fin do if
        else{
       System.out.println("Non se pode calcular o perimetro do radio negativo");
    }
    System.out.println("Continua o programa");
}
}

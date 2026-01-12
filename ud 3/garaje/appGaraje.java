public class appGaraje {
    public static void main(String[] args) {
        Garaje g1 = new Garaje();
        g1.setOcupadas(2);
        g1.setNprazas(40);
        Garaje g2 = new Garaje (50,8);
        g1.entrarCoches();
        g1.situacion();
    }
}

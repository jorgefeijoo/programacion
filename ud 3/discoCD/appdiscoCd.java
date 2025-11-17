public class appdiscoCd {
    public static void main(String[] args) {
        discoCD disco = new discoCD("mvrk", "30 mins", 12);
        System.out.println("O artista do disco e: " + disco.artista);
        System.out.println("A duracion do disco e : " + disco.duracion);
        System.out.println("O disco ten " + disco.canciones + " canciones");
        disco.escuchar();
        disco.cuidar();
        disco.limpiar();
        discoCD disco2 = new discoCD();
        disco2.artista = "Quevedo";
        disco2.duracion = "1h";
        disco2.canciones = 13;
        System.out.println("O artista do disco e: " + disco2.artista);
        System.out.println("A duracion do disco e : " + disco2.duracion);
        System.out.println("O disco ten " + disco2.canciones + " canciones");
    }
}
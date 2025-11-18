public class appdiscoCd {
    public static void main(String[] args) {
        discoCD disco = new discoCD("mvrk", "30 mins", 12);
        System.out.println("O artista do disco e: " + disco.getArtista());
        System.out.println("A duracion do disco e : " + disco.getDuracion());
        System.out.println("O disco ten " + disco.getCanciones() + " canciones");
        disco.escuchar();
        disco.cuidar();
        disco.limpiar();
        discoCD disco2 = new discoCD();
        disco2.setArtista("Quevedo");
        disco2.setDuracion("1h");
        disco2.setCanciones(13);
        System.out.println("O artista do disco e: " + disco2.getArtista());
        System.out.println("A duracion do disco e : " + disco2.getDuracion());
        System.out.println("O disco ten " + disco2.getCanciones() + " canciones");
    }
}
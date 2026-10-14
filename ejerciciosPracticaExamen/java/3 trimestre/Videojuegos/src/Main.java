
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Videojuego[] arrayVideojuegos = new Videojuego[4];

        arrayVideojuegos[0] = new Videojuego("The Witcher 3 ", 2015);
        arrayVideojuegos[1] = new Videojuego("Pacman", 1980);
        arrayVideojuegos[2] = new Videojuego("Minecraft ", 2011);
        arrayVideojuegos[3] = new Videojuego("Tetris ", 1984);

        System.out.println("Juegos sin ordenar \n");

        for (int i = 0; i < arrayVideojuegos.length; i++) {
            System.out.println(arrayVideojuegos[i]);
        }

        Arrays.sort(arrayVideojuegos);

        System.out.println("\nJuegos ordenados por año \n");
        
        for (int i = 0; i < arrayVideojuegos.length; i++) {
            System.out.println(arrayVideojuegos[i]);
        }

    }
}

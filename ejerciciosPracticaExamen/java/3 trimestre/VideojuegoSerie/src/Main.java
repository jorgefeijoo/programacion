
import java.util.Arrays;
import java.util.Collections;

/*4. Crear o programa principal:
- Crear un array de Series de 5 posicións
- Crear un array de Videoxogos de 5 posicións
- Crear obxectos nas posicións dos arrays
- Entregar algunhas series e videoxogos
- Contar cantos están entregados e devolvelos
- Mostrar:
- a serie con máis tempadas
- o videoxogo con máis horas estimadas
- toda a información usando toString() */
public class Main {

    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;
        Serie seriecillas[] = new Serie[5];
        Videojuego videojueguillos[] = new Videojuego[5];

        seriecillas[0] = new Serie("Luwawu", false, "boqueisonKing", null, 1);
        seriecillas[1] = new Serie("Gosendo", false, "gosendo por boqueison", "accion", 2);
        seriecillas[2] = new Serie("Anso", false, "Anso por Castenda", "accion", 3);
        seriecillas[3] = new Serie("Elisa", false, "Elisa por Ribeira", "accion", 4);
        seriecillas[4] = new Serie("Sulio", false, "Sulio por pedrafita", "accion", 5);

        videojueguillos[0] = new Videojuego("turtleWow", "proyectoCapibara", "Aburrimiento", 1);
        videojueguillos[1] = new Videojuego("Megahucha", "BrawlStars", "accion", 2);
        videojueguillos[2] = new Videojuego("CsGosendoOsi", "Cs2", "Matarandoms", 3);
        videojueguillos[3] = new Videojuego("JavaLang", "minecraft", "AnsoEMalisimo", 4);
        videojueguillos[4] = new Videojuego("Lababayi", "Fortinite", "SoyMuyBueno", 5);

        seriecillas[0].entregar();
        seriecillas[3].entregar();

        System.out.println("\n----------------------------------------\n");

        videojueguillos[3].entregar();
        videojueguillos[4].entregar();

        for (Videojuego videojuego : videojueguillos) {
            if (videojuego.isEntregado()) {
                contador++;
            }
        }
        System.out.println("\n----------------------------------------\n");

        System.out.println("Hay " + contador + " videojuegos entregados");

        for (Serie serie : seriecillas) {
            if (serie.isEntregado()) {
                contador2++;
            }
        }

        System.out.println("Hay " + contador2 + " series entregadas");


           System.out.println("\n----------------------------------------\n");

        for (Videojuego videojuego : videojueguillos) {
            System.out.println(videojuego);
        }

        System.out.println("\n----------------------------------------\n");

        for (Serie serie : seriecillas) {
            System.out.println(serie);
        }

        Arrays.sort(videojueguillos, Collections.reverseOrder());
        Arrays.sort(seriecillas, Collections.reverseOrder());

        System.out.println("\nPeliculas y videojuegos con mais tempadas/horas \n");
        System.out.println(videojueguillos[0]);
        System.out.println(seriecillas[0]);

    }
}

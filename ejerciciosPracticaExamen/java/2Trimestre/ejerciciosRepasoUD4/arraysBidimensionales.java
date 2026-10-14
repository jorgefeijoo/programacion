
import java.util.Random;

/*amos a gestionar los puntos anotados por los jugadores de un equipo de baloncesto durante un torneo corto mediante un array bidimensional (matriz).

Crea una matriz donde cada fila representará a un jugador y cada columna representará los puntos anotados en un partido. En total son 8 jugadores y cada uno habrá jugado 5 partidos.

Inicializa la matriz directamente con los puntos obtenidos (inéntate los números, pueden ser valores entre 0 y 30, por ejemplo).

A partir de la información contenida en la matriz, deberás realizar los bucles y cálculos necesarios para mostrar por pantalla la siguiente información:

Media de puntos de cada jugador: (Para saber quién es el máximo anotador promedio).

Media de puntos general del equipo: (Sumando todos los puntos de todos los jugadores en todos los partidos, dividido entre el total de partidos individuales jugados).

Indicar cuántas veces se superaron o igualaron los 15 puntos: (Partidos destacados en total).

Indicar cuántas veces se anotaron menos de 5 puntos: (Partidos flojos en total).

Mostrar cuál fue la máxima puntuación absoluta del torneo: (El récord en un solo partido).

Mostrar cuál fue la peor puntuación absoluta del torneo.

Indicar cuántos jugadores han sido "Regulares": (Un jugador se considera regular si ha anotado 10 puntos o más en TODOS sus partidos). */
public class arraysBidimensionales {

    public static void main(String[] args) {
        int puntos[][] = new int[8][5];
        Random r = new Random();
        int media = 0;
        int sumaMediaGeneral = 0;
        int mediaTotal = 0;
        int contadorQuincePuntos = 0;
        int contadorCincoPuntos = 0;

        int mayorPuntuacion = 0;
        int menorPuntuacion = 0;

        // bucle paraa rellenar el array 
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos[i].length; j++) {
                int numeroAleatorio = r.nextInt(30 - 0) + 1;
                puntos[i][j] = numeroAleatorio;

            }
        }

        // bucle para mostrar o array
        for (int i = 0; i < puntos.length; i++) {
            System.out.print("filas " + i + " : ");
            for (int j = 0; j < puntos[i].length; j++) {
                System.out.print(" " + puntos[i][j]);

            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        //inicializamos los valores al primer valor pero cuando ya estan los datos metidos 
        mayorPuntuacion = puntos[0][0];
        menorPuntuacion = puntos[0][0];

        //bucle para hacer todos los calculos
        for (int i = 0; i < puntos.length; i++) {
            int mediaJugadores = 0;
            for (int j = 0; j < puntos[i].length; j++) {
               //la media de los jugadores es la suma de las columnas pero contando cada fila 
                mediaJugadores = mediaJugadores + puntos[i][j];

                // la suma total de todos los resultados
                sumaMediaGeneral = sumaMediaGeneral + puntos[i][j];
              

// condicion donde si los puntos son mayores a 15 se aumenta el contador
                if (puntos[i][j] >= 15) {
                    contadorQuincePuntos++;
                }
// si los puntos son menroes de 5 se aumenta el contador
                if (puntos[i][j] < 5) {
                    contadorCincoPuntos++;
                }
//condicion donde si los puntos son mayores de la maxima puntiacion que siempre va a ser la mas alta pirque se va recorriendo el bucle lo guardamos en la propia variable
                if (puntos[i][j] > mayorPuntuacion) {
                    mayorPuntuacion = puntos[i][j];
                }
// lo mismo pero con la menor
                if (puntos[i][j] < menorPuntuacion) {
                    menorPuntuacion = puntos[i][j];
                }

            }

            // hacemos la media de los jugadores y lo imprimo en este bucle para poder ir viendo cada jugador
            media = mediaJugadores / 5;
            
            System.out.println("media del jugador " + i + " = " + media);
        }

        // calculamos la media total
        mediaTotal = sumaMediaGeneral / 40;

        System.out.println("La media total del equipo es: " + mediaTotal);

        System.out.println("Las veces que se superaron los 15 puntos son: " + contadorQuincePuntos);

        System.out.println("Las veces que no se superaron los 5 puntos son: " + contadorCincoPuntos);

        System.out.println("El partido que mayor puntuacion tuvo fue: " + mayorPuntuacion);

        System.out.println("El partido que mayor puntuacion tuvo fue: " + menorPuntuacion);

    }

}

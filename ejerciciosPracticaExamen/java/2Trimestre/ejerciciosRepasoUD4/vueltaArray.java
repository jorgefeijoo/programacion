
public class vueltaArray {

    public static void main(String[] args) {
        int arrai[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int auxiliar = 0;
        int ultimo = arrai.length - 1;

        for (int i = 0; i < arrai.length / 2; i++) {

            auxiliar = arrai[i];

            arrai[i] = arrai[ultimo];

            arrai[ultimo] = auxiliar;

            ultimo--;
        }

        for (int i = 0; i < arrai.length; i++) {
            System.out.println("El valor del array en la posicion " + i + " es: "+ arrai[i]);
        }
    }
}

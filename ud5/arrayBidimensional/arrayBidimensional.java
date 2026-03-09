package arrayBidimensional;

// Realizar un programa en java que cree un arra bidemensional de 3 filas a 5 columnas .En cada elemento pode almacenarse o producto da fila polo numero
//0 0 0 0 0
//0 1 2 3 4
//0 2 4 6 8
public class arrayBidimensional {
    public static void main(String[] args) {
        int producto[][] = new int[3][5];

        for (int i = 0; i < producto.length; i++) {
            System.out.print("Fila " + i + " : ");
            for (int j = 0; j < producto[i].length; j++) {
                // le damos el valor al array y hacemos i*j
                producto[i][j] = i * j;
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
}

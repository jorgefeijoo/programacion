package arrayBidimensionalesNombres;

public class arrayBidimensionalesNombres {
    public static void main(String[] args) {

        // creamos un array con los nombres
        String[][] nombres = { { "Jorge", "Eli", "Paleolitico" }, { "Anjo", "GorgeMouro", "Aaron" },
                { "Gosendo", "Josema", "MariGosenda" } };
        // creamos otro array de tamaño 3x3
        int tamaño[][] = new int[3][3];
        int caracteres=0;

        // bucle para mostrar los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Fila " + i + " : ");
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // bucle para imprimir el segundo bucle
        for (int i = 0; i < tamaño.length; i++) {
           
            for (int j = 0; j < tamaño[i].length; j++) {
                //creamos la varible para guardar los caracteres de cada palabra
                 caracteres = nombres[i][j].length();
                 // le metemos los datos en el segundo array
                 tamaño[i][j]=caracteres;
              
            }
            System.out.println();
        }

        // mostrar poor pantalla el 2 array
         for (int i = 0; i < tamaño.length; i++) {
            System.out.print("Fila " + i + " : ");
            for (int j = 0; j < tamaño[i].length; j++) {
                //creamos la varible para guardar los caracteres de cada palabra
                
                System.out.print(tamaño[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

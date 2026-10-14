
public class sumacincuentaprimeros {

    public static void main(String[] args) {
        int i;
        int suma=0;
        int contador = 0;
        for (i = 0; i <= 50; i++) {

            contador++;
            suma = i +suma;
        }
        System.out.println("el resultado de la suma de los primeros 50 numeros es: "+ suma);
    }
}

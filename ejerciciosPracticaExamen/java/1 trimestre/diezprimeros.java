
public class diezprimeros {

    public static void main(String[] args) {

        int contador = 0;
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            contador++;
            if (i % 2 != 0) {
                contador++;
                mult = i * mult;
               
            } 

        }
System.out.println("el resultado de la multiplicacion es: " +mult);
    }
}

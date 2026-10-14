
public class Procesador {

    public static void fortaleza(String cadenaComprobar) {
        boolean caracterRaro = false;
        for (int i = 0; i < cadenaComprobar.length(); i++) {
            char caracteres = cadenaComprobar.charAt(i);
           //solo comprueba que no sea solo letras
            if (!Character.isLetter(caracteres)) {
                caracterRaro = true;
            }

        }

        if (cadenaComprobar.length() > 6 && caracterRaro) {
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La cadena no es segura");
        }
    }

    public static String Formatear(String cadenaComprobar) {
        // el trim limpia los espacios del principio y del final
        String cadenaLimpia = cadenaComprobar.trim();
        String cadenaLimpiaMayusculas = cadenaLimpia.toUpperCase();
        return cadenaLimpiaMayusculas;
    }

    public static String Censurar(String cadenaComprobar) {
        // tengo que hacerlo dos veces para que me cambie mayusculas y minusculas porque no quiero pasar toda la cadena a  mayusculas ni toda la cadena a minusculas
        String cadenaCambiada = "";
        cadenaCambiada = cadenaComprobar.replace('a', '@');
        cadenaCambiada = cadenaCambiada.replace('A', '@');
        cadenaCambiada = cadenaCambiada.replaceAll("[0-9]", "#");

        return cadenaCambiada;

    }

    public static int Vocales(String cadenaComprobar){
        String vocales = "aeiouAEIOU"; 
        int contador =0;
        for (int i = 0; i < cadenaComprobar.length(); i++) {
            char caracteres = cadenaComprobar.charAt(i);
           // el propio metodo devulve el -1
            if(vocales.indexOf(caracteres)!=-1){
                contador++;
            }
    }
    return contador;

}
}

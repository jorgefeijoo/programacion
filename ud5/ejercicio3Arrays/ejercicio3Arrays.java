package ejercicio3Arrays;

public class ejercicio3Arrays {

    public static int contarVocais() {
        char[] palabras = { 'a', 'E', 'i', 'o', 'u', 'c', 'j' };
        int contador = 0;
        int i = 0;

        for (i = 0; i < palabras.length; i++) {
            char c =Character.toLowerCase(palabras[i]);
            char caracteres= c;

            if (caracteres == 'a'|| caracteres == 'e' || caracteres == 'i'|| caracteres=='o'||caracteres=='u') {
                contador++;
           

        }

        
    }
    return contador;
}

    public static void main(String[] args) {
        System.out.println("El numero de vocales del array es: " + contarVocais());
    }

}

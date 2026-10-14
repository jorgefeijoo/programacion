
public class palabrasTexto {

    public static void analizarCodigo(String texto) {

        int caracteres = texto.length();
        int instrucion = 0;
        int saltoLinea = 0;
        int palabras = 0;
        int posicion;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.indexOf(';') != -1) {
                instrucion++;
               posicion= texto.indexOf(';',i);
                i=posicion;
            }
        }

        for (int i = 0; i < texto.indexOf('\n',i); i++) {
            if (texto.indexOf('\n') != -1) {
                saltoLinea++;
                posicion= texto.indexOf('\n',i);
                i=posicion;
            }
        }
        for (int i = 0; i < texto.indexOf(' ',i); i++) {
            if (texto.indexOf(' ') != -1) {
                palabras++;
                posicion= texto.indexOf(' ',i);
                i=posicion;

            }
        }

        System.out.println("el numero de instruciones es: " + instrucion);
        System.out.println("El numero de caracteres del texto es:  " + caracteres);
        System.out.println("El numero de cambios de linea del texto es: " + saltoLinea);
        System.out.println("El numero de palabras es: " + palabras);

    }

    public static void main(String[] args) {
        String texto = "\"int base = 10;\\nint altura = 5;\\nint area\n = base * altura;\\nSystem.out.println\n ( area );\";";
        palabrasTexto.analizarCodigo(texto);
    }
}

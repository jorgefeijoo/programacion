
import java.util.Scanner;

public class validacionTextos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String texto = sc.nextLine();

        if (texto.contains("@")&&texto.contains(".")&&!texto.startsWith("@")&&!texto.endsWith("@")) {
            System.out.println("La cadena es correcta ");
        } else {
            System.out.println("La cadena no es correcta");
        }


        StringBuilder sb = new StringBuilder(texto.toLowerCase());
        for(int i=0;i<sb.length();i++){
          char caracteres=sb.charAt(i);
          if (caracteres=='a'||caracteres=='e'||caracteres=='i'||caracteres=='o'||caracteres=='u') {
            sb.deleteCharAt(i);
          }else if (caracteres==' ') {
            sb.setCharAt(i,'_');
          }
        }

        System.out.println("La cadena finales: " + sb);
        


    }
}

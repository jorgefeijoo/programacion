
import java.util.Scanner;

public class ejercicioSpam {

    public static void main(String[] args) {
        int peticionComentarios = -1;
        int menu = 0;
        String comentarioComprobar = "";
        Scanner sc = new Scanner(System.in);

        while (peticionComentarios < 1 || peticionComentarios > 10) {

            try {
                System.out.print("¿Cuantos comentarios quieres moderar? (entre 0 y 10 ): ");
                peticionComentarios = sc.nextInt();
                if (peticionComentarios == 0) {
                    System.out.println("Apagando sistema...");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Solo se pueden introducir numeros");
            }

        }

        try {

            while (menu != 5) {
                System.out.println("===MODERADOR JAVAGRAM v1.0 ===");
                System.out.println("1. Validar longitud ");
                System.out.println("2. Detectar SPAM");
                System.out.println("3. Extraer el primer Hashtag");
                System.out.println("4. Capitalizar frase");
                System.out.println("5. Salir");
                System.out.print("La opcion que estas marcando es: ");
                menu = sc.nextInt();
                sc.nextLine();

                if (menu == 5) {
                    System.out.println("Apagando Sistema...");
                    return;
                }
                if (menu < 1 || menu > 4) {
                    System.out.println("Entrada Invalida");
                    continue;
                }

                for (int i = 0; i < peticionComentarios; i++) {
                    System.out.print("Introduce el comentario: ");
                    comentarioComprobar = sc.nextLine();
                    switch (menu) {
                        case 1:
                            Moderador.validarLongitud(comentarioComprobar);

                            break;
                        case 2:
                            if (Moderador.detectarSpam(comentarioComprobar)) {
                                System.out.println("Este comentario es spam");
                            } else {
                                System.out.println("Este comentario no es spam");
                            }

                            break;
                        case 3:
                            

                            break;
                        case 4:
                            System.out.println(Moderador.capitalizarFrase(comentarioComprobar));
                            break;
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("Solo se pueden introducir numeros");
        }

    }
}

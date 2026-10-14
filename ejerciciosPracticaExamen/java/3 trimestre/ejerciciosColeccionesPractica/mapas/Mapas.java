
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Mapas {

    public static void main(String[] args) {
        Map<String, String> mapilla = new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
            int menu = 0;
            String dni= " ";
            String nombre= " ";
            String nombreCambiar;

            while (menu != 5) {
                System.out.println("1 .Dar de alta a un empleado");
                System.out.println("2. Buscar por DNI exacto");
                System.out.println("3. Buscar empleados por nombre");
                System.out.println("4. Actualizar Nombre");
                System.out.println("5. Salir");
                System.out.print("La opcion que estas introduciendo es: ");
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.print("Introduce el dni: ");
                        dni = sc.nextLine();
                        System.out.print("Introduce el nombre: ");
                        nombre = sc.nextLine();

                        if (!(mapilla.containsKey(dni))) {
                            mapilla.put(dni, nombre);
                        }else{
                            System.out.println("Ya existe ese empleado");
                        }

                        
                        break;

                    case 2:
                        System.out.print("Introduce el dni del que quieres buscar");
                        dni = sc.nextLine();
                        if (mapilla.containsKey(dni)) {
                            System.out.println("dni: " +dni + " Nombre: " +mapilla.get(dni));
                        } else {
                            System.out.println("No existe ninguno que tenga ese DNI");
                        }

                        break;

                    case 3:
                         System.out.print("Introduce el nombre del empregado que quieres buscar: ");
                         String nombreBuscar = sc.nextLine();
                        for (Entry<String, String> empleados : mapilla.entrySet()) {
                            if (empleados.getValue().startsWith(nombreBuscar)) {
                                System.out.println("dni:" +empleados.getKey() + " nombre: " + empleados.getValue());
                            }
                        }

                        break;

                    case 4:
                         System.out.print("Introduce el dni de la persona a la que le quieres cambiar el nombre: ");
                         dni=sc.nextLine();
                         System.out.print("Introduce el nuevo nombre del empregado: ");
                         nombreCambiar = sc.nextLine();
                         if (mapilla.containsKey(dni)) {
                            mapilla.put(dni, nombreCambiar);
                         }else{
                            System.out.println("No existe ese empleado");
                         }
                        break;

                    case 5:
                        System.out.println("Cerrando menu ... ");
                        return;

                    default:
                        break;
                }
            }
        }

    }
}

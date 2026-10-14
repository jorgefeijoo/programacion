/*Enunciado: Actividades Extraescolares
Un instituto quiere analizar los estudiantes matriculados en dos actividades extraescolares diferentes: "Robótica" y "Teatro". Cada estudiante tiene un nombre y un número de matrícula (ID).
Queremos realizar lo siguiente utilizando la clase HashSet:

a) Crear dos conjuntos de estudiantes (uno para Robótica y otro para Teatro) e introducir datos de prueba.

b) Mostrar todos los estudiantes matriculados en cada una de las actividades.

c) Obter la intersección: Mostrar qué estudiantes están apuntados a ambas actividades a la vez.

d) Obter la unión: Mostrar la lista completa de todos los estudiantes que participan en al menos una actividad (sin que aparezcan duplicados).

e) Obter la diferencia: Mostrar los estudiantes que van exclusivamente a Robótica (y no a Teatro), y viceversa. */
import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        //creamos las colecciones
        Set<Estudiante> robotica = new HashSet<>();
        Set<Estudiante> teatro = new HashSet<>();
        Set<Estudiante> soloTeatro = new HashSet<>();
        Set<Estudiante> soloRobotica = new HashSet<>();

        //creamos objetos y metemos los elementos
        Estudiante e1 = new Estudiante("1", "gosendo");
        Estudiante e2 = new Estudiante("2", "sulio");
        Estudiante e3 = new Estudiante("3", "eli");
        Estudiante e5 = new Estudiante("5", "anso");

        robotica.add(e1);
        robotica.add(e3);

        teatro.add(e2);
        teatro.add(e1);
        teatro.add(e5);

        //creo los otros set aqui para que tomen los valores que le  di arriba
        Set<Estudiante> interseccion = new HashSet<>(robotica);
        Set<Estudiante> union = new HashSet<>(robotica);

        System.out.println("Estudiantes de robotica \n");
        for (Estudiante robotiquilla : robotica) {
            System.out.println(robotiquilla);
        }

        System.out.println("\nEstudiantes de Teatro \n");
        for (Estudiante teatrillo : teatro) {
            System.out.println(teatrillo);
        }

        System.out.println("\nInterseccion\n");
        //retainAll para la interseccion
        interseccion.retainAll(teatro);
        System.out.println(interseccion);

        System.out.println("\nUnion\n");
        //addAll para añadir todo
        union.addAll(teatro);
        System.out.println(union);

        System.out.println("\nDiferencia\n");

        //recorro el set y compruebo si no esta en el otro si no esta los añado
        for (Estudiante robotiquilla : robotica) {
            if (!(teatro.contains(robotiquilla))) {
                soloRobotica.add(robotiquilla);
            }
        }
        System.out.println(soloRobotica);

        for (Estudiante teatrillo : teatro) {
            if (!(robotica.contains(teatrillo))) {
                soloTeatro.add(teatrillo);
            }
        }

        System.out.println(soloTeatro);

    }
}

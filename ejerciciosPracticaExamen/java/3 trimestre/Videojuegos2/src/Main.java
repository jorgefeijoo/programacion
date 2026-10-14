
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Personaje> colaTurnos = new LinkedList<>();

        Caballero c1 = new Caballero("Gosendo", 100);
        Mago m1 = new Mago("magoPajas", 100);
        Ogro o1 = new Ogro("Paleolitico", 100);
        Muñeco mun1 = new Muñeco("Mierda", 100);

        colaTurnos.add(c1);
        colaTurnos.add(o1);
        colaTurnos.add(m1);

        for (int i = 0; i <= 5; i++) {
            Personaje personaje = colaTurnos.poll();
            personaje.atacar(mun1);
            colaTurnos.add(personaje);
        }

    }
}

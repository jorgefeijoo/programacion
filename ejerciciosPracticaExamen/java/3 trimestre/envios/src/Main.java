
import java.util.HashSet;

/*Paso 4: El Programa Principal (El test de fuego)
Crea una clase LogisticaApp con un método main. Aquí es donde la magia ocurre:

Evitando duplicados (Uso del HashSet):

Crea un HashSet<Envio> llamado registroDiario.

Instancia 3 paquetes (mezcla Urgentes y Estándar).

La trampa: Crea dos de esos paquetes con el mismo codigoLocalizador pero distinto peso o destinatario.

Añade los 3 al HashSet. Si programaste bien el equals y hashCode, el tamaño del Set debería ser 2, no 3.

Ligadura Dinámica y Polimorfismo:

Usa un bucle for-each para recorrer el HashSet.

El bucle debe usar la referencia de la superclase (Ej: for(Envio paquete : registroDiario)).

Dentro del bucle, llama al método paquete.imprimirEtiqueta(). Verás cómo Java sabe exactamente qué versión del método ejecutar (si la de Urgente o la de Estándar) dependiendo del objeto real que haya en la memoria.

Ordenamiento (Uso del compareTo):

Como no puedes usar TreeSet para ordenar automáticamente (por las reglas de tu examen), crea un Array clásico de envíos: Envio[] arrayEnvios = registroDiario.toArray(new Envio[0]);

Utiliza el método estático de Java Arrays.sort(arrayEnvios);.

Imprime los pesos de los paquetes del array. Si el compareTo está bien programado, se imprimirán ordenados de menos pesado a más pesado. */
public class Main {

    public static void main(String[] args) {
        HashSet<Envio> registrilloDiario = new HashSet<>();

        Destinatario d1 = new Destinatario("sulio", "12345678A", "Santa Combilla");
        Destinatario d2 = new Destinatario("pepe de xan", "92345678B", "San Saborido");

        EnvioUrgente eu1 = new EnvioUrgente(10, "1243", 150.5, d1);
        EnvioEstandar ee1 = new EnvioEstandar("10", 25.4, d1, 5);
        EnvioEstandar ee2 = new EnvioEstandar("10", 55.4, d2, 8);

        registrilloDiario.add(eu1);
        registrilloDiario.add(ee1);
        registrilloDiario.add(ee2);

        for (Envio envio : registrilloDiario) {
            System.out.println(envio);
            if (envio instanceof Envio) {
                envio.imprimirEtiqueta();
            }
        }
    }
}

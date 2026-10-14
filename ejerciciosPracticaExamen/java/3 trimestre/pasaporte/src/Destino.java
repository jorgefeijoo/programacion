import java.util.Objects;

public class Destino {

    private String ciudadDestino;
    private String pais;

    public Destino(String ciudadDestino, String pais) {
        this.ciudadDestino = ciudadDestino;
        this.pais = pais;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ciudad: " + ciudadDestino + " Pais: " + pais;
    }

    // hashCode genera un número entero (ID de cajón/bucket) basado en los datos del objeto,
    // NO es una dirección de memoria. Ayuda a colecciones como HashSet a buscar rápido.
    @Override
    public int hashCode() {
        return Objects.hash(ciudadDestino, pais);
    }

    // equals comprueba si el contenido (ciudad y país) de dos objetos es exactamente el mismo,
    // descartando que sean el mismo objeto en memoria o que sean de clases diferentes.
    @Override
    public boolean equals(Object o) {
        // 1. ¿Son la misma referencia en memoria? (Esto es lo que te salvó en tu prueba)
        if (this == o) {
            return true; 
        }
        
        // 2. ¿Es nulo o es de una clase distinta?
        if (!(o instanceof Destino)) {
            return false; 
        } 
        
        // 3. Casteo: Convertimos el Object genérico 'o' a tipo 'Destino'
        Destino otroDestino = (Destino) o;
        
        // 4. Comparamos los atributos reales (mi ciudad con su ciudad, mi país con su país)
        return Objects.equals(this.ciudadDestino, otroDestino.ciudadDestino) && 
               Objects.equals(this.pais, otroDestino.pais);
    }
}
/*Paso 2: Superclase Abstracta y Sobrescritura de Métodos Core
La Clase Abstracta Envio:

Crea una clase abstracta Envio que implemente las interfaces Facturable y Comparable<Envio>.

Atributos: codigoLocalizador (String), peso (double) y un objeto receptor (de tipo Destinatario -> ¡Aquí tienes la composición!).

Constructor: Inicializa todos los atributos. (Acuérdate de hacer una copia del destinatario para preservar la ocultación).

Los métodos clave (equals, hashCode, compareTo):

equals y hashCode: Sobrescribe ambos métodos basándote única y exclusivamente en el codigoLocalizador. Dos envíos son el mismo paquete si tienen el mismo localizador, sin importar su peso.

compareTo: Sobrescribe el método para definir el orden natural de los envíos según su peso (de menor a mayor). */

import java.util.Objects;

public abstract class Envio implements Comparable<Envio>, Facturable {

    private String codigoLocalizador;
    private double peso;
    private Destinatario destinatario;

    public Envio(String codigoLocalizador, double peso, Destinatario destinatario) {
        this.codigoLocalizador = codigoLocalizador;
        this.peso = peso;
        this.destinatario = destinatario;
    }

    public String getCodigoLocalizador() {
        return codigoLocalizador;
    }

    public void setCodigoLocalizador(String codigoLocalizador) {
        this.codigoLocalizador = codigoLocalizador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoLocalizador);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Envio other = (Envio) obj;
        if (this.getCodigoLocalizador().equals(other.getCodigoLocalizador())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int compareTo(Envio o) {
        Envio other =  o;
        if (this.getPeso() > other.getPeso()) {
            return 1;
        } else if (this.getPeso() < other.getPeso()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Envio [codigoLocalizador=" + codigoLocalizador + ", peso=" + peso + ", destinatario=" + destinatario
                + "]";
    }

}

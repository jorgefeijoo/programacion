
/*Paso 3: Subclases y Polimorfismo
Clase EnvioUrgente:

Hereda de Envio (extends Envio).

Añade el atributo específico seguroAdicional (double).

Implementa los métodos de la interfaz Facturable:

calcularTarifa(): La tarifa es el peso * 5.0 + el seguroAdicional.

imprimirEtiqueta(): Muestra por pantalla "URGENTE - Destino: [ciudad] - Tarifa: [resultado del cálculo]". */
public class EnvioUrgente extends Envio implements Facturable {

    private double seguroAdicional;

    public EnvioUrgente(double seguroAdicional, String codigoLocalizador, double peso, Destinatario destinatario) {
        super(codigoLocalizador, peso, destinatario);
        this.seguroAdicional = seguroAdicional;
    }

    @Override
    public double calcularTarifa() {
        double total = (this.getPeso() * 5) + this.getSeguroAdicional();
        return total;
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println("Urgente - Destino: Castenda -Tarifa: " + calcularTarifa());
    }

    public double getSeguroAdicional() {
        return seguroAdicional;
    }

    public void setSeguroAdicional(double seguroAdicional) {
        this.seguroAdicional = seguroAdicional;
    }

}

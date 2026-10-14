
public class EnvioEstandar extends Envio {

    private int diasEstimados;

    public EnvioEstandar(String codigoLocalizador, double peso, Destinatario destinatario, int diasEstimados) {
        super(codigoLocalizador, peso, destinatario);
        this.diasEstimados = diasEstimados;
    }

    @Override
    public double calcularTarifa() {
        return this.getPeso() * 0.2;
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println("ESTÁNDAR " + this.getDiasEstimados() + " días - DESTINO : SAR");
    }

    public int getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(int diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

}

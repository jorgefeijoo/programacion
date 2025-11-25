public class Conta {
    // creamos os atributos
    private String idConta;
    private String titular;
    private double saldo;
    private String ultimoMovemento;
    public boolean resultado;

    // creamos o metodo movemento
    public boolean movemento(boolean tipo, double valor, String concepto) {
        // creo a condicion para que se imprima si debe o tiene segun el tipo
        if (tipo == true) {
            System.out.println("Haber");
        } else {
            System.out.println("Deber");
        }
        // creo una condicion para que si debe
        if (tipo == true) {
            saldo = saldo + valor;
        } else {
            saldo = saldo - valor;
        }
        // le meto el valo del concepto a la variable
        ultimoMovemento = concepto;
        // pongo la condicion para saber si el saldo de la cuenta es positivo o es
        // negativo
        if (saldo >= 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return tipo;

    }

    public void amosarInformacion() {
        System.out.println("O id da conta e: " + getIdConta());
        System.out.println("O titular  da conta e: " + getTitular());
        System.out.println("O saldo da conta e: " + getSaldo());
        System.out.println("O ultimo movemento da conta e: : " + getUltimoMovemento());
    }

    // creamos o contructor por defecto
    public Conta() {

    }

    // creamos o constructor
    public Conta(String idC, String t, double s) {
        idConta = idC;
        titular = t;
        saldo = s;
    }

    public void setIdConta(String idC) {

        idConta = idC;
    }

    public void setUltimoMovemento(String ultimoMovemento) {
        this.ultimoMovemento = ultimoMovemento;
    }

    public void setTitular(String t) {
        titular = t;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getIdConta() {
        return idConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getUltimoMovemento() {
        return ultimoMovemento;
    }

    public boolean getResultado() {
        return resultado;
    }
}
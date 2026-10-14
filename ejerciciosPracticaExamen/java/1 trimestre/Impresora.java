
public class Impresora {

    private String modelo;
    private int folios;
    private int tinta;

    public Impresora(String modelo, int folios, int tinta) {
        this.modelo = modelo;
        this.folios = folios;
        this.tinta = tinta;
    }

    public Impresora() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFolios() {
        return folios;
    }

    public void setFolios(int folios) {
        this.folios = folios;
    }

    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }

    //creacion de los metodos
    public void imprimir(int cantidad) {
        for (int i = 1; i < cantidad; i++) {
            if (folios >= 0 && tinta >= 0) {
                folios -= 1;
                tinta -= 5;
            } if(folios==0||tinta==0){
                break;
            }
        }
        if(folios<=0||tinta<=0) {
                System.out.println("No se puede imprimir prueba a recargarla");
            }
     }

public void situacion(){
System.out.println("El modelo de la impresora es "+getModelo()+" los folios que le quedan son "+ getFolios()+" la tinta que le quedan es "+ tinta);
}










    }

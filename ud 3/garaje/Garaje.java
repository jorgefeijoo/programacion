public class Garaje {
    private int nprazas;
    private int ocupadas;
// creamos los constructures
    public Garaje(){

    }
    public void Garaje(int nprazas,int ocupadas){
        this.nprazas=nprazas;
        this.ocupadas=ocupadas;
    }
    // creamos os setters e os getters
    public void setNprazas(int nprazas){
        this.nprazas=nprazas;
    }
    public void setOcupadas(int ocupadas){
        this.ocupadas=ocupadas;
    }
    public int getNprazas(int nprazas){
        return nprazas;
    }
    public int getOcupadas( int ocupadas){
        return ocupadas;
    }
}

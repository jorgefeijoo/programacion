public class Garaje {
    private int nprazas;
    private int ocupadas;

//creamos os metodos
    
    public void entrarCoches(){
    int i;
    int contador=0;
    for( i=getOcupadas(ocupadas);i<getNprazas(nprazas);i++){
     contador++;       
    }
    System.out.println("O numero de coches que pueden entrar es  " + contador);
}
public void salirCoches(){

}
public void situacion(){
    System.out.println("El numero de coches que hay es: "+getOcupadas(ocupadas)+" El numero de plazaas libres es: " +getNprazas(nprazas));
}


    // creamos los constructures
public Garaje(){
    
}
    
    
    public  Garaje(int nprazas,int ocupadas){
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

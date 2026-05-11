public class Rectangulo {
  // creamos os atributos 
    private double base;
    private double altura;
// creamos o constructor baleiro
public Rectangulo(){

}
//creamos o noso constructor
public Rectangulo(double base, double altura){
this.base=base;
this.altura=altura;
}

// creamos os metodos
public double getArea(){
double area= base*altura;
return area;

}
public boolean isCuadrado(){
    if (base==altura){
      return true;  
    } else {
    return false;
    }
    public String toString(){
        return "area" = this.getArea()+"e a altura"+this.getAltura();
    }
       
}


// creamos o getters e os setters
public void setBase(double base){
    this.base=base;

}
public void setAltura(double altura){
this.altura=altura;
}
public double getAltura(){
    return altura;
}
public double getBase(){
    return base;
}



}
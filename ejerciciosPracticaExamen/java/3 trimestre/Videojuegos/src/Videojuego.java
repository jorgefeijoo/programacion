public class Videojuego implements Comparable {

    private String titulo;
    private int añoLanzamiento;

    public Videojuego(String titulo,int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
        this.titulo = titulo;
    }
   

    @Override 
    public String toString(){
        return "El titulo del juego es " + getTitulo() + "el año de lanzamiento del juego es: " + getAñoLanzamiento();
    }


    @Override
    public int compareTo(Object o) {
        Videojuego vidAuxiliar = new Videojuego("The Witcher 3 ", 2015);
       if(this.añoLanzamiento< vidAuxiliar.getAñoLanzamiento()){
        return -1;
       }

       if (this.añoLanzamiento>vidAuxiliar.getAñoLanzamiento()) {
        return 1;
       }

       return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    
}

public abstract class Personaje {
    private String nombre;
    private int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int nuevaVida) {
        this.puntosVida = nuevaVida;
    }

    public abstract void atacar(Personaje Objetivo);

    
    

    
}

public class Ogro extends Personaje {

    public Ogro(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    @Override
    public void atacar(Personaje Objetivo) {
       int vidaActual=this.getPuntosVida();
        int vidaRestante=vidaActual-10;
        Objetivo.setPuntosVida(vidaRestante);

        System.out.println(Objetivo.getNombre() + " se queda con " + Objetivo.getPuntosVida() + " HP.");
    }
    
}

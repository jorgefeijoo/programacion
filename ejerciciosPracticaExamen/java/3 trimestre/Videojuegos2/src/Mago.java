
public class Mago extends Personaje {

    public Mago(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    @Override
    public void atacar(Personaje Objetivo) {
        int vidaActual = this.getPuntosVida();
        int vidaRestante = vidaActual - 20;
        Objetivo.setPuntosVida(vidaRestante);

        System.out.println(Objetivo.getNombre() + " se queda con " + Objetivo.getPuntosVida() + " HP.");
    }

}

public class Muñeco extends Personaje {

    public Muñeco(String nombre, int puntosVida) {
        super(nombre, puntosVida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar(Personaje Objetivo) {
        System.out.println("se queda con " + getPuntosVida() + " de vida");
    }
    
}

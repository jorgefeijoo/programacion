/*2. Crear a clase Serie:
Atributos:
- titulo
- numeroTempadas (por defecto 3)
- prestado (por defecto false)
- xenero
- creador
Métodos:
- construtor por defecto
- getters e setters (excepto de prestado)
- toString()
- entregar()
- devolver()
- isEntregado()
- compareTo() → compara o número de tempadas */

public class Serie implements Entregable , Comparable<Serie> {

    private String titulo;
    private int numeroTempadas = 3;
    private boolean prestado;
    private String xenero;
    private String creador;

    public Serie(String creador, boolean prestado, String titulo, String xenero, int numeroTempadas) {
        this.creador = creador;
        this.prestado = prestado;
        this.titulo = titulo;
        this.xenero = xenero;
        this.numeroTempadas=numeroTempadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTempadas() {
        return numeroTempadas;
    }

    public void setNumeroTempadas(int numeroTempadas) {
        this.numeroTempadas = numeroTempadas;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

  

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", numeroTempadas=" + numeroTempadas + ", prestado=" + prestado + ", xenero="
                + xenero + ", creador=" + creador + "]";
    }

    @Override
    public void entregar() {
        System.out.println("A serie fue entregado");
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("A serie foi devolto");
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return prestado;
    }

    @Override
    public int compareTo(Serie o) {
       Serie s1 = o;

       if (this.getNumeroTempadas()<s1.getNumeroTempadas()) {
        return -1;
       }
       else if (this.getNumeroTempadas()<s1.getNumeroTempadas()) {
        return 1;
       }
       else{
        return  0;
       }
    }
   


}

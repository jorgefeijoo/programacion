/*3. Crear a clase Videoxogo:
Atributos:
- titulo
- horasEstimadas (por defecto 10)
- prestado (por defecto false)
- xenero
- compania
Métodos:
- construtor por defecto
- getters e setters (excepto de prestado)
- toString()
- entregar()
- devolver()
- isEntregado()
- compareTo() → compara as horas estimadas */
public class Videojuego implements Entregable ,Comparable<Videojuego> {
    private String titulo;
    private int horasEstimadas=10;
    private boolean prestado=false;
    private String xenero;
    private String compania;

    public Videojuego() {
    }

    public Videojuego(String compania, String titulo, String xenero,int horasEstimadas) {
        this.compania = compania;
        this.titulo = titulo;
        this.xenero = xenero;
        this.horasEstimadas=horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", prestado=" + prestado
                + ", xenero=" + xenero + ", compania=" + compania + "]";
    }

   @Override
    public void entregar() {
        System.out.println("O videojuego fue entregado");
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("O videojuego foi devolto");
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return prestado;
    }

    @Override
    public int compareTo(Videojuego o) {
       Videojuego v1 = o;
       if (this.getHorasEstimadas()<v1.getHorasEstimadas()) {
        return -1;
       }else if (this.getHorasEstimadas()>v1.getHorasEstimadas()) {
        return 1;
       }else{
        return 0;
       }
    }
}

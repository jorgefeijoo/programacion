public class Libro {
    private String Signatura;
    private String Titulo;
    private String Editorial;
    private String Autor;
    private long ISBN;
    private int Paxinas;
// creamos o constructor para meterle unos datos
    public Libro(String Autor, String Editorial, long ISBN, int Paxinas, String Signatura, String Titulo) {
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISBN = ISBN;
        this.Paxinas = Paxinas;
        this.Signatura = Signatura;
        this.Titulo = Titulo;
    }

    public Libro() {
    }

    // Constructor sencillo donde solamente se la pasa signatura para poder realizar c'omodamente operaciones de borrado y b'usqueda
    public Libro(String signatura) {
        this.setSignatura(signatura);
    }

    public String getSignatura() {
        return Signatura;
    }

    public final void setSignatura(String Signatura) {
        this.Signatura = Signatura;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaxinas() {
        return Paxinas;
    }

    public void setPaxinas(int Paxinas) {
        this.Paxinas = Paxinas;
    }

    @Override
    public boolean equals(Object lib){
        // compara que el objeto pertenezca a la clase Libro
        if (!(lib instanceof Libro)){
            return false;
        }
        return Signatura.equals(((Libro)lib).Signatura);
    }

    @Override
    public String toString(){
        return this.getTitulo() + " " + this.getAutor() + " " + this.getEditorial() + " " + this.getISBN() + " " + this.getSignatura() + " " + this.getPaxinas();
    }



    /*
    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < this.Signatura.length(); i++) {
            hash += this.Signatura.charAt(i);
        }
        return hash;
    }
    */

}

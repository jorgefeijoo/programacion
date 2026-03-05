public class Libro {
    private String Signatura;
    private String Titulo;
    private String Editorial;
    private String Autor;
    private String ISBN;
    private int Paxinas;
// creamos o constructor para meterle unos datos
    public Libro(String Autor, String Editorial, String ISBN, int Paxinas, String Signatura, String Titulo) {
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISBN = ISBN;
        this.Paxinas = Paxinas;
        this.Signatura = Signatura;
        this.Titulo = Titulo;
    }

    public Libro() {
    }

    public String getSignatura() {
        return Signatura;
    }

    public void setSignatura() {
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
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
        boolean resultado=false;

// compara que el objeto pertenezca a la clase Libro
        if(lib instanceof Libro){
            // comparamos si un libro tiene el mismo Isbn se pone a true
        resultado = ISBN.equals(((Libro)lib).ISBN);
        }
        
        return resultado;
        
    }

}

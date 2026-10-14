
public class Destinatario {

    private String nombre;
    private String dni;
    private String ciudad;

    public Destinatario() {
    }

    public Destinatario(String nombre, String dni, String ciudad) {
        this.nombre = nombre;
        this.dni = dni;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Destinatario [nombre=" + nombre + ", dni=" + dni + ", ciudad=" + ciudad + "]";
    }

}

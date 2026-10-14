/*1. Creación de la Excepción Propia
Crea una clase llamada AforoCompletoException que herede de la clase Exception.
Escribe un constructor para esta clase que reciba un argumento String (el mensaje de error) y lo almacene en una variable. Escribe también un método llamado obtenerDetalle() que devuelva esa cadena de caracteres. */

public class AforoCompletoExcepcion extends Exception {

    String mensajePersonalizado = "";

    public AforoCompletoExcepcion(String message) {
        super(message);
        mensajePersonalizado = message;
    }

    public String obtenerDetalle() {
        return mensajePersonalizado;
    }

    

}

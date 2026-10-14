/*
2. Creación de la lógica del programa (Propagación)
Crea una clase principal llamada Taquilla. Dentro de ella, crea un método llamado venderEntradas(int entradasDisponibles, int cantidadDeseada) que devuelva el número de entradas que quedan disponibles tras la venta.

Si la cantidadDeseada es menor o igual a 0, el método debe lanzar una excepción IllegalArgumentException con el mensaje "Debes comprar al menos 1 entrada."

Si la cantidadDeseada es mayor que las entradasDisponibles, el método debe lanzar tu propia excepción AforoCompletoException con el mensaje "No hay suficiente aforo. Solo quedan [X] entradas." (sustituyendo [X] por el número real).

Nota: Estas excepciones no se deben capturar en este método, sino que deben propagarse al método llamante usando la cláusula throws. */

public class Taquilla {

    public static int venderEntradas(int entradasDisponibles, int cantidadDeseada) throws AforoCompletoExcepcion  {
       
        if (cantidadDeseada <= 0) {
            throw new IllegalArgumentException("Debes comprar al menos 1 entrada");
        } else if (cantidadDeseada > entradasDisponibles) {
            throw new AforoCompletoExcepcion("No hay suficiente aforo quedan " + entradasDisponibles + " entradas ");
        } else if (entradasDisponibles <= 0) {
            throw new IllegalArgumentException("No quedan entradas disponibles");
        } else {
             entradasDisponibles = entradasDisponibles - cantidadDeseada;
            return entradasDisponibles;
        }

    }
}

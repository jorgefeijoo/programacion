/*Ejercicio: Gestión de Videojuegos con ArrayList
Parte 1: Crear la clase Videojuego
Crea una clase llamada Videojuego que tenga los siguientes atributos:

titulo (String)

consola (String)

precio (double)

Debes implementar:

Un constructor que inicialice todos los atributos.

Los métodos getters para acceder a los atributos.

Un método llamado mostrarJuego() que imprima por pantalla los datos del videojuego de forma legible (ej. "Zelda - Switch - 59.90€").

Parte 2: Crear la clase Principal (Main)
En el programa principal (el public static void main), debes realizar las siguientes acciones en orden:

Crear una lista (ArrayList) que guarde objetos de tipo Videojuego.

Crear y añadir al menos 4 videojuegos diferentes a la lista.

Recorrer la lista y mostrar por pantalla todos los videojuegos (usando el método mostrarJuego()).

Recorrer la lista y mostrar SOLO los videojuegos que cuesten menos de 40 euros.

Borrar por índice: Elimina de la lista el videojuego que está en la posición 1 (recuerda que los índices empiezan en 0).

Borrar por valor: Elimina de la lista un videojuego pasándole el objeto exacto (ej. borra el juego 3 pasándole la variable donde lo guardaste).

Volver a mostrar la lista completa para comprobar que esos dos juegos han desaparecido correctamente. */

public class videojuego {

    private String videojuego;
    private String consola;
    private double precio;

    public videojuego(String consola, double precio, String videojuego) {
        this.consola = consola;
        this.precio = precio;
        this.videojuego = videojuego;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
@Override
    public String toString() {
        return " consola: " + consola + " precio: " + precio + " videojuego: " + videojuego;
    }

}

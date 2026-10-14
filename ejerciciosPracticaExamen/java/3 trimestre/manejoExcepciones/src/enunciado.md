Ejercicio de repaso: Sistema de Reserva de Entradas (Excepciones Múltiples y Propias)
1. Creación de la Excepción Propia
Crea una clase llamada AforoCompletoException que herede de la clase Exception.
Escribe un constructor para esta clase que reciba un argumento String (el mensaje de error) y lo almacene en una variable. Escribe también un método llamado obtenerDetalle() que devuelva esa cadena de caracteres.

2. Creación de la lógica del programa (Propagación)
Crea una clase principal llamada Taquilla. Dentro de ella, crea un método llamado venderEntradas(int entradasDisponibles, int cantidadDeseada) que devuelva el número de entradas que quedan disponibles tras la venta.

Si la cantidadDeseada es menor o igual a 0, el método debe lanzar una excepción IllegalArgumentException con el mensaje "Debes comprar al menos 1 entrada."

Si la cantidadDeseada es mayor que las entradasDisponibles, el método debe lanzar tu propia excepción AforoCompletoException con el mensaje "No hay suficiente aforo. Solo quedan [X] entradas." (sustituyendo [X] por el número real).

Nota: Estas excepciones no se deben capturar en este método, sino que deben propagarse al método llamante usando la cláusula throws.

3. El método main(), varios catch y finally
En el método main(), inicializa una variable entradasTotales con un valor de 10.
Crea un bucle que le pida al usuario por teclado cuántas entradas desea comprar. El programa debe seguir preguntando hasta que la compra se realice correctamente.
Debes capturar y gestionar los siguientes errores mostrando un mensaje descriptivo por pantalla:

Que el usuario introduzca letras en lugar de un número (capturando InputMismatchException o NumberFormatException, según cómo uses el Scanner).

La excepción IllegalArgumentException.

La excepción AforoCompletoException.

Añade un bloque finally para imprimir el mensaje "--- Intento de transacción registrado ---" sin importar si hubo error o si la compra fue exitosa.
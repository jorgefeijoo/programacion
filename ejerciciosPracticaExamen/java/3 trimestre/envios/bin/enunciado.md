Ejercicio Práctico: Sistema de Gestión de Envíos
Contexto: Trabajas para una empresa de paquetería. Necesitas un sistema que registre los envíos del día, evite registrar dos veces el mismo paquete por error, calcule automáticamente las tarifas y ordene los paquetes por peso para cargarlos en el camión.

Paso 1: Interfaz y Composición
La Interfaz Facturable:

Crea una interfaz llamada Facturable.

Define los métodos abstractos: double calcularTarifa(); y void imprimirEtiqueta();.

La Clase Destinatario (Composición):

Crea una clase Destinatario con los atributos privados: nombre (String), dni (String) y ciudad (String).

Crea su constructor, getters y setters. (Recuerda: la usaremos como un "componente" dentro de otra clase).



Paso 2: Superclase Abstracta y Sobrescritura de Métodos Core
La Clase Abstracta Envio:

Crea una clase abstracta Envio que implemente las interfaces Facturable y Comparable<Envio>.

Atributos: codigoLocalizador (String), peso (double) y un objeto receptor (de tipo Destinatario -> ¡Aquí tienes la composición!).

Constructor: Inicializa todos los atributos. (Acuérdate de hacer una copia del destinatario para preservar la ocultación).

Los métodos clave (equals, hashCode, compareTo):

equals y hashCode: Sobrescribe ambos métodos basándote única y exclusivamente en el codigoLocalizador. Dos envíos son el mismo paquete si tienen el mismo localizador, sin importar su peso.

compareTo: Sobrescribe el método para definir el orden natural de los envíos según su peso (de menor a mayor).



Paso 3: Subclases y Polimorfismo
Clase EnvioUrgente:

Hereda de Envio (extends Envio).

Añade el atributo específico seguroAdicional (double).

Implementa los métodos de la interfaz Facturable:

calcularTarifa(): La tarifa es el peso * 5.0 + el seguroAdicional.

imprimirEtiqueta(): Muestra por pantalla "URGENTE - Destino: [ciudad] - Tarifa: [resultado del cálculo]".

Clase EnvioEstandar:

Hereda de Envio.

Añade el atributo específico diasEstimados (int).

Implementa los métodos de la interfaz:

calcularTarifa(): La tarifa es el peso * 2.0.

imprimirEtiqueta(): Muestra por pantalla "ESTÁNDAR (" + diasEstimados + " días) - Destino: [ciudad]".



Paso 4: El Programa Principal (El test de fuego)
Crea una clase LogisticaApp con un método main. Aquí es donde la magia ocurre:

Evitando duplicados (Uso del HashSet):

Crea un HashSet<Envio> llamado registroDiario.

Instancia 3 paquetes (mezcla Urgentes y Estándar).

La trampa: Crea dos de esos paquetes con el mismo codigoLocalizador pero distinto peso o destinatario.

Añade los 3 al HashSet. Si programaste bien el equals y hashCode, el tamaño del Set debería ser 2, no 3.

Ligadura Dinámica y Polimorfismo:

Usa un bucle for-each para recorrer el HashSet.

El bucle debe usar la referencia de la superclase (Ej: for(Envio paquete : registroDiario)).

Dentro del bucle, llama al método paquete.imprimirEtiqueta(). Verás cómo Java sabe exactamente qué versión del método ejecutar (si la de Urgente o la de Estándar) dependiendo del objeto real que haya en la memoria.

Ordenamiento (Uso del compareTo):

Como no puedes usar TreeSet para ordenar automáticamente (por las reglas de tu examen), crea un Array clásico de envíos: Envio[] arrayEnvios = registroDiario.toArray(new Envio[0]);

Utiliza el método estático de Java Arrays.sort(arrayEnvios);.

Imprime los pesos de los paquetes del array. Si el compareTo está bien programado, se imprimirán ordenados de menos pesado a más pesado.
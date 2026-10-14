Ejercicio: Gestor y Analizador de Archivos de Texto
Crear una aplicación que permita gestionar y modificar archivos de texto dentro de un directorio de trabajo dado.

El directorio de partida se le solicitará al usuario al iniciar el programa. Sobre este directorio se presentará un menú que permita realizar las siguientes operaciones:

Listar archivos de texto: Deberá buscar e imprimir por pantalla únicamente los archivos (no directorios) que tengan la extensión .txt. Para cada uno, se indicará su nombre, su tamaño en bytes y si tiene permisos de lectura y escritura. Al final, mostrará el total de archivos de texto encontrados.

Leer y analizar un archivo: Se solicitará al usuario el nombre de un archivo del directorio actual. El programa abrirá el archivo, leerá su contenido y lo mostrará por pantalla. Al finalizar, imprimirá un breve resumen indicando el número total de líneas y el número total de caracteres que contiene.

Crear/Sobrescribir un archivo: Se pedirá al usuario el nombre para un nuevo archivo de texto y una frase para guardar en él. El programa creará el archivo y escribirá la frase. Atención: Si el archivo ya existe en el directorio, se le deberá pedir confirmación al usuario antes de sobrescribirlo para no perder datos por accidente.

Añadir texto a un archivo (Append): Se solicitará el nombre de un archivo existente. El programa pedirá al usuario que introduzca una nueva línea de texto y la añadirá al final del archivo seleccionado, conservando intacto todo el contenido que ya tuviera anteriormente.

Generar informe del directorio (Exportar a fichero): El programa creará automáticamente un fichero llamado informe_directorio.txt en la ruta actual. Dentro de este fichero, el programa deberá escribir un listado completo de todas las carpetas y archivos que contiene el directorio, añadiendo en la primera línea la fecha y hora exacta en la que se generó dicho informe.

Cambiar de directorio de trabajo: Solicitará de nuevo al usuario una nueva ruta de directorio para seguir trabajando sobre ella.

Salir de la aplicación: El bucle del menú terminará y el programa se cerrará únicamente al elegir esta opción.
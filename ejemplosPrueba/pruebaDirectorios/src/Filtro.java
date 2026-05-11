import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author
 */
public class Filtro implements FilenameFilter {
    String extension;

    Filtro(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }

public static void main(String[] args) {
try {
File fichero=new File("/media/a25jorgefo/a25jorgefo_documentos/JFO/programacion/ejemplosPrueba/pruebaDirectorios/src");
String[] listadeArchivos;
listadeArchivos = fichero.list(new Filtro(".txt"));
int numarchivos = listadeArchivos.length ;
if (numarchivos < 1)
System.out.println("No hay archivos que listar");
else
{
for (String listadeArchivo : listadeArchivos) {
System.out.println(listadeArchivo);
}
}
}
catch (Exception ex) {
System.out.println("Error al buscar en la ruta indicada");
}
}
}
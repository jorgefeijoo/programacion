public class logistica {
    
public static String limpiarTexto(String codigo){


String cadenaLimpia=codigo.trim().toUpperCase().replace("-", "_").substring(0,6);



return cadenaLimpia;



}
}

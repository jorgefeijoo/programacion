public class Moderador {
    
public static void validarLongitud(String comentarioComprobar){

if (comentarioComprobar.trim().isEmpty()) {
    System.out.println("Error: Comentario vacío");
}
else if (comentarioComprobar.trim().length()>20) {
    System.out.println("Error: Excede el limite");
}else{
    System.out.println("Comentario Valido");
}
}

public static boolean detectarSpam(String comentarioComprobar){

String cadenaMinusculas= comentarioComprobar.toLowerCase();

if (cadenaMinusculas.contains("gratis")||cadenaMinusculas.contains("oferta")||cadenaMinusculas.contains("click")) {
    return true;
}else{
    return false;
}
}

public static String capitalizarFrase(String comentarioComprobar){
String fraseCapitalizada= comentarioComprobar.substring(0,1).toUpperCase()+comentarioComprobar.substring(1).toLowerCase();


return fraseCapitalizada;

}



}

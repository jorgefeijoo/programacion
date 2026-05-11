package Correos;

import java.util.Scanner;

public class Correos {

  public static boolean ComprobacionCorreos() {

    String cadena1 = "";
    String cadena2 = "";

    // creamos o bucle para que si la cadena es vacio que se repita el bucle todo el rato
    while (cadena1.isEmpty() || cadena2.isEmpty()) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce a primeira cadena: ");
      cadena1 = sc.nextLine();
      System.out.print("Vuelve a introducir la cadena: ");
      cadena2 = sc.nextLine();
    }
    // hacemos una comprobacion donde se compruebe si es un correo
    if (cadena1.equalsIgnoreCase(cadena2) && cadena1.length() == cadena2.length() && ComprobacionArrobaInicial(cadena1, cadena2)==true && ContieneArroba(cadena1, cadena2)==true && dosArrobas(cadena1)==true)   {
      return true;
    } else {
      return false;
    }
  }
  //creamos o metodo para comprobar si empieza o acaba en @
  public static boolean ComprobacionArrobaInicial(String cadena1, String cadena2){
  if (cadena1.startsWith("@")|| cadena2.startsWith("@")||cadena1.endsWith("@")||cadena2.endsWith("@")) {
    return false ;
  }else{
    return true;
  }

}
//hacemos una comprobacion para ver si contiene @
public static boolean ContieneArroba(String cadena1 , String cadena2){
  
if (cadena1.contains("@")) {
  return true;
}else{
  return false;
}
}
// creamos o metodo para comprobar que el correo no tiene dos arrobas 
public static boolean dosArrobas(String cadena1){
 int i;
  for( i= 0; i<cadena1.length();i++){
if (cadena1.charAt(i)=='@') {
  i++;
}
  }
  if (i==1) {
  return true;
}else{
  return false;
}
}

public static void main(String[] args) {
 if (Correos.ComprobacionCorreos()==true) {
  System.out.println("El correo introducido es valido");
 }else{
  System.out.println("El correo introducido no es valido");
 }
}

}
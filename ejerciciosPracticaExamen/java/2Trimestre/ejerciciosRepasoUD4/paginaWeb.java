
import java.util.Scanner;

public class paginaWeb {

public static boolean  comprobacionCadenas(){
    
    Scanner sc = new Scanner (System.in);
    String dominio1=" ";
    String dominio2=" ";
    while (dominio1.isBlank()||dominio2.isBlank()) {
        System.out.print("Introduce o dominio: ");
        dominio1=sc.nextLine();
        System.out.print("Comprobacion do dominio: ");
        dominio2=sc.nextLine();
    }   
    if (dominio1.indexOf('.',1)!=-1&&dominio1.equalsIgnoreCase(dominio2)&&dominio1.lastIndexOf('.')!=-1) {
        return true;
    }else{
        return false;
    }
   


        
    

    
}
    public static void main(String[] args) {
        
    if (paginaWeb.comprobacionCadenas()) {
        System.out.println("El dominio web es correcto");
    }else{
        System.out.println("El dominio web es incorrecto");
    }
    }
}

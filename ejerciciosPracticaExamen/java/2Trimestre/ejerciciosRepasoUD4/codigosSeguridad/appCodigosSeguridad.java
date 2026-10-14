package codigosSeguridad;

public class appCodigosSeguridad {
    public static void main(String[] args) {
        if (codigosSeguridad.comprobacionCadenas()==-1) {
            System.out.println("Los codigos tienen distinta longitud");
        }else if (codigosSeguridad.comprobacionCadenas()==0) {
            System.out.println("Codigos con la misma longitud");
        }else if (codigosSeguridad.comprobacionCadenas()==1) {
            System.out.println("Mismo contenido");
        }else if (codigosSeguridad.comprobacionCadenas()==2) {
            System.out.println("Mismo Contenido ignorando mayusculas pero menos de 8 caracteres");
        }else if(codigosSeguridad.comprobacionCadenas()==3){
            System.out.println("Mismo contenido ignorando mayusculas pero +8 caracteres");
        }
    }
}


import java.util.Scanner;

public class cafeteria {

    public static boolean  login() {
        Scanner sc = new Scanner(System.in);
        String contraseña = " ";
        String usuarioCorrecto = " ";
       // hacemos que se repita el user si no mete un usuario que no sea admin
        while (!(usuarioCorrecto.equals("Admin"))) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            String usuarioMinusculas = usuario.toLowerCase();
            //pasamos la primera letra a mayusculas y el ressto a minusculas 
            usuarioCorrecto = usuarioMinusculas.substring(0, 1).toUpperCase() + usuarioMinusculas.substring(1);
           // comprobamos que el usuario sea Admin
            if (usuarioCorrecto.equals("Admin")) {
                System.out.println("Usuario Correcto");
            } else {
                System.out.println("El usuario introducido es incorrecto");
            }
        }
// que pida la contraseña si tiene menos de 5 caracteres
        while (contraseña.length() <= 5) {
            System.out.print("Contraseña: ");
            contraseña = sc.nextLine();
           //comprobamos si la contraseña tiene menos de 5 caracteres
            if (contraseña.length() <= 5) {
                System.out.println("La contraseña introducida es incorrecta pruebe de nuevo");
            } else {
                System.out.println("Contraseña correcta!!");
            }
        }
// si el usuario y la contraseña son correctos devolvemos un true
        if (usuarioCorrecto.equals("Admin")&&contraseña.length()>5) {
            return true;
        }else{
            return false;
        }

    }

    public static void ventas(){
        Scanner sc = new Scanner(System.in);
        double[] ventas= new double[7];
        String[] productos=new String[7];
        int i=0;
        int j=0;
        double ventaSemanal=0;
        int contador=0;
        String productoFinal="";
        int indiceMejorDia=0;
        int indicePeorDia=0;

    for(i=0;i<ventas.length;i++){
        System.out.print("Las ventas en el el dia "+i +" son: ");
        ventas[i]=sc.nextDouble();
        ventaSemanal=ventaSemanal+ventas[i];

        if (ventas[i]>ventas[indiceMejorDia]) {
            indiceMejorDia=i;
        }

        if (ventas[i]<ventas[indicePeorDia]) {
            indicePeorDia=i;
        }
    
    }
    sc.nextLine();
    for(j=0;j<productos.length;j++){
       
        System.out.print("El producto mas vendido el dia "+ j+ " es: ");
        productos[j]=sc.nextLine();
        productoFinal=productos[j].trim().toUpperCase();

        if (productoFinal.equals("CAFE")) {
            contador++;
        }
    }

    double mediaVentas=ventaSemanal/ventas.length;

    System.out.println("El numero de dias donde el cafe fue el producto estrella es: "+ contador);
    System.out.println("La suma de las ventas de la semana es: "+ ventaSemanal+" la media de las ventas de la semana es: "+ mediaVentas);
    System.out.println("El dia con mas ventas es: " + indiceMejorDia);
    System.out.println("El dia con peores ventas fue: "+ indicePeorDia);
    } 

}

import java.util.Scanner;
public class AppAscensor {
    public static void main(String[] args) {
    Ascensor ascensor = new Ascensor(0, 4);// creamos o obxeto ascensor
    Scanner sc= new Scanner (System.in);// creamos o Scanner
    System.out.print("Introduce os pisos que queres subir: ");//preguntamos por teclado o numero de pisos que quere subir
    int subir = sc.nextInt();//leemos o numero introducido por teclado
     ascensor.Subir(subir);//suben o numero de pisos que indicamos por pantalla
     ascensor.Situacion();//mostramos a situacion despois de subir os pisos
     System.out.print("Introduce os pisos que queres bajar: ");//preguntamos o numero de pisos que queren baixar
    int bajar= sc.nextInt();// leemos por teclado o numero de pisos que queren baixar 
    ascensor.Bajar(bajar);//baixan o numero de pisos que mostramos por teclado
    ascensor.Situacion();//ensinamos o numero de piso no que estamos
  }
}

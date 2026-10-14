public class Ejercicio4 {
    /*Intercambio de los extremos:
Crea un array de String con 4 nombres de frutas (ej. "Manzana", "Pera", "Plátano", "Kiwi"). Tu objetivo es intercambiar el primer elemento con el último.
Pista: Si intentas hacer array[0] = array[3], perderás el valor de "Manzana". Necesitarás crear una variable temporal (auxiliar) para guardar ese valor antes de sobrescribirlo. Muestra el array antes y después del cambio. */

public static void main(String[] args) {
    String[] frutas={"Manzana", "Pera","Platano","Kiwi"};
    String fruta1=frutas[0];
  
    frutas[0]=frutas[3];
    frutas[3]=fruta1;
  


    for(int i=0;i<frutas.length;i++){
        System.out.println("EL valor del array en la posicion "+ i + " es: "+ frutas[i]);
    }


    System.out.println("-----------------------------");
    for(int j=0;j<frutas.length;j++){
    
       
        System.out.println("El valor del array en la posicion "+ j + " es: "+ frutas[j]);
    }


}

}

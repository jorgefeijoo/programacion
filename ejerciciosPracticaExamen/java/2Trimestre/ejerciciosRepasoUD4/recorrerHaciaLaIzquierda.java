public class recorrerHaciaLaIzquierda {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5,6};

        //guardamos el ultimo
        int auxiliar=numeros[numeros.length-1];


         for(int i=0;i<numeros.length;i++){
            System.out.println("el valor del array en la posicion " + i + " es "+numeros[i]);
        }

        //empezamos por el ultimo y vamos decrementando la i
        for(int i=numeros.length-1;i>0;i-- ){
           // como empiezo por el final tengo que ir restando 
            numeros[i]=numeros[i-1];
             
           
        }
// le damos el valor de la ultima posicion a la primera posicion
        numeros[0]=auxiliar;


        System.out.println();
        for(int i=0;i<numeros.length;i++){
            System.out.println("el valor del array en la posicion " + i + " es "+numeros[i]);
        }
        
    }


    
}

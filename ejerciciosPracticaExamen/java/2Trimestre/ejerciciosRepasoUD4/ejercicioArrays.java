public class ejercicioArrays {
    public static void main(String[] args) {
        System.out.println("El numero de vocales que hay en el array es: "+ contarVocales());
    }

    public static int contarVocales(){
        char[] caracteres = {'A','b','c','d','e','f','g','h','i'};
        int contador=0;
     

       

        for(int i=0;i<caracteres.length;i++){
          char caracteresMinusculas= Character.toLowerCase(caracteres[i]);

         if (caracteresMinusculas=='a'||caracteresMinusculas=='e'||caracteresMinusculas=='i'||caracteresMinusculas=='o'||caracteresMinusculas=='u') {
            contador++;
         }
         
        }
        

        return contador;
    }
}

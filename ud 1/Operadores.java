public class Operadores {
    public static void main(String[] args) {
        byte a=8;
        byte b=3;
        System.out.println("suma=  " + (a+b));
        System.out.println("resta= " + (a-b));
        System.out.println("multiplicacion= " + a*b);
        System.out.println("division= " + a/b);
        System.out.println("resto= " + a%b);
       
        System.out.println("a es igual a b ? " + (a==b));
        System.out.println("a es distinto de b " + (a!=b));
        System.out.println("a es mayor que b ? " + (a>b));
        System.out.println("a es menor que b ? "+ (a<=b));

        System.out.println("Ambos numeros son positivos: " + (a>0 && b>0));
        System.out.println("Algun dos dous son negativos: "+ (a<0||b<0) );

        System.out.println("Incrementar a 5: " + (a+=5));// usando += y el numero que quieres incrementar sobre la variable se incrementa
        System.out.println("Multiplica b por 2: " + (b*=2));// usando *= y el numero que quieres incrementar sobre la variable se incrementa
        byte a2=8;
        System.out.println("numero antes do incremento " + a2);// se declara la variable de nuevo y se imprime el numero original
        a2++;
        System.out.println( "Aumentar a 1 usando incremento: " + a2);// se usa ++ a la variable para hacer el incremento
        byte b2=3;
        System.out.println("numero antes do incremento " + b2);// se declara la variable de nuevo y se imprime el valor original 
        b2--;
        System.out.println("Decrementar B en 1 usando incremento: " + b2);// se usa el operador -- para realizar el decremento
        
        


    }
}

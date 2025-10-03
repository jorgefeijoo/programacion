public class Operadores {
    public static void main(String[] args) {
        byte a=8;
        byte b=3;
        System.out.println("suma=  " + a+b);
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

        System.out.println("Incrementar a 5: " + (a+=5));
        System.out.println("Multiplica b por 2: " + (a*=2));
        byte a2=8;
        a2++;
        System.out.println( "Aumentar a 1 usando incremento: " + a2++);
        byte b2=3;
        b2++;
        System.out.println("Aumentar B en 1 usando incremento: " + b2++);
        
        


    }
}

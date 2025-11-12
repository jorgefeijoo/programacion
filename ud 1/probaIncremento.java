public class probaIncremento {
    public static void main(String[] args) {
       
        int numero = 10;
        numero++;
        System.out.println("Valor del numero despues de la operación icremento "+ numero);
       
        int numeroRep = 10;
        numeroRep--;
        System.out.println("Valor del numero despues de la operación decremento " + numeroRep);
        
        int numerorep2 = 10;
        int resultado = 5 * ++numerorep2;
        System.out.println( "Valor del numero despues de la operación con la multiplicación "+resultado);
        System.out.println("valor del numero despues de incremento "+numerorep2);
        
        int numeroRep3=10;
        int resultado2=5 * numeroRep3++;
        System.out.println("resultado de la segunda operacion "+resultado2);

    }
}

public class appRectangulo{
    public static void main(String[] args) {
   // creamos o obxeto usando el constructor
        Rectangulo r1 = new Rectangulo(12.00,13.00);
System.out.println("A base do rectangulo 1 e: "+r1.getBase());
System.out.println("A altura do rectangulo 1 e: "+r1.getAltura());
System.out.println("A area do rectangulo 1 e: "+r1.getArea());
// creamos o obxeto usando o constructor por defecto
Rectangulo r2 = new Rectangulo();
r2.setBase(15.00);
r2.setAltura(10.00);

System.out.println("------------------ ---------------------");
System.out.println("A base do rectangulo 2 e: "+r2.getBase());
System.out.println("A altura do rectangulo 2 e: "+r2.getAltura());
System.out.println("A area do rectangulo 2 e: "+r2.getArea());


System.out.println("==========================================");
// creamos a condicion para imprimir o metodo 
if (r1.isCuadrado()==true) {
    System.out.println("O rectangulo 1 e cuadrado");
}else{
    System.out.println("O rectangulo 1 e rectangulo");
}
System.out.println("==========================================");
if (r2.isCuadrado()==true) {
    System.out.println("O rectangulo 2 e cuadrado");
}else{
    System.out.println("O rectangulo 2 e rectangulo");
}
System.out.println(r1);

}


}

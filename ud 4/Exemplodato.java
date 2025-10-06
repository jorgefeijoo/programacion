public class Exemplodato {
    public static void main(String[] args) {
        byte dato = 2;
        System.out.println((++dato) + dato);
        byte dato2 = 2;
         
        System.out.println(dato2 + (dato2++));
        System.out.println(dato2);
        byte dato3= 2;
        System.out.println((dato3 > 2) && (dato3++ < 10));
       
        byte dato4=2;
        System.out.println((dato4 > 2) || (dato4++ < 10));
        byte dato5=2;
        System.out.println(!(dato5++ < 2));
    }
}

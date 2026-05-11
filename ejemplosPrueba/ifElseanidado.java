public class ifElseanidado {
    public static void main(String[] args) {
java.util.Scanner scan = new java.util.Scanner(System.in);
int numero1,numero2,numero3,maior;
System.out.print("Inserta o primeiro número:");
numero1=scan.nextInt(); //Lemos o primeiro número
System.out.print("Inserta o segundo número:");
numero2=scan.nextInt(); //Lemos o segundo número
System.out.print("Inserta o terceiro número:");
numero3=scan.nextInt(); //Lemos o terceiro número
if (numero1>=numero2 && numero1>=numero3)
maior=numero1;
else
if (numero2>=numero1 && numero2>=numero3)
maior=numero2;
else
maior=numero3;
System.out.print("\n\n\t O número maior é " + maior);
}
}

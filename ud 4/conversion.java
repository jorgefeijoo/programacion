public class conversion {
    public static void main(String[] args) {
       int a;
byte b;
a = 25; // non se realiza conversión algunha
b = 12; // permítese porque 12 está dentro do rango permitido
// de valores para b (conversión automática)
System.out.println(a + " antes");

// queno que o tipo int
 b = (byte) a; // Correcto, forzamos conversión explícita. Somos
// conscientes de que podemos perder datos
System.out.println(a);
System.out.println(b + " despues");
    }
}

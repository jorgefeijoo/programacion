public class probaExemploCadeas {
 public static void main(String[] args) {
 String cad1 = "CICLO DAM/DAW";
 String cad2 = "ciclo dam/daw";
 System.out.println("A cadea cad1 é: " + cad1 + " e cad2 é: " + cad2);
 System.out.println("Lonxitude de cad1: " + cad1.length());
 // concatenación de cadeas (concat ou operador +)
 System.out.println("Concatenación: " + cad1.concat(cad2));
 // comparación de cadeas
 System.out.println("cad1.equals(cad2) é " + cad1.equals(cad2));
 System.out.println("cad1.equalsIgnoreCase(cad2) é " +
cad1.equalsIgnoreCase(cad2));
 System.out.println("cad1.compareTo(cad2) é " + cad1.compareTo(cad2));
 // obtención de subcadeas
 System.out.println("cad1.substring(0,5) é " + cad1.substring(0,5));
 // pasar a minúsculas
 System.out.println("cad1.toLowerCase() é " + cad1.toLowerCase());
 System.out.println("cad1.toUpperCase() é " + cad1.toUpperCase());
 } // fin main
} // fin Exemplocadeas
    


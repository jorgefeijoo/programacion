public class exemplocambioArrays {
 public static void main(String[] args) {
 // Creación e inicialización do array nomes
 String[] nomes = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego",
 "Paula" };
 // Marcamos cal é o último elemento do array;

 int ultimo = nomes.length-1;

 //Mostramos array, percorrendóo.
 for (int i = 0; i <= ultimo; i++) {
 System.out.println("Valor da posición " + i + ": " + nomes[i]);
 }
 System.out.println("----------------------------");

 // Buscamos a posición do elemento a borrar no array
 int i=0;
 while (!nomes[i].equals("Irene")) {
 i++;
 }
 nomes[i]=nomes[ultimo];
 // Desde a posición que atopamos antes recorremos o array ata o final, e
 // copiamos á posición actual o valor seguinte no array.
 // OLLO: recorremos ata o anterior a ultimo, porque se non na asignación
 // pasámonos do rango do array
 for (; i < ultimo; i++) {
 nomes[i] = nomes[i + 1];
 }
 ultimo=ultimo- 1;
 
 // Se quixeramos facer agora o recorrido o faríamos ata o valor de último
 for (int j = 0; j <= ultimo; j++) {
 System.out.println("Valor da posición " + j + ": " + nomes[j]);
 }
 }
}
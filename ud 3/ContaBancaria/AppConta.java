public class AppConta {
  public static void main(String[] args) {// para que o programa sexa executable
    Conta personal = new Conta("ABC123", "Jorge", 100.53); // creamos o obxeto conta coa variable persoal

    // mostramos os valores
    System.out.println("O saldo da conta e: " + personal.getSaldo());
    personal.movemento(true, 1000, "Mensualidad mes noviembre");
    personal.amosarInformacion();
    System.out.println(personal.getUltimoMovemento());
    if (personal.resultado == true) {
      System.out.println("O saldo da conta e positivo");
    } else {
      System.out.println("O saldo da conta e negativo");
    }

    // definimos os valores aos atributos
    /*
     * Conta personal2 = new Conta();
     * personal2.setIdConta("456DEF");
     * personal2.setTitular("Jose");
     * personal2.setSaldo(1.56);
     * 
     * System.out.println("O id da conta e: " + personal2.getIdConta());
     * System.out.println("O titular  da conta e: " + personal2.getTitular());
     * System.out.println("O saldo da conta e: " + personal2.getSaldo());
     */
  }
}

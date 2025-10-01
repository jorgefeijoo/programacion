public class ExemploEnum {
 enum Dia {
 LUNS, MARTES, MÉRCORES, XOVES, VENRES, SÁBADO, DOMINGO
 }
 public static void main(String[] args) {
 Dia hoxe = Dia.LUNS;
 if (hoxe == Dia.LUNS) {
 System.out.println("hoxe é Luns e Xose Cameán non vai a Carballo!");
 }
 }
}

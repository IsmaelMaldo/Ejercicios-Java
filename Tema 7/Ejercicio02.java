/*
 * Ejercicio 2
 * 
 * Muestra un array
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio02 {
  public static void main(String[] args){
    String [] simbolo = new String[10];
    simbolo[0] = "'a'";
    simbolo[1] = "'x'";
    simbolo[2] = "";
    simbolo[3] = "";
    simbolo[4] = "'@'";
    simbolo[5] = "";
    simbolo[6] = "' '";
    simbolo[7] = "'+'";
    simbolo[8] = "'Q'";
    simbolo[9] = "";
    System.out.println("┌╌╌╌╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┐");
    System.out.printf("╎Indice╎");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d╎", i);
    }
    System.out.println("\n├╌╌╌╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┤");
    System.out.printf("╎Valor ╎");
    for (String n : simbolo) {
      System.out.printf("%3s╎", n);
    }
    System.out.println("\n└╌╌╌╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┘");
  }
}

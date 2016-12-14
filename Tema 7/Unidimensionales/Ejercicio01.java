/*
 * Ejercicio 1
 * 
 * Muestra un array
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio01 {
  public static void main(String[] args){
    int [] num = new int[12];
    num [0] = 39;
    num [1] = -2;
    num [4] = 0;
    num [6] = 14;
    num [8] = 5;
    num [9] = 120;
    System.out.println("┌╌╌╌╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┐");
    System.out.printf("╎Indice╎");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%3d╎", i);
    }
    System.out.println("\n├╌╌╌╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┤");
    System.out.printf("╎Valor ╎");
    for (int n : num) {
      System.out.printf("%3d╎", n);
    }
    System.out.println("\n└╌╌╌╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┘");
  }
}

/*
 * Ejercicio 2
 * 
 * Pide 20 números, luego los muestra y hace sumatorio de las filas y
 * columnas y por último muestra la suma total.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio02 {
  public static void main(String[] args){
    int [][] num = new int[4][6];
    System.out.printf("Introduce 20 números separados por intro");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    System.out.printf("┌╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┐\n╎");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.printf("%9d╎", num[i][j]);
        num[i][5] = num[i][5] + num[i][j];
      }
      System.out.printf("%9d╎\n╎", num[i][5]);
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        num[3][j] = num [3][j] + num[i][j];
      }
    }
    for (int i = 0; i < 5; i++) {
      System.out.printf("%9d╎", num[3][i]);
    }
    for (int i = 0; i < 5; i++) {
      num[3][5] = num[3][5] + num[3][i];
    }
    for (int i = 0; i < 3; i++) {
      num[3][5] = num[3][5] + num[i][5];
    }
    System.out.printf("%9d╎", num[3][5]);
    System.out.println("\n└╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┘");
  }
}

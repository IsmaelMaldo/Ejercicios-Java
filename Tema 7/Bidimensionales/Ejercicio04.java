/*
 * Ejercicio 4
 * 
 * Introduce de forma aleatoria números en un array bidimensional,
 * luego los muestra y hace sumatorio de las filas y columnas y por
 * último muestra la suma total.
 * Cuando va a mostrar la suma espera un poco para simular que está
 * pensando
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio04 {
  public static void main(String[] args)
    throws InterruptedException {
      int [][] num = new int[4][6];
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
          num[i][j] = (int)(Math.random() * 800 + 100);
        }
      }
      System.out.printf("┌╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┐\n╎");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
          System.out.printf("%9d╎", num[i][j]);
          num[i][5] = num[i][5] + num[i][j];
        }
        Thread.sleep(1000);
        System.out.printf("%9d╎\n╎", num[i][5]);
      }
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
          num[3][j] = num [3][j] + num[i][j];
        }
      }
      for (int i = 0; i < 5; i++) {
        Thread.sleep(1000);
        System.out.printf("%9d╎", num[3][i]);
      }
      for (int i = 0; i < 5; i++) {
        num[3][5] = num[3][5] + num[3][i];
      }
      for (int i = 0; i < 3; i++) {
        num[3][5] = num[3][5] + num[i][5];
      }
      Thread.sleep(1000);
      System.out.printf("%9d╎", num[3][5]);
      System.out.println("\n└╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┘");
  }
}

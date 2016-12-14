/*
 * Ejercicio 5
 * 
 * Muestra un array bidimensional y dice la posición del máximo y del
 * mínimo
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio05 {
  public static void main(String[] args){
    int [][] num = new int[6][10];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int)(Math.random() * 1001);
      }
    }
    int max = 0;
    int min = 1000;
    int pos_max[] = new int[2];
    int pos_min[] = new int[2];
    System.out.println("┌╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌╌╌┐");
    System.out.printf("╎Array num╎");
    for (int i = 0; i < 10; i++) {
      System.out.printf("Columna %d╎", i);
    }
    System.out.printf("\n├╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌╌╌┤");
    for (int i = 0; i < 6; i++) {
      System.out.printf("\n╎Fila %d   ╎", i);
      for (int j = 0; j < 10; j++) {
        System.out.printf("%9d╎", num[i][j]);
        if (max < num[i][j]) {
          max = num[i][j];
          pos_max[0] = i;
          pos_max[1] = j;
        }
        if (min > num[i][j]) {
          min = num[i][j];
          pos_min[0] = i;
          pos_min[1] = j;
        }
      }
    }
    System.out.println("\n└╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌╌╌┘");
    System.out.printf("\n\nEl máximo se encuentra en la fila %d columna %d", pos_max[0], pos_max[1]);
    System.out.printf("\n\nEl mínimo se encuentra en la fila %d columna %d", pos_min[0], pos_min[1]);
  }
}

/*
 * Ejercicio 10
 *
 * Clasifica dentro de un array los número pares de los impares.
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio10 {
  public static void main(String[] args){
    int[] num = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int j = 0;
    int x = 0;
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
    }
    for (int i = 0; i < 20; i++) {
      System.out.printf("%d ", num[i]);
    }
    for (int i = 0; i < 20; i++) {
      if ((num[i] % 2) == 0) {
        par[j] = num[i];
        j++;
      } else {
        impar[x] = num[i];
        x++;
      }
    }
    int i = 0;
    for (i = i; i < j; i++) {
      num[i] = par [i];
    }
    j = 0;
    for (i = i; i < 20; i++) {
      num[i] = impar [j];
      j++;
    }
    System.out.printf("\n\n\n\n");
    for (i = 0; i < 20; i++) {
      System.out.printf("%d ", num[i]);
    }
  }
}

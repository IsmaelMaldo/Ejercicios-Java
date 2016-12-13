/*
 * Ejercicio 11
 *
 * Pide 10 números por teclado y pone los primos los primeros
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio11 {
  public static void main(String[] args){
    int[] num = new int[9];
    int[] num_primo = new int[9];
    int[] resto = new int[9];
    int j = 0;
    int x = 0;
    for (int i = 0; i < 9; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 9; i++) {
      System.out.printf("%d ", num[i]);
    }
    for (int i = 0; i < 9; i++) {
      boolean primo = true;
      int divisor = num[i] - 1;
      while ((divisor > 1) && primo) {
        if ((num[i] % divisor) == 0) {
          primo = false;
        }
        divisor--;
      }
      if (primo) {
        num_primo[j] = num[i];
        j++;
      } else {
        resto[x] = num[i];
        x++;
      }
    }
    System.out.printf("\n\n\n\n");
    int i = 0;
    for (i = i; i < j; i++) {
      num[i] = num_primo[i];
    }
    j = 0;
    for (i = i; i < 9; i++) {
      num[i] = resto[j];
      j++;
    }
    for (i = 0; i < 9; i++) {
      System.out.printf("%d ", num[i]);
    }
  }
}

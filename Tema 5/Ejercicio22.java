/*
 * Ejercicio 22
 *
 * Muestra los números primos que hay desde 2 hasta 100
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio22 {
  public static void main(String[] args){
    for (int i = 2; i <= 100; i++) {
      int j = i - 1;
      boolean primo = true;
      while ((j >= 2) && (primo == true)) {
        if ((i % j) == 0) {
          primo = false;
        }
        j--;
      }
      if (primo == true) {
        System.out.printf("%d, ", i);
      }
    }
    System.out.printf("100");
  }
}

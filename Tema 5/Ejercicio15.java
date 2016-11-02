/*
 * Ejercicio 15
 * 
 * Calula la potencia a partir de una base dada y un exponente.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio15 {
  public static void main(String[] args){
    System.out.printf("Introduce una base:");
    double base = Double.parseDouble(System.console().readLine());
    int lim_exp = 0;
    double res = 1;
    do {
      System.out.printf("Introduce un exponente (entero positivo y mayor o igual que 1):");
      lim_exp = Integer.parseInt(System.console().readLine());
    } while (lim_exp <= 0);
    for (int i = 1; i <= lim_exp; i++) {
      res = 1;
      for (int j = 0; j < i; j++) {
        res = res * base;
      }
      System.out.printf("%.2f, ", res);
    }
  }
}

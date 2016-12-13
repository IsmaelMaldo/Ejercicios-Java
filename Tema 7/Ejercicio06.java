/*
 * Ejercicio 6
 * 
 * Rota 1 posición los elementos de un array de valores introducidos por
 * teclado
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio06 {
  public static void main(String[] args){
    int[] num = new int[15];
    System.out.println("Introduce 15 números separadados por intro");
    for (int i = 0; i < 15; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    int aux = num[14];
    for (int i = 14; i > 0; i--) {
      num[i] = num[i - 1];
    }
    num[0] = aux;
    for (int n : num) {
      System.out.printf("%d ", n);
    }
  }
}

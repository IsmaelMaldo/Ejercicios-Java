/*
 * Ejercicio 9
 *
 * Pide 8 números y dice si son pares o impares
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio09 {
  public static void main(String[] args){
    int[] num = new int[8];
    System.out.println("Introduce 8 números enteros");
    for (int i = 0; i < 8; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (int n : num) {
      if ((n % 2) == 0) {
        System.out.println(n + " Par");
      } else {
        System.out.println(n + "Impar");
      }
    }
  }
}

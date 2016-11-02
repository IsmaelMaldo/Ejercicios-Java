/*
 * Ejercicio 18
 * 
 * Muestra los números comprendidos entre dos números incrementando de 7 en 7
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio18 {
  public static void main(String[] args){
    int num_usuario1;
    int num_usuario2;
    do {
      System.out.printf("Introduce un número: ");
      num_usuario1 = Integer.parseInt(System.console().readLine());
      System.out.printf("Introduce otro número (distinto al anterior): ");
      num_usuario2 = Integer.parseInt(System.console().readLine());
    } while (num_usuario1 == num_usuario2);
    if (num_usuario1 < num_usuario2) {
      for (num_usuario1 = num_usuario1; num_usuario1 < num_usuario2; num_usuario1 = num_usuario1 + 7) {
        System.out.printf("%d, ", num_usuario1);
      }
    } else {
      for (num_usuario2 = num_usuario2; num_usuario2 < num_usuario1; num_usuario2 = num_usuario2 + 7) {
        System.out.printf("%d, ", num_usuario2);
      }
    }
  }
}

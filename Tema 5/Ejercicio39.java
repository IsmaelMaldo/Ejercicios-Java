/*
 * Ejercicio 39
 * 
 * Muestra los números del 1 hasta el dado cada uno con su factorial.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio39 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario = Integer.parseInt(System.console().readLine());
    for (long i = 1; i <= num_usuario; i++) {
      long res = 1;
      for (long j = 1; j <= i; j++) {
        res = res * j;
      }
      System.out.printf("%d! = %d\n", i, res);
    
    }
  }
}

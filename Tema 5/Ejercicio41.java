/*
 * Ejercicio 41
 * 
 * Dice cuántos dígitos pares e impares tiene un número dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio41 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario = Long.parseLong(System.console().readLine());
    for (long i = num_usuario; i < (num_usuario + 5); i++) {
      boolean primo = true;
      for (long j = i - 1; j > 1; j--) {
        if ((i % j) == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.println(i + " es primo.");
      } else {
        System.out.println(i + " no es primo.");
      }
    }
  }
}

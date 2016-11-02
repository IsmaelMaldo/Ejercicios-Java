/*
 * Ejercicio 29
 * 
 * Muestra todos los números positivos menores a uno dado y divisible
 * entre otro dado.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio29 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduce un número entero: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    System.out.printf("Por favor, introduce otro número entero: ");
    int divisible = Integer.parseInt(System.console().readLine());
    for (num_usuario = num_usuario; num_usuario > 0; num_usuario--) {
      if ((num_usuario % divisible) == 0) {
        System.out.printf("%d,", num_usuario);
      }
    }
  }
}

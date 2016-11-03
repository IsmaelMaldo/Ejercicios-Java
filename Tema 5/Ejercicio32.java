/*
 * Ejercicio 32
 * 
 * Muestra los dígitos pares de un número dado y los suma.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio32 {
  public static void main(String[] args){
    long num_usuario;
    long suma = 0;
    long divisor = 1;
    System.out.printf("Introduce un número entero positivo: ");
    num_usuario = Integer.parseInt(System.console().readLine());
    System.out.printf("Los dígitos pares son: ");
    while (num_usuario > divisor) {
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    while (num_usuario > 0) {
      long aux = num_usuario / divisor;
      if ((aux % 2) == 0) {
        System.out.printf("%d ", aux);
        suma = suma + aux;
      }
      num_usuario = num_usuario % divisor;
      divisor = divisor / 10;
    }
    System.out.printf("\nLa suma de los dígitos pares es: %d", suma);
  }
}

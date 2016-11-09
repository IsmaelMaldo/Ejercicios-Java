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
    long conservar = num_usuario;
    long divisor = 1;
    long pares = 0;
    long impares = 0;
    while (num_usuario > divisor) {       //aveirguamos cuanto mide el primer número introducido
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    while (num_usuario > 0)  {
      long aux = num_usuario / divisor;
      if ((aux % 2) == 0) {
        pares++;
      } else {
        impares++;
      }
      num_usuario = num_usuario % divisor;
      divisor = divisor / 10;
    }
    System.out.printf("El número %d contiene %d dígitos pares y %d dígitos impares", conservar, pares, impares);
  }
}

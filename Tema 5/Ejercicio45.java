/*
 * Ejercicio 45
 * 
 * Cambia un dígito por otro dado en una posición dada de un número dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio45 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario1 = Long.parseLong(System.console().readLine());
    System.out.printf("Introduce la posición en la que quieres sustituir el dígito: ");
    long num_usuario2 = Long.parseLong(System.console().readLine());
    System.out.printf("Introduce el dígito a insertar: ");
    long numero_intercalar = Long.parseLong(System.console().readLine());
    long conservar = num_usuario1;
    long divisor = 1;
    long pares = 0;
    long impares = 0;
    String numero = "";
    while (num_usuario1 > divisor) {       //averiguamos cuanto mide el primer número introducido
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    for (long i = 1; i < num_usuario2; i++)  {
      long aux = num_usuario1 / divisor;
      numero = numero + aux;
      num_usuario1 = num_usuario1 % divisor;
      divisor = divisor / 10;
    }
    numero = numero + numero_intercalar;
    num_usuario1 = num_usuario1 % divisor;
    divisor = divisor / 10;
    while (num_usuario1 > 0)  {
      long aux = num_usuario1 / divisor;
      numero = numero + aux;
      num_usuario1 = num_usuario1 % divisor;
      divisor = divisor / 10;
    }
    System.out.printf("El número resultante es %s", numero);
  }
}

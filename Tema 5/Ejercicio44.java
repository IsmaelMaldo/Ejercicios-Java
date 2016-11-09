/*
 * Ejercicio 41
 * 
 * Dice cuántos dígitos pares e impares tiene un número dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio43 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario1 = Long.parseLong(System.console().readLine());
    System.out.printf("Introduce la posición a partir de la cual quieres partir el número: ");
    long num_usuario2 = Long.parseLong(System.console().readLine());
    System.out.printf("Introduce el : ");
    long numero_intercalar = Long.parseLong(System.console().readLine());
    long conservar = num_usuario1;
    long divisor = 1;
    long pares = 0;
    long impares = 0;
    String mitad1 = "";
    String mitad2 = "";
    while (num_usuario1 > divisor) {       //averiguamos cuanto mide el primer número introducido
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    for (long i = 1; i < num_usuario2; i++)  {
      long aux = num_usuario1 / divisor;
      mitad1 = mitad1 + aux;
      num_usuario1 = num_usuario1 % divisor;
      divisor = divisor / 10;
    }
    while (num_usuario1 > 0)  {
      long aux = num_usuario1 / divisor;
      mitad2 = mitad2 + aux;
      num_usuario1 = num_usuario1 % divisor;
      divisor = divisor / 10;
    }
    System.out.printf("Los números partidos son el %s y el %s", mitad1, mitad2);
  }
}

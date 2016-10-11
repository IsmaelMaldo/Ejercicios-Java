/*
* Ejercicio 18
*
* Dice la primera cifra de un número entero dado de no más de 5 cifras
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número entero postivo de no más de 5 cifras");
    int numero = s.nextInt();
    if ((numero < 10) && (numero >= 0)) {
      System.out.println("La primera cifra del número es " + numero);
    } else if ((numero >= 10) && (numero < 100)) {
      System.out.println("La primera cifra del número es " + (numero / 10));
    } else if ((numero >= 100) && (numero < 1000)) {
      System.out.println("La primera cifra del número es " + (numero / 100));
    } else if ((numero >= 1000) && (numero < 10000)) {
      System.out.println("La primera cifra del número es " + (numero / 1000));
    } else if ((numero >= 10000) && (numero < 100000)) {
      System.out.println("La primera cifra del número es " + (numero / 10000));
    } else {
      System.out.println("Ese número no está soportado");
    }
  }
}

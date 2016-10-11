/*
* Ejercicio 14
*
* Dice si un número dado es par y si es divisible entre 5
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número");
    int numero = s.nextInt();
    if ((numero % 2) == 0) {
      System.out.printf("El número es par y ");
    } else {
      System.out.printf("El número es impar y ");
    }
    if ((numero % 5) == 0) {
      System.out.printf("divisible entre 5");
    } else {
      System.out.printf("no divisible entre 5");
    }
  }
}

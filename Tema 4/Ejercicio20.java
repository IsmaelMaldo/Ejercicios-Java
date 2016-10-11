/*
* Ejercicio 20
*
* Dice si el número es capicúo hasta 5 cifras
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número entero postivo de no más de 5 cifras");
    int numero = s.nextInt();
    if (numero < 10) {
      System.out.println("El número es capicúo");
    } else if ((numero >= 10) && (numero < 100)) {
      if ((numero % 10) == (numero / 10)) {
        System.out.println("El número es capicúo");
      } else {
        System.out.println("El número no es capicúo");
      }
      
    } else if ((numero >= 100) && (numero < 1000)) {
      if ((numero % 10) == (numero / 100)) {
        System.out.println("El número es capicúo");
      } else {
        System.out.println("El número no es capicúo");
      }
    } else if ((numero >= 1000) && (numero < 10000)) {
      if (((numero % 10) == (numero / 1000)) && (((numero % 100) / 10) == ((numero / 100) % 10))) {
        System.out.println("El número es capicúo");
      } else {
        System.out.println("El número no es capicúo");
        System.out.println((numero % 100) / 10);
        System.out.println((numero / 100) % 10);
      }
    } else if ((numero >= 10000) && (numero < 100000)) {
      if (((numero % 10) == (numero / 10000)) && (((numero % 100) / 10) == ((numero / 1000) % 10))) {
        System.out.println("El número es capicúo");
      } else {
        System.out.println("El número no es capicúo");
      }
    } else {
      System.out.println("Ese número no está soportado");
    }
  }
}

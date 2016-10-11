/*
* Ejercicio 19
*
* Dice de cuántas cifras se compone el número
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número entero postivo de no más de 5 cifras");
    int numero = s.nextInt();
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número tiene 1 dígito");
    } else if (((numero >= 10) && (numero < 100)) || ((numero <= -10) && (numero > -100))) {
      System.out.println("El número tiene 2 dígitos");
    } else if (((numero >= 100) && (numero < 1000)) || ((numero <= -100) && (numero > -1000))) {
      System.out.println("El número tiene 3 dígitos");
    } else if (((numero >= 1000) && (numero < 10000)) || ((numero <= -1000) && (numero > -10000))) {
      System.out.println("El número tiene 4 dígitos");
    } else if (((numero >= 10000) && (numero < 100000)) || ((numero <= -10000) && (numero > -100000))) {
      System.out.println("El número tiene 5 dígitos");
    } else {
      System.out.println("Ese número no está soportado");
    }
  }
}

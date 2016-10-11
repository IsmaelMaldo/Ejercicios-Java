/*
* Ejercicio 5
*
* Resuelve la ecuación de primer grado ax + b = 0 dados los valores de 
* a y b
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un valor para a");
    double a = s.nextDouble();
    System.out.println("Excribe un valor para b");
    double b = s.nextDouble();
    if (a != 0) {
      System.out.println("x = " + ((b * (-1)) / a));
    } else {
      System.out.println("El valor de x no se puede averiguar si a = 0");
    }
  }
}

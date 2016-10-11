/*
* Ejercicio 9
*
* Calcula el valor de x en la ecuación de segundo grado ax²+bx+c=0
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un valor para a");
    double a = s.nextDouble();
    System.out.println("Escribe un valor para b");
    double b = s.nextDouble();
    System.out.println("Escribe un valor para c");
    double c = s.nextDouble();
    double comp = (Math.pow(b, 2) - (4 * a * c)); //Variable para comprobar que la raíz cuadrada no es negativa
    if (comp >= 0) {
      System.out.println("x = " + (((b * -1) - Math.sqrt(comp)) / (2 * a)) + " o x = " + (((b * -1) + Math.sqrt(comp)) / (2 * a)));
    } else {
      System.out.println("Esta ecuación no tiene una solución real")
    }
  }
}

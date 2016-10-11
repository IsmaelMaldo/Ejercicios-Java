/*
* Ejercicio 6
*
* Dada una altura calula cuanto tiempo tarda el objeto en caer
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la altura a la que está el objeto (en metros)");
    double h = s.nextDouble();
    if (h >= 0) {
      System.out.printf("el objeto tardará en caer %.4f segundos\n", (Math.sqrt((2 * h) / 9.81)));
    } else {
      System.out.println("La altura no puede ser negativa");
    }
  }
}

/*
* Ejercicio 7
*
* Dada 3 notas calcula la nota media
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la nota del primer examen");
    double examen1 = s.nextDouble();
    System.out.println("Escribe la nota del segundo examen");
    double examen2 = s.nextDouble();
    System.out.println("Escribe la nota del tercer examen");
    double examen3 = s.nextDouble();
    System.out.printf("Tu nota media es de %.2f", ((examen1 + examen2 + examen3) / 3));
  }
}

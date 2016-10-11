/*
* Ejercicio 21
*
* Calcula la nota de un trimestre de la asignatura de programación
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la nota del primer examen");
    double examen1 = s.nextDouble();
    System.out.println("Escribe la nota del segundo examen");
    double examen2 = s.nextDouble();
    double nota_final = (examen1 + examen2) / 2;
    
    if (nota_final >= 5) {
      System.out.println("Tu nota de Programación es " + nota_final);
    } else {
      System.out.println("¿Cuál ha sido el resultado de la recuperación?");
      String recuperacion = System.console().readLine();
      
      if (recuperacion.toLowerCase().equals("apto")) {
        System.out.println("Tu nota de Programación es un 5");
      } else {
        System.out.println("Tu nota de Programación es un " + nota_final);
      }
    }
  }
}

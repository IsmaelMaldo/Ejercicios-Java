/*
* Ejercicio 11
* Conversor de Kb a Mb
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la cantidad de Kb");
    double kb = s.nextDouble();
    System.out.println(kb + " Kb = " + (kb / 1000) + " Mb");
  }
}

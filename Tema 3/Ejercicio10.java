/*
* Ejercicio 10
* Conversor de Mb a Kb
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la cantidad de Mb");
    double mb = s.nextDouble();
    System.out.println(mb + " Mb = " + (mb * 1000) + " Kb");
  }
}

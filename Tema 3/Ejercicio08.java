/*
* Ejercicio 8
* Calcula el precio a partir de la base imponible
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe cuántas horas ha realizado el trabajador");
    int horas_trabajo = s.nextInt();
    System.out.println("Al trabajador hay que pagarle " + (horas_trabajo * 12) + "€");
  }
}

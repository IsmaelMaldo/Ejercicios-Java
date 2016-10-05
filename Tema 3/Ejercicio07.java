/*
* Ejercicio 7
* Calcula el precio a partir de la base imponible
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la base imponible");
    double base_imponible = s.nextDouble();
    System.out.println("El precio de la factura es de " + (base_imponible * 1.21));
  }
}

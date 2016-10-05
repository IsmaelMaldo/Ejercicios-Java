/*
* Ejercicio 1
* Multiplica dos valores dados
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número:");
    double x = s.nextDouble();
    System.out.println("Escribe otro número");
    double y = s.nextDouble();
    System.out.printf("El resultado de multiplicar " + x +" y " + y + " es " + (x * y));
  }
}

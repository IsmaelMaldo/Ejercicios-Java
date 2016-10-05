/*
* Ejercicio 2
* Conversor de Euros a Pesetas
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe una cantidad en Euros que quieres convertir");
    double euros = s.nextDouble();
    System.out.println(euros + "€ = " + (euros * 166.386) + " Pesetas" );
  }
}

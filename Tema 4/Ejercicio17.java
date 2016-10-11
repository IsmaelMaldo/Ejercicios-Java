/*
* Ejercicio 17
*
* Dice la útima cifra de un número entero dado
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número");
    int numero = s.nextInt();
    System.out.println("La útima cifra del número dado es " + (numero % 10));
  }
}

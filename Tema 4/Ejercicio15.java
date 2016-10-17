/*
* Ejercicio 15
*
* Pinta una pirámide con un caracter dado
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un caracter");
    String caracter = s.nextLine();
    System.out.println("¿Como quieres la pirámide?");
    System.out.println("1. Apuntando hacia arriba");
    System.out.println("2. Apuntando hacia abajo");
    int opcion = s.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("     " + caracter);
        System.out.println("    " + caracter + caracter + caracter);
        System.out.println("   " + caracter + caracter + caracter + caracter + caracter);
        System.out.println("  " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        break;
      case 2:
        System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println("  " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println("   " + caracter + caracter + caracter + caracter + caracter);
        System.out.println("    " + caracter + caracter + caracter);
        System.out.println("     " + caracter);
        break;
      default:
        System.out.println("Opción no válida");
    }
  }
}

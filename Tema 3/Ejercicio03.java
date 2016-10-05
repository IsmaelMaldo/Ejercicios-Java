/*
* Ejercicio 3
* Conversor de pesetas a euros
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe una cantidad en Pesetas que quieres convertir");
    int pesetas = s.nextInt();
    System.out.println(pesetas + " Pesetas = " + (pesetas * 0.006) + "€" );
  }
}

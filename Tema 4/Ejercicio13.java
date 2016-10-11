/*
* Ejercicio 13
*
* Ordena 3 números dados
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número");
    int numero1 = s.nextInt();
    System.out.println("Escribe otro número");
    int numero2 = s.nextInt();
    System.out.println("Escribe un tercer número");
    int numero3 = s.nextInt();
    int aux;
    if (numero1 < numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    if (numero1 < numero3) {
      aux = numero1;
      numero1 = numero3;
      numero3 = aux;
    }
    if (numero2 < numero3) {
      aux = numero2;
      numero2 = numero3;
      numero3 = aux;
    }
    System.out.println("Los número quedarían organizados de la siguiente manera:");
    System.out.printf("%d, %d, %d", numero1, numero2, numero3);
  }
}

/*
 * Ejercicio 20
 *
 * Dibuja una cuba de una capacidad dada llena de forma aleatoria
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio20 {
  public static void main(String[] args){
    System.out.printf("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int lleno = (int)(Math.random() * (capacidad + 1));
    for (int i = capacidad; i > 0; i--) {
      if (i <= lleno) {
        System.out.println("*====*");
      } else {
        System.out.println("*    *");
      }
    }
    System.out.println("******");
    System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua", capacidad, lleno);
  }
}


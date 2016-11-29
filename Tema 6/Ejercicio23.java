/*
 * Ejercicio 23
 *
 * Simula 5 tiradas aleatorias de dados los cuales tienen en las caras
 * As, K, Q, J, 7 y 8.
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio23 {
  public static void main(String[] args){
    for (int i = 0; i < 5; i++) {
      switch ((int)(Math.random() * 6)) {
        case 0:
          System.out.printf("As ");
          break;
        case 1:
          System.out.printf("K ");
          break;
        case 2:
          System.out.printf("Q ");
          break;
        case 3:
          System.out.printf("J ");
          break;
        case 4:
          System.out.printf("7 ");
          break;
        case 5:
          System.out.printf("8 ");
          break;
      }
    }
  }
}


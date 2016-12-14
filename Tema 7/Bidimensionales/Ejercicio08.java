/*
 * Ejercicio 8
 * 
 * Mejorar el juego de busca el tesoro haciendo que si estás cerca de
 * una mina te avise
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    String[] abece = {
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h"
    };
    String[][] tablero = new String[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        tablero[i][j] = abece[j] + (i + 1);
      }
    }
    System.out.printf(" ");
    for (int i = 0; i < 8; i++) {
      System.out.printf("  %s", abece[i]);
    }
    System.out.println("\n ┌╌╌┬╌╌┬╌╌┬╌╌┬╌╌┬╌╌┬╌╌┬╌╌┐");
    for (int i = 7; i >= 0; i--) {
      System.out.printf("%d╎", i + 1);
      for (int j = 0; j < 8; j++) {
        System.out.printf("%s╎", tablero[i][j]);
      }
      System.out.printf("%d", i + 1);
      if (i != 0) {
        System.out.println("\n ├╌╌┼╌╌┼╌╌┼╌╌┼╌╌┼╌╌┼╌╌┼╌╌┤");
      } else {
        System.out.printf("\n");
      }
    }
    System.out.println(" └╌╌┴╌╌┴╌╌┴╌╌┴╌╌┴╌╌┴╌╌┴╌╌┘");
    System.out.printf(" ");
    for (int i = 0; i < 8; i++) {
      System.out.printf("  %s", abece[i]);
    }
    System.out.printf("\nIntroduzca la posición del alfil: ");
    String user_posicion = System.console().readLine();
    int[] posicion = new int[2];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (user_posicion.equals(tablero[i][j])) {
          posicion[0] = i;
          posicion[1] = j;
        }
      }
    }
    System.out.println("\nEl alfil puede moverse a las siguientes posiciones:");
    System.out.println(posicion[0] + " " + posicion[1]);
    int x = posicion[0] + 1;
    int y = posicion[1] + 1;
    while ((x < 8) && (y < 8)) {
      System.out.printf("%s ", tablero[x][y]);
      x++;
      y++;
    }
    x = posicion[0] + 1;
    y = posicion[1] - 1;
    while ((x < 8) && (y >= 0)) {
      System.out.printf("%s ", tablero[x][y]);
      x++;
      y--;
    }
    x = posicion[0] - 1;
    y = posicion[1] + 1;
    while ((x >= 0) && (y < 8)) {
      System.out.printf("%s ", tablero[x][y]);
      x--;
      y++;
    }
    x = posicion[0] - 1;
    y = posicion[1] - 1;
    while ((x >= 0) && (y >= 0)) {
      System.out.printf("%s ", tablero[x][y]);
      x--;
      y--;
    }
  }
}

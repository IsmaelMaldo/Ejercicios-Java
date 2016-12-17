/*
 * Ejercicio 10
 * 
 * Juego del 3 en raya
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    int[][] tablero = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        tablero[i][j] = 0;
      }
    }
    boolean ganajugador = false;
    boolean ganamaquina = false;
    while (!ganajugador && !ganamaquina) {
      System.out.printf(" ┌─┬─┬─┐\n");
      for (int i = 0; i < 3; i++) {
        System.out.printf(" │");
        for (int j = 0; j < 3; j++) {
          switch (tablero[i][j]) {
            case 0:
              System.out.printf(" │");
              break;
            case 1:
              System.out.printf("X│");
              break;
            case 2:
              System.out.printf("O│");
              break;
          }
        }
        if (i != 2) {
          System.out.printf("\n ├─┼─┼─┤\n");
        }
      }
      System.out.printf("\n └─┴─┴─┘\n\n\n");
      System.out.printf("Escoje la coordenada X: ");
      int coordenaday = Integer.parseInt(System.console().readLine());
      System.out.printf("Escoje la coordenada Y: ");
      int coordenadax = Integer.parseInt(System.console().readLine());
      if (tablero[coordenadax][coordenaday] != 0) {
        System.out.printf("Error, coordenada ocupada\n");
      } else {
        tablero[coordenadax][coordenaday] = 1;
        if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) {
          ganajugador = true;
        }
        if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) {
          ganajugador = true;
        }
        if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) {
          ganajugador = true;
        }
        if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
          ganajugador = true;
        }
        if (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) {
          ganajugador = true;
        }
        if (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) {
          ganajugador = true;
        }
        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
          ganajugador = true;
        }
        if (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1) {
          ganajugador = true;
        }
        if (!ganajugador) {
          boolean rellenado = true;
          while (rellenado) {
            coordenadax = (int)(Math.random() * 3);
            coordenaday = (int)(Math.random() * 3);
            if (tablero[coordenadax][coordenaday] == 0) {
              tablero[coordenadax][coordenaday] = 2;
              rellenado = false;
            }
          }
          if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2) {
            ganamaquina = true;
          }
          if (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2) {
            ganamaquina = true;
          }
          if (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2) {
            ganamaquina = true;
          }
          if (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) {
            ganamaquina = true;
          }
          if (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2) {
            ganamaquina = true;
          }
          if (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2) {
            ganamaquina = true;
          }
          if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) {
            ganamaquina = true;
          }
          if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2) {
            ganamaquina = true;
          }
        }
      }
    }
    if (ganajugador){
      System.out.println("Enhorabuena, has ganado");
    } else {
      System.out.println("Lo siento, has perdido");
    }
  }
}

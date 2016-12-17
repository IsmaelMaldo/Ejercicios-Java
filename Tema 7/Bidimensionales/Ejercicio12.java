/*
 * Ejercicio 12
 * 
 * Muestra un array bidimensional de 10 x 10 de números aleatorios,
 * luego muestra los números que hay en la diagonal desde la esquina
 * inferior izquierda a la superior derecha, así como los números
 * máximos, mínimos y la media de la diagonal
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    int[][] tablero = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        tablero[i][j] = (int)(Math.random() * 101 + 300);
        System.out.printf("%d ", tablero[i][j]);
      }
      System.out.printf("\n");
    }
    int suma = 0;
    int max = tablero[0][8];
    int min = tablero[0][8];
    System.out.printf("Los número de la diagonal son: ");
    int j = 8;
    for (int i = 0; i < 9; i++) {
      System.out.printf("%d ", tablero[j][i]);
      suma = suma + tablero[j][i];
      if (min > tablero[j][i]) {
        min = tablero[j][i];
      }
      if (max < tablero[j][i]) {
        max = tablero[j][i];
      }
      j--;
    }
    System.out.println("\nEl máximo es: " + max);
    System.out.println("El mínimo es: " + min);
    System.out.println("La media de los números es: " + (suma / 10));
  }
}

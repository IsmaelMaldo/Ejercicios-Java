/*
 * Ejercicio 11
 * 
 * Muestra un array bidimensional de 10 x 10 de números aleatorios,
 * luego muestra los números que hay en la diagonal desde la esquina
 * superior izquierda a la inferior derecha, así como los números
 * máximos, mínimos y la media de la diagonal
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    int[][] tablero = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        tablero[i][j] = (int)(Math.random() * 101 + 300);
        System.out.printf("%d ", tablero[i][j]);
      }
      System.out.printf("\n");
    }
    int suma = 0;
    int max = tablero[0][0];
    int min = tablero[0][0];
    System.out.printf("Los número de la diagonal son: ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d ", tablero[i][i]);
      suma = suma + tablero[i][i];
      if (min > tablero[i][i]) {
        min = tablero[i][i];
      }
      if (max < tablero[i][i]) {
        max = tablero[i][i];
      }
    }
    System.out.println("\nEl máximo es: " + max);
    System.out.println("El mínimo es: " + min);
    System.out.println("La media de los números es: " + (suma / 10));
  }
}

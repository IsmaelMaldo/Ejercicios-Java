/*
 * Ejercicio 9
 * 
 * Pinta una matriz de 12 x 12 y rota los número una posición.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    int[][] matriz = new int[12][12];
    int rellenador = 0;
    for (int i = 0; i < 12; i++){
      for (int j = 0; j < 12; j++){
        matriz[i][j] = rellenador;
        rellenador++;
      }
    }
    for (int i = 0; i < 12; i++){
      for (int j = 0; j < 12; j++){
        System.out.printf("%3d ", matriz[i][j]);
      }
    System.out.printf("\n");
    }
    System.out.printf("\n\n\n\n");
    for (int vuelta = 0; vuelta < 6; vuelta++) {
      int aux = matriz[vuelta][11 - vuelta];
      // Rota arriba
      for (int i = 11 - vuelta; i > vuelta; i--) {
        matriz[vuelta][i] = matriz[vuelta][i - 1];
      }
      // Rota izquierda
      for (int i = vuelta; i < 11 - vuelta; i++) {
        matriz[i][vuelta] = matriz[i + 1][vuelta];
      }
      // Rota abajo
      for (int i = vuelta; i < 11 - vuelta; i++) {
        matriz[11 - vuelta][i] = matriz[11 - vuelta][i + 1];
      }
      // Rota izquierda
      for (int i = 11 - vuelta; i > vuelta; i--) {
        matriz[i][11 - vuelta] = matriz[i - 1][11 - vuelta];
      }
      // variable que hemos guardado antes
      matriz[vuelta + 1][11 - vuelta] = aux;
    }
    for (int i = 0; i < 12; i++){
      for (int j = 0; j < 12; j++){
        System.out.printf("%3d ", matriz[i][j]);
      }
    System.out.printf("\n");
    }
  }
}

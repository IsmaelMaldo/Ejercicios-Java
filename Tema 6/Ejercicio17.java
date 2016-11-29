/*
 * Ejercicio 18
 * 
 * Dibuja un pez en una pecera de tamaño dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio17 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduce la altura de la pecera (como mínimo 4): ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.printf("Ahora, introduce la anchura (como mínimo 4): ");
    int ancho = Integer.parseInt(System.console().readLine());
    int pez_col = (int)(Math.random() * (alto - 2) + 2);
    int pez_row = (int)(Math.random() * (ancho - 2) + 2);
    for (int i = 1; i <= alto; i++) {
      for (int j = 1; j <= ancho; j++) {
        if ((i == 1) || (i == alto) || (j == 1) || (j == ancho)) {
          System.out.printf("*");
        }
        else if ((i == pez_col) && (j == pez_row)) {
          System.out.printf("&");
        } else {
          System.out.printf(" ");
        }
      }
      System.out.printf("\n");
    }
  }
}


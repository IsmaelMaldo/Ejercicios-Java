/*
 * Ejercicio 40
 * 
 * Dibuja un rombo hueco a partir de una altura dada
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio40 {
  public static void main(String[] args){
    int num_usuario;
    boolean flag = false;
    do {
      System.out.printf("Introduce la altura del rombo: ");
      num_usuario = Integer.parseInt(System.console().readLine());
      if (((num_usuario % 2) == 0) || (num_usuario < 3)) {
        flag = true;
        System.out.println("Error, la altura del rombo tiene que ser impar y mayor que 3.");
      }
    } while (flag);
    int mitad = (num_usuario / 2) + 1;
    int i = 1;
    for (i = i; i <= mitad; i++) {
      int j = 1;
      for (j = j; j <= (mitad - i); j++) {
        System.out.printf(" ");
      }
      System.out.printf("*");
      j++;
      for (j = j; j <= (mitad - 2 + i); j++) {
        System.out.printf(" ");
      }
      if (i != 1) {
        System.out.printf("*\n");
      } else {
        System.out.printf("\n");
      }
    }
    i--;
    i--;
    for (i = i; i >= 1; i--) {
      int j = 1;
      for (j = j; j <= (mitad - i); j++) {
        System.out.printf(" ");
      }
      System.out.printf("*");
      j++;
      for (j = j; j <= (mitad - 2 + i); j++) {
        System.out.printf(" ");
      }
      if (i != 1) {
        System.out.printf("*\n");
      } else {
        System.out.printf("\n");
      }
    }
  }
}

/*
 * Ejercicio 33
 * 
 * Dibuja una "U" con una altura dada
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio33 {
  public static void main(String[] args){
    System.out.printf("Introduzca la altura de la U: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    for (int i = 1; i <= num_usuario; i++) {
      if (i != num_usuario) {
        System.out.printf("*");
        for (int j = 1; j <= (num_usuario - 2); j++) {
          System.out.printf(" ");
        }
        System.out.printf("*\n");
      } else {
        System.out.printf(" ");
        for (int j = 1; j <= (num_usuario - 2); j++) {
          System.out.printf("*");
        }
        System.out.printf(" ");
      }
    }
  }
}

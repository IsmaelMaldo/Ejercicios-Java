/*
 * Ejercicio 31
 * 
 * Pinta una L de un tamaño dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio31 {
  public static void main(String[] args){
    System.out.printf("Introduzca la altura de la pirámide: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    for (int i = num_usuario; i > 1; i--) {
      System.out.println("*");
    }
    for (int i = ((num_usuario / 2) + 1); i > 0; i--) {
      System.out.printf("*");
    }
  }
}

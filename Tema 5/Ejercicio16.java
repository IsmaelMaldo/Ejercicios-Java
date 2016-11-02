/*
 * Ejercicio 16
 * 
 * Comprueba si un número es primo o no
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio16 {
  public static void main(String[] args){
    System.out.printf("Introduce un número:");
    int num_usuario = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    int i = num_usuario - 1;
    do {
      if ((num_usuario % i) == 0) {
        primo = false;
      }
      i--;
    } while (primo && (i > 1));
    if ((num_usuario == 2) || (num_usuario == 1) || (num_usuario == 0) || primo) {
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }
  }
}

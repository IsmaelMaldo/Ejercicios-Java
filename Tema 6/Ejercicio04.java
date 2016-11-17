/*
 * Ejercicio 4
 * 
 * Muestra 20 números al azar entre 0 y 10 separados por espacios
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio04 {
  public static void main(String[] args){
    for (int i = 0; i < 20; i++) {
      System.out.printf("%d ", (int)(Math.random() * 11));
    }
  }
}

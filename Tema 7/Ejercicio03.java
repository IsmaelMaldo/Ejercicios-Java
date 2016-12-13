/*
 * Ejercicio 3
 * 
 * Muestra los números introducidos por teclado en el orden inverso al
 * dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio03 {
  public static void main(String[] args){
    long[] num = new long[10];
    System.out.println("Introduce 10 número por teclado pulsando intro entre número y número");
    for (int i = 0; i < 10; i++) {
      num[i] = Long.parseLong(System.console().readLine());
    }
    for (int i = 9; i >= 0; i--) {
      System.out.printf("%d ", num[i]);
    }
  }
}

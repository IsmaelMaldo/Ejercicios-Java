/*
 * Ejercicio 12
 * 
 * Realiza un programa que llena la pantall de caracteres aleatorios
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio12 {
  public static void main(String[] args){
    while (true) {
      System.out.printf("%s", (char)(Math.random() * 94 + 32));
    }    
  }
}

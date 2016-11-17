/*
 * Ejercicio 5
 * 
 * Muestra 50 números al azar entre 100 y 199 separados por espacios y
 * hace la media y muestra el mínimo y el máximo
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio05 {
  public static void main(String[] args){
    long media = 0;
    long max = 0;
    long min = 0;
    for (int i = 0; i < 50; i++) {
      int numero = ((int)(Math.random() * 100 + 100));
      System.out.printf("%d ", numero);
      media = media + numero;
      if (max < numero) {
        max = numero;
      }
      if (i == 0) {
        min = numero;
      } else if (min > numero) {
        min = numero;
      }
    }
    System.out.println("\nLa media es de " + media / 50);
    System.out.println("El máximo es " + max);
    System.out.println("El mínimo es " + min);
  }
}

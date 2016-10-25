/*
 * Ejercicio 11
 * 
 * Programa que calcula la media a partir de una cantidad de números dados
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio11 {
  public static void main(String[] args){
    System.out.printf("Introduce un número: ");
    double num_usuario = Double.parseDouble(System.console().readLine());
    System.out.println("Número----Cuadrado----Cubo");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%6.2f----%8.2f----%.2f\n", num_usuario, Math.pow(num_usuario, 2), Math.pow(num_usuario, 3));
      num_usuario++;
    }
  }
}

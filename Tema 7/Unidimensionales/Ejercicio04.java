/*
 * Ejercicio 4
 * 
 * Muestra un array de números aleatorios entre 0 y 100 con sus
 * respectivos cuadrados y cubos
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio04 {
  public static void main(String[] args){
    int hi = Integer.parseInt(System.console().readLine());
    int[] numero = new int[20];
    double[] cuadrado = new double[20];
    double[] cubo = new double[20];
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 101);
    }
    for (int i = 0; i < 20; i++) {
      cuadrado[i] = Math.pow(numero[i], 2);
    }
    for (int i = 0; i < 20; i++) {
      cubo[i] = Math.pow(numero[i], 3);
    }
    System.out.printf("┌╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┬╌╌╌╌╌╌╌┐\n╎");
    
    for (int n : numero){
      System.out.printf("%7d╎", n);
    }
    System.out.printf("\n├╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┤\n╎");
    for (double n : cuadrado){
      System.out.printf("%7.0f╎", n);
    }
    System.out.printf("\n├╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┼╌╌╌╌╌╌╌┤\n╎");
    for (double n : cubo){
      System.out.printf("%7.0f╎", n);
    }
    System.out.println("\n└╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┴╌╌╌╌╌╌╌┘");
  }
}

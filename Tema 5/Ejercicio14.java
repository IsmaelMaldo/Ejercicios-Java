/*
 * Ejercicio 14
 * 
 * Calula la potencia a partir de una base dada y un exponente.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio14 {
  public static void main(String[] args){
    System.out.printf("Introduce una base:");
    int base = Integer.parseInt(System.console().readLine());
    int exponente = 0;
    do {
      System.out.printf("Introduce un exponente (entero positivo):");
      exponente = Integer.parseInt(System.console().readLine());
    } while (exponente < 0);
    int res = 1;
    for (int i = 0; i < exponente; i++) {
      res = res * base;
    }
    System.out.println("El resultado es: " + res);
  }
}

/*
 * Ejercicio 19
 * 
 * Programa que genera 50 números aleatorios entre el -100 y el 200,
 * ambos incluidos, y luego muestra el número máximo de los pares y
 * el número mínimo de los impares, y por último muestra la media de
 * todos los números generados
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio19 {
  public static void main(String[] args){
    int max = -100;
    int min = 200;
    int suma = 0;
    for (int i = 0; i < 50; i++) {
      int numero = (int)(Math.random() * 302 - 101);
      System.out.printf("%d ", numero);
      if (((numero % 2) == 0) && (max < numero)) {
        max = numero;
      }
      if (((numero % 2) != 0) && (min > numero)) {
        min = numero;
      }
      suma += numero;
    }
    System.out.println("\nEl número máximo de los pares es " + max);
    System.out.println("El número mínimo de los impares es " + min);
    System.out.println("La media de todos los números generados es " + (suma / 50));
  }
}


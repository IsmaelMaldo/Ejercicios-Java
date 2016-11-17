/*
 * Ejercicio 1
 * 
 * Hace tres tiradas de dados, las muestra por pantalla y suma dichas
 * tiradas
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio01 {
  public static void main(String[] args){
    int suma = 0;
    for (int i = 1; i <= 3; i++) {
      int numero = (int)(Math.random()*6 + 1);
      suma = suma + numero;
      System.out.printf("%d ", numero);
    }
    System.out.printf("\nLa suma de las tiradas es %d", suma);
  }
}
